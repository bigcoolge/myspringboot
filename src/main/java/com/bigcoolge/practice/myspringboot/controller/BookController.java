package com.bigcoolge.practice.myspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bigcoolge.practice.myspringboot.model.Book;
import com.bigcoolge.practice.myspringboot.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@Description("this controller is NOT necessary, because Book object is in the Author object")
	@RequestMapping(value = "/books/{number}")
	public Book getBook(@PathVariable String number) {
		
		return bookService.getBook(number);
	}
	
	@RequestMapping(value = "/books")
	public List<Book> getBooks(@RequestParam String name, @RequestParam(required = false) String publisher) {
		return bookService.getBooks(name, publisher);
	}
	
	@RequestMapping(value = "/{publisher}/books")
	public Long countBooks(@PathVariable String publisher) {
		return bookService.countBooks(publisher);
	}
}
