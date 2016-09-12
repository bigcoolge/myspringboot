package com.bigcoolge.practice.myspringboot.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "books")
public class BookPojo {
	@Id
	private String number;
	private String name;
	private String publisher;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "pub_date")
	private Date pubDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_no")
	@JsonBackReference
	private AuthorPojo author;

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

	public AuthorPojo getAuthor() {
		return author;
	}
	
	public void setAuthor(AuthorPojo author) {
		this.author = author;
	}
}
