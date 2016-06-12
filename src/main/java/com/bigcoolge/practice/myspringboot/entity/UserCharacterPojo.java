package com.bigcoolge.practice.myspringboot.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserCharacterPojo {
//	@Column(name = "user_id")
//	private Long userId;
//	@Column(name = "char_id")
//	private Long charId;
	@Column(name = "char_value")
	private String charValue;
	private String unit;

//	public Long getUserId() {
//		return userId;
//	}
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
//	public Long getCharId() {
//		return charId;
//	}
//	public void setCharId(Long charId) {
//		this.charId = charId;
//	}
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
