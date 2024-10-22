package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Faculty;
import com.example.demo.model.User;
import com.example.demo.service.FacultyService;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/home")

public class HomeController {
	@Autowired
	UserService userservice;
	@Autowired
	FacultyService frepo;

	@GetMapping("/user")
	public List<User> showuser() {
		return userservice.showuser();
	}
	@PostMapping("/create")
	public String createUser(User u) {
		return userservice.createUser(u);
	}
	@GetMapping("/faculty")
	@PreAuthorize("hasRole('FACULTY')")
	public List<Faculty> show() {
		return frepo.show();
	}
	
}
