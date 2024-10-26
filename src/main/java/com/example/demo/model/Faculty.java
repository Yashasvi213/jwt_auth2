package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


public class Faculty {
	private int uid;
	private String userid;
	private String name;
	private String email;
	private String subject;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Faculty(String userid, String name, String email, String subject) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.subject = subject;
	}
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
