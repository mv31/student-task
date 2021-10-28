package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;

import com.app.service.StudentRegistrationService;


@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	private StudentRegistrationService regService;
	
	@PostMapping("/registeruser")
	public Student registerUser(@RequestBody Student student) throws Exception {
		String tempEmail = student.getEmailId();
		return regService.fetchStudentByEmailId(tempEmail,student);
		
	}
	
	@PostMapping("/login")
	public Student loginUser(@RequestBody Student student) throws Exception {
		String tempEmail = student.getEmailId();
		String tempPass = student.getPassWord();
		
		return regService.fetchStudentByEmailIdAndPassword(tempEmail, tempPass);
	}

}
