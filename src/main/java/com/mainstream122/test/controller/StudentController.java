package com.mainstream122.test.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mainstream122.test.model.StudentMo;
import com.mainstream122.test.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String index() {
		return "student/detl";
	}
	
	@RequestMapping("/student/{studentId}") 
	public ModelAndView showStudentDetl(@PathVariable(value="studentId") int studentId) {
		ModelAndView mav = new ModelAndView();
		StudentMo studentMo = studentService.findByStudentId(studentId);
		System.out.println(studentMo.getName());
		mav.addObject("student", studentMo);
		mav.setViewName("student/detl");
		return mav;
	}
}
