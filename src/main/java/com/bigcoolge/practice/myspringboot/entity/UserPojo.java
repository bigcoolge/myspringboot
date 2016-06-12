package com.bigcoolge.practice.myspringboot.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserPojo {
	
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String gender;
	private Integer age;
	
	@ElementCollection(targetClass = UserCharacterPojo.class)
    @CollectionTable(name = "user_character", joinColumns = @JoinColumn(name = "user_id"))
	@MapKeyJoinColumn(name="char_id", referencedColumnName = "id")
	private Map<CharacteristicsPojo, UserCharacterPojo> characters = new HashMap<CharacteristicsPojo, UserCharacterPojo>();

	@ElementCollection
	@CollectionTable(name = "user_character", joinColumns = @JoinColumn(name = "user_id"))
	@MapKeyJoinColumn(name="char_id", referencedColumnName = "id")
	@Column(name="char_value")
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
	public Map<CharacteristicsPojo, UserCharacterPojo> getCharacters() {
		return characters;
	}
	public void setCharacters(Map<CharacteristicsPojo, UserCharacterPojo> characters) {
		this.characters = characters;
	}
	public Map<CharacteristicsPojo, String> getCharacterStrs() {
		return characterStrs;
	}
	public void setCharacterStrs(Map<CharacteristicsPojo, String> characterStrs) {
		this.characterStrs = characterStrs;
	}
}
