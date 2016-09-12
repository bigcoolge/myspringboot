package com.bigcoolge.practice.myspringboot.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "authors")
public class AuthorPojo {
	
	private String name;
	@Id
	private Integer number;
	private Integer age;
	private String gender;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
	@JsonManagedReference
	@CollectionTable(name = "books", joinColumns=@JoinColumn(name = "author_no"))
	private List<BookPojo> books;
	
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
	public List<BookPojo> getBooks() {
		return books;
	}
	public void setBooks(List<BookPojo> books) {
		this.books = books;
	}
}
