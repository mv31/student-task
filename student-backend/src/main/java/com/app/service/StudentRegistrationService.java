package com.app.service;

import org.springframework.stereotype.Service;

import com.app.model.Student;

@Service
public interface StudentRegistrationService {
	
	public Student fetchStudentByEmailId(String emailId, Student student) throws Exception;
	public Student fetchStudentByEmailIdAndPassword(String emailId,String password) throws Exception;
	

}
