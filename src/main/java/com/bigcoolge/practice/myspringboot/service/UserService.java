package com.bigcoolge.practice.myspringboot.service;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigcoolge.practice.myspringboot.entity.UserPojo;
import com.bigcoolge.practice.myspringboot.model.User;
import com.bigcoolge.practice.myspringboot.repository.UserRepository;

@Service
public class UserService {
	
	private static Logger log =  Logger.getLogger(UserService.class.getName());
	
	@Autowired
	private UserRepository userHome;
	@Autowired
	private Mapper dozerMapper;
	
	@PersistenceContext
	private EntityManager em;
	
	public User getUser(Long id) {
		UserPojo pojoem = em.find(UserPojo.class, id); 
		log.info("tom ======= EntityManage is " + em);
		log.info("tom ======= pojoem is " + pojoem);
		
		UserPojo pojo = userHome.findOne(id);
		log.info("tom ======= pojo is " + pojo);
		return wrap(pojo);
	}
	
	private User wrap(UserPojo p) {
		if(p != null) {
			return dozerMapper.map(p, User.class);
		}
		return null;			
	}
}
