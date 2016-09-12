package com.bigcoolge.practice.myspringboot.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Book {
	private String number;
	private String name;
	private String publisher;
	private Date pubDate;
	
	@JsonBackReference
	private Author author;

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}

}
