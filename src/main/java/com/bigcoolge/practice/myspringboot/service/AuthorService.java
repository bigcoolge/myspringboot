package com.bigcoolge.practice.myspringboot.service;

import org.apache.log4j.Logger;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigcoolge.practice.myspringboot.entity.AuthorPojo;
import com.bigcoolge.practice.myspringboot.model.Author;
import com.bigcoolge.practice.myspringboot.repository.AuthorRepository;

@Service
public class AuthorService {

	private static Logger log =  Logger.getLogger(AuthorService.class);
	
	@Autowired
	private AuthorRepository authorHome;
	@Autowired
	private Mapper dozerMapper;
	
	public Author getAuthor(Integer number) {
		AuthorPojo pojo = authorHome.findOne(number);
		log.info("=========the date is " + pojo.getBooks().get(0).getPubDate());
		return wrap(pojo);
	}
	
	private Author wrap(AuthorPojo pojo) {
		return dozerMapper.map(pojo, Author.class);
	}
}
