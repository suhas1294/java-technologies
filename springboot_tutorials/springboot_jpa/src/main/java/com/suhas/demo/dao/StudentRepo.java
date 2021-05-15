package com.suhas.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.suhas.demo.model.Student;

// Student class whose primary Key is of Integer type
public interface StudentRepo extends CrudRepository<Student, Integer> {
	
	// custom query 1
	List<Student> findBySubject(String subject);
	
	// custom query 2
	List<Student> findBySidGreaterThan(int sid);
	
	// custom query 3
	@Query("from Student where subject = ?1 order by name")
	List<Student> findBySubjectSorted(String subject);
}