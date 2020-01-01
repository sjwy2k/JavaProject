package com.substream.model.vo;

import java.io.Serializable;

//객체 직렬화 처리하기! IO에서 객체를 전송할때 직렬화를해야한다.
public class Person implements Serializable{
	

	//UID 자동부여
	private static final long serialVersionUID = -6893716200381925039L;
	
	private String name;
	private int age;
	private char gender;
	private double height;
	
	public Person() {}
	
	
	public Person(String name, int age, char gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	


	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + "]";
	}
	
	
}
