package com.kh.member.controller;

public class Member {

	private String id;
	private String pw;
	private int age;
	private String address;
	private String phone;
	private char gender;
	
	
	public Member() { }
	
	public Member(String id, String pw, int age, String address, String phone, char gender) {
		this.id=id;
		this.pw=pw;
		this.age=age;
		this.address=address;
		this.phone=phone;
		this.gender=gender;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
