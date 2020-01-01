package com.emp.model.vo;

public class Student {
	//이름, 주소, 연락처
	//학년, 반, 나이, 국어, 영어, 수학
	private String name, address, phone;
	private int grade, ban, age, kor, eng, math,coding;
	
	//생성자
	public Student() {}
	//para생성자
	public Student(String name, int grade, int ban, int age, String address, String phone) {
		this.name=name;
		this.grade=grade;
		this.ban=ban;
		this.age=age;
		this.address=address;
		this.phone=phone;
	}
	
	@Override
	public String toString() {
		return name+"\t"+grade+"\t"+ban+"\t"+age+"\t"
				+address+"\t"+kor+"\t"+eng+"\t"+math+"\t"+coding;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String printStudent() {
		return name+"\t"+grade+"\t"+ban+"\t"+age+"\t"+address+"\t"+phone+"\t"+kor+"\t"+eng+"\t"+math+"\t"+coding;
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getCoding() {
		return coding;
	}
	public void setCoding(int coding) {
		this.coding = coding;
	}
}
