package com.suhas.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	// http://localhost:8000/home?sid=1&name=suhas&subject=maths
	
	@RequestMapping(value = {"home", "/"})
	public ModelAndView home(Student student) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", student);
		mv.setViewName("home");
		return mv;
	}
}
