package com.obj.controller;

public class Person {

	//멤버변수 입력 사람을 실체화할 데이터
	//접근제한자는 변수에 직접접근이 가능한지에 따라서 구분
//	public String name; //public : 모든 곳에서 직접접근 가능
//	protected int age; //protected : 같은 패키지, 후손 클래스
//	String jumin; //(default) : 같은 패키지
//	private char gender; //private : 내부에서만 접근(중괄호 안)
	
	
	//생성자 내부에서 접근하는 것을 의미
//	public Person() {
//		gender='남';
//	}
	
	//내부에서 멤버변수에 접근하려면
	//메서드 내부에서 접근하거나
//	public void accessTest() {
//		gender='남';
//		System.out.println(gender);
//	}
//	
//
//	public int getAge() {
//		return age;
//	}
//	
//	public void setAge(int age) {
//		this.age=age;
//	}
//	
	
	//private로 데이터 접근을 막아놓은 것을
	//메서드를 통해 접근하게 만듬	
	//내부에서만 접근가능
	private String name;
	private int age;
	private String jumin;
	private char gender;
	
	//getter, setter
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
	
	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
	//getter
	public char getGender() { //값을 가져오기
		return gender;
	}
	//setter
	public void setGender(char gender) {//값을 대입하기
		this.gender=gender;
	}


	
	
}
