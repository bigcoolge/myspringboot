package com.bigcoolge.practice.myspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bigcoolge.practice.myspringboot.model.User;
import com.bigcoolge.practice.myspringboot.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(path = "/users/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable Long id) {
		User user = userService.getUser(id);
		return user;
	}
}
