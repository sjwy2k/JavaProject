﻿package com.obj.model.vo;

public class Member2 {

	private String id, pw, name, email, address;

	
	public Member2() {}
	
	public Member2(String id, String pw, String name, String email, String address) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.email=email;
		this.address=address;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
