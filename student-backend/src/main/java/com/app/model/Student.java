package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false,length = 20)
	private String name;
	
	@Column(nullable = false,unique = true, length = 30)
	private String emailId;
	
	@Column(nullable = false,length = 20)
	private String passWord;
	
	@Column(nullable = false,length = 10)
	private long contact;

	public Student(int id, String name, String emailId, String passWord, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.passWord = passWord;
		this.contact = contact;
	}
	
	public Student() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	

}
