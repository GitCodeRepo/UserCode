package com.mongodb.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.api.model.User;
import com.mongodb.api.service.UserService;
@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/getAllUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@PostMapping("/addUser")
	public User createUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

}
