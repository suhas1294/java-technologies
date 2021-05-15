package com.suhas.demo.controller;

import java.sql.Savepoint;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.io.JsonStringEncoder;
import com.suhas.demo.dao.StudentRepo;
import com.suhas.demo.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return repo.findAll();
	}
	
	@GetMapping("/students/{sid}")
	public Optional<Student> getStudent(@PathVariable("sid") int sid) {
		return repo.findById(sid); 
	}
		
	@PostMapping(path="/student/new", consumes={"application/json"})
	public Student addStudent(@RequestBody Student student){
		repo.save(student);
		return student;
	}
	
	@DeleteMapping("/student/{sid}")
	public String deleteStudent(@PathVariable int sid) {
		Student student = repo.findById(sid).orElse(null);
		if (student != null) {
			repo.delete(student);
		}
		return "Deleted";
	}
	
	@PutMapping("/student/{sid}")
	public Student updateStudent(@RequestBody Student student) {
		repo.save(student);
		return student;
	}
}
