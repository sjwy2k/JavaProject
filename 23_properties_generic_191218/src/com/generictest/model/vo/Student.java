package com.generictest.model.vo;

public class Student {

	private String name;
	private int age;
	private int ban;
	private int grade;
	private String phoneNum;
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", ban=" + ban + ", grade=" + grade + ", phoneNum=" + phoneNum
				+ "]";
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, int ban, int grade, String phoneNum) {
		super();
		this.name = name;
		this.age = age;
		this.ban = ban;
		this.grade = grade;
		this.phoneNum = phoneNum;
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
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	
	
}
