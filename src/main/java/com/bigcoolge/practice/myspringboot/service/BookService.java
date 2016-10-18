package com.bigcoolge.practice.myspringboot.service;

import java.util.ArrayList;
import java.util.List;

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

	public List<Book> getBooks(String name, String publisher) {
		List<BookPojo> list = new ArrayList<BookPojo>();
		if(publisher == null) {
			list = bookHome.findByName(name);
		}
		else {
			list = bookHome.findByNameAndPublisher(name, publisher);
		}

		List<Book> result = new ArrayList<>();
		for(BookPojo pojo : list) {
			result.add(wrap(pojo));
		}
		
		return result;
	}

	public Long countBooks(String publisher) {
		return bookHome.countByPublisher(publisher);
	}
	
	private Book wrap(BookPojo pojo) {
		return dozerMapper.map(pojo, Book.class);
	}
}
