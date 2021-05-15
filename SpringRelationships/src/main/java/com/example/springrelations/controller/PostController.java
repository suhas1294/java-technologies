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
import com.example.springrelations.model.Post;
import com.example.springrelations.repository.PostRepository;

@RestController
@RequestMapping("/api/v1")
public class PostController {
	
	@Autowired
	PostRepository postRepository;
	
	// getting a page of posts
	@GetMapping("/posts")
	public Page<Post> getAllPosts(Pageable pageable){
		return postRepository.findAll(pageable);
	}
	
	// creating a post
	@PostMapping("/posts")
	public Post createPost(@Valid @RequestBody Post post) {
		return postRepository.save(post);
	}
	
	// updating a post
	@PutMapping("/posts/{id}")
	public Post updatePost(@PathVariable(value = "id") Long postId ,@Valid @RequestBody Post postRequest) {
		Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post does not exist"));
		if (post != null) {
			post.setTitle(postRequest.getTitle());
			post.setDescription(postRequest.getDescription());
			postRepository.save(post);
			return post;
		}else {
			throw new ResourceNotFoundException("Post could not be updated");
		}
	}
	
	@DeleteMapping("/posts/{id}")
	public ResponseEntity<?> deletePost(@PathVariable(value = "id") Long postId){
		Post post = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post does not exists"));
		if (post != null) {
			postRepository.delete(post);
			return ResponseEntity.ok().build();
		}else {
			throw new ResourceNotFoundException("Post could not be deleted");
		}
	}

}
