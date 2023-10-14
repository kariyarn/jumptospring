package com.mysite.sbb.user;

import lombok.Getter;

@Getter
public enum UserRole {
	/*
	 * enum은 열거 자료형이라는 뜻이라고 한다. 근데 열거 자료형은 무엇이지?
	 * Getter만 쓴 이유는 상수 자료형이기 때문이다.
	 */
	ADMIN("ROLE_ADMIN"),
	USER("ROLE_USER");
	
	UserRole(String value){
		this.value = value;
	}
	
	private String value;

}
