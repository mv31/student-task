package com.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import com.app.service.StudentRegistrationService;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {
	
	
	@Autowired
	private StudentRepository repo;

	@Override
	public Student fetchStudentByEmailId(String emailId, Student student) throws Exception {
		
		Student studobj = null;
		if(emailId != null && !"".equals(emailId)) {
			 studobj = repo.findByEmailId(emailId);
			if(studobj != null) {
				throw new Exception("User with "+emailId+" is already exist");
			}
			
		}
		return  repo.save(student);
	}

	@Override
	public Student fetchStudentByEmailIdAndPassword(String emailId, String password) throws Exception {
		
		Student studobj = null;
		if(emailId != null && password !=null) {
			studobj = repo.findByEmailIdAndPassWord(emailId, password);
		}
		if(studobj == null) {
			throw new Exception("Invalid Credentials");
		}
		
		return studobj;
		
	}

}
