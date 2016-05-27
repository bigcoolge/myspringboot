package com.bigcoolge.practice.myspringboot.service;


import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigcoolge.practice.myspringboot.entity.UserPojo;
import com.bigcoolge.practice.myspringboot.model.User;
import com.bigcoolge.practice.myspringboot.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userHome;
	@Autowired
	private Mapper dozerMapper;
	
	public User getUser(Long id) {
		UserPojo pojo = userHome.findOne(id);
		
		return wrap(pojo);
	}
	
	private User wrap(UserPojo p) {
		if(p != null) {
			return dozerMapper.map(p, User.class);
		}
		return null;			
	}
}
