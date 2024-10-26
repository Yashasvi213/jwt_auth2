package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Faculty;
import com.example.demo.repository.FacultyRepository;

@Service
public class FacultyService {
	@Autowired
	FacultyRepository fser;

	public FacultyService(FacultyRepository fser,List<Faculty>f) {
		super();
		this.fser = fser;
		this.f=f;
	}
	List<Faculty>f = new ArrayList<Faculty>();
	public FacultyService(){
		f.add(new Faculty("1","Jitendra","abcgmail","chemistry"));
		f.add(new Faculty("2","rachna","abcgmaill","physic"));
		f.add(new Faculty("3","vaibhav sir","afbcgmail","dsa"));
		
	}
	public List<Faculty> show(){
		return this.f;
	}
}
