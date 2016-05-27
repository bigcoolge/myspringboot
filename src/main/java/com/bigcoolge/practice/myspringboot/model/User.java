package com.bigcoolge.practice.myspringboot.model;

import java.util.HashMap;
import java.util.Map;

public class User {
	private Long id;
	private String name;
	private String gender;
	private Integer age;
	private transient Map<String, String> characters = new HashMap<String, String>();

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Map<String, String> getCharacters() {
		return characters;
	}
	public void setCharacters(Map<String, String> characters) {
		this.characters = characters;
	}
	
	
}
