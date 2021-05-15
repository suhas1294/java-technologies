package com.suhas.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.suhas.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
