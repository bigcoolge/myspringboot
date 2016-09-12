package com.bigcoolge.practice.myspringboot.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Author {
  	private String name;
	private Integer number;
	private Integer age;
	private String gender;
	
	@JsonManagedReference
	private List<Book> books;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
