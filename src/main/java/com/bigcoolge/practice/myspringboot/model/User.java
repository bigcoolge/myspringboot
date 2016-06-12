package com.bigcoolge.practice.myspringboot.model;

import java.util.HashMap;
import java.util.Map;

import com.bigcoolge.practice.myspringboot.entity.CharacteristicsPojo;

public class User {
	private Long id;
	private String name;
	private String gender;
	private Integer age;
	private Map<Characteristics, UserCharacter> characters = new HashMap<Characteristics, UserCharacter>();
	private Map<CharacteristicsPojo, String> characterStrs = new HashMap<CharacteristicsPojo, String>();
	

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
	public Map<Characteristics, UserCharacter> getCharacters() {
		return characters;
	}
	public void setCharacters(Map<Characteristics, UserCharacter> characters) {
		this.characters = characters;
	}
	public Map<CharacteristicsPojo, String> getCharacterStrs() {
		return characterStrs;
	}
	public void setCharacterStrs(Map<CharacteristicsPojo, String> characterStrs) {
		this.characterStrs = characterStrs;
	}
	
	
}
