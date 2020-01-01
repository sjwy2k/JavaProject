package com.obj.controller;

//어떤 클래스에서든 접근이 가능한 public클래스
public class AccessTest {
	//멤버 변수
	//클래스에 필요한 데이터를 보관하는 변수
	private String userId;
	private String password;
	private int age;
	
	//생성자
	//생성자는 객체를 new 연산자로 생성할 때 사용하는 것
	public AccessTest() {}; //디폴트생성자
	
	//기본적으로 데이터를 출력, 값 대입하는
	//getter, setter 만들어줌
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId=userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
}
