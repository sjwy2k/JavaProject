package com.emp.model.vo;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 4662445301940566346L;
	private String name;
	private int grade;
	private int ban;
	private int age;
	private String address;
	private String phone;
	///己利包府
	private int kor;
	private int eng;
	private int math;
	private int coding; 
	
	public Student() {}
	
	public Student(String name, int grade, 
			int ban, int age, String address, 
			String phone) {
		this.name=name;
		this.grade=grade;
		this.ban=ban;
		this.age=age;
		this.address=address;
		this.phone=phone;
	}

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public int getGrade() {
		return grade;
	}
	public void setBan(int ban) {
		this.ban=ban;
	}
	public int getBan() {
		return ban;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	public void setPhoone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setKor(int kor) {
		this.kor=kor;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public int getEng() {
		return eng;
	}
	public void setMath(int math) {
		this.math=math;
	}
	public int getMath() {
		return math;
	}
	public void setCoding(int coding) {
		this.coding=coding;
	}
	public int getCoding() {
		return coding;
	}
	public String printStudent() {
		return name+"\t"+grade+"\t"+ban+"\t"+
				age+"\t"+address+"\t"+phone+
				"\t"+kor+"\t"+eng+"\t"+math+"\t"+
				coding;
	}
	
	
}
