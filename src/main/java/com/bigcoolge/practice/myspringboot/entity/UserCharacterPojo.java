package com.bigcoolge.practice.myspringboot.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserCharacterPojo {
	@Column(name = "char_value")
	private String charValue;
	private String unit;


	public String getCharValue() {
		return charValue;
	}
	public void setCharValue(String charValue) {
		this.charValue = charValue;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}	
}
