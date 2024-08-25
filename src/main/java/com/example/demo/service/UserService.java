package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService {
	List<User>store= new ArrayList<>();
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "Yashasvi Sharma", "yashasvisharma1369@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Aparna Sharma", "aparnasharma1369@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Eshika Sharma", "eisharma13699@gmail.com"));
	}
	public List<User> showuser(){
		return this.store;
	}

}
