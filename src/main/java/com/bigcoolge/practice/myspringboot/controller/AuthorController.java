package com.bigcoolge.practice.myspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigcoolge.practice.myspringboot.model.Author;
import com.bigcoolge.practice.myspringboot.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	
	@RequestMapping(value = "/authors/{number}")
	public Author getAuthor(@PathVariable Integer number) {
		return authorService.getAuthor(number);
	}
}
