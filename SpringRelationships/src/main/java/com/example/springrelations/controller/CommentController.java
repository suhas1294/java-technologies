package com.example.springrelations.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrelations.exception.ResourceNotFoundException;
import com.example.springrelations.model.Comment;
import com.example.springrelations.repository.CommentRepository;
import com.example.springrelations.repository.PostRepository;

@RestController
@RequestMapping("/api/v1")
public class CommentController {
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	CommentRepository commentRepository;
	
	// getting all comments of a particular post
	@GetMapping("/posts/{postId}/comments")
	public Page<Comment> getCommentsByPost(@PathVariable(value = "postId") Long postId, Pageable pageable){
		return commentRepository.findByPostId(postId, pageable);
	}
	
	// creating a comment for a post
	@PostMapping("/posts/{id}/comments")
	public Comment writeComment(@PathVariable(value = "id") Long postId,
			@Valid @RequestBody Comment commentRequest) {
		if (!postRepository.existsById(postId)) {
			throw new ResourceNotFoundException("Post does not exists any more !");
		}
		return postRepository.findById(postId).map(post -> {
			commentRequest.setPost(post);
			return commentRepository.save(commentRequest);
		}).orElseThrow(() -> new ResourceNotFoundException("Could not create comment on the post"));
	}
	
	// updating a comment 
	@PutMapping("/posts/{postId}/comments/{commentId}")
	public Comment updateComment(@PathVariable(name = "postId") Long postId, 
			@PathVariable(name = "commentId") Long commentId,
			@Valid @RequestBody Comment commentRequest) {
		
		if (!postRepository.existsById(postId)) {
			throw new ResourceNotFoundException("Post does not exists");
		}
		
		return commentRepository.findById(commentId).map(comment -> {
			comment.setText(commentRequest.getText());
			return commentRepository.save(comment);
		}).orElseThrow(() -> new ResourceNotFoundException("Comment could not be updated"));
	}
	
	// Deleting a comment
	@DeleteMapping("/posts/{postId}/comments/{id}")
	public ResponseEntity<?> deleteComment(@PathVariable(value = "id") Long commentId){
		if (commentRepository.existsById(commentId)) {
			commentRepository.deleteById(commentId);
			return ResponseEntity.ok().build();
		}else {
			throw new ResourceNotFoundException("Comment could not be deleted");
		}
	}
	

}
