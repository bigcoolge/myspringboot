package com.bigcoolge.practice.myspringboot.service;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigcoolge.practice.myspringboot.entity.BookPojo;
import com.bigcoolge.practice.myspringboot.model.Book;
import com.bigcoolge.practice.myspringboot.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookHome;
	@Autowired
	private Mapper dozerMapper;
	
	public Book getBook(String number) {
		BookPojo pojo = bookHome.findOne(number);
		return wrap(pojo);
	}
	
	private Book wrap(BookPojo pojo) {
		return dozerMapper.map(pojo, Book.class);
	}
}
