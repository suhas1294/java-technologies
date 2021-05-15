package com.suhas.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.suhas.demo.dao.StudentRepo;
import com.suhas.demo.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping(value = {"/", "home"})
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
		repo.save(student);
		return "home.jsp";
	}
	
	@RequestMapping("/getStudent")
	public ModelAndView getStudent(@RequestParam int sid) {
		ModelAndView mv = new ModelAndView("showStudent.jsp");
		Student student = repo.findById(sid).orElse(null);
		mv.addObject(student);
		return mv;
	}
	
	@RequestMapping("/customQuery1")
	public ModelAndView customQuery1(@RequestParam String subject, @RequestParam int sid) {
		
		// example : http://localhost:8000/customQuery1?subject=java&sid=2
		ModelAndView mv = new ModelAndView("customQuery1.jsp");
		
		// custom query 1
		List<Student> students = repo.findBySubject(subject);
		System.out.println(students);
		
		// custom query 2
		List<Student> students2 = repo.findBySidGreaterThan(sid);
		System.out.println(students2);
		
		// custom query 3
		List<Student> students3 = repo.findBySubjectSorted(subject);
		System.out.println(students3);
		
		mv.addObject(students);
		return mv;
	}
}
