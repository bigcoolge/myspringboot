package com.bigcoolge.practice.myspringboot.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bigcoolge.practice.myspringboot.model.User;
import com.bigcoolge.practice.myspringboot.service.UserService;

@RestController
public class UserController {
	
	private static Logger log =  Logger.getLogger(UserController.class.getName());

	@Autowired
	private UserService userService;
	
	@PersistenceContext
	private EntityManager em;
	
	@RequestMapping(path = "/users/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable Long id) {
		log.info("tom ======= EntityManage is " + em);
		User user = userService.getUser(id);
		return user;
	}
}
