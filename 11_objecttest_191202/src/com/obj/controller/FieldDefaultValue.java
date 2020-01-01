package com.obj.controller;

public class FieldDefaultValue {

	//기본 멤버변수 초기화 값
	//선언과 동시에 초기화 할 수 있는가? yes!
	//선언할때 대입연산자를 통해 값을 대입
	private String name;
	private int age;
	private double height;
	private float weight;
	private char gender;
	private boolean flag;
	private int[] lotto;
	
//	private String name="신재원";
//	private int age=33;
//	private double height=177.7;
//	private float weight=65.5f;
//	private char gender='남';
//	private boolean flag=false;

	//생성자를 작성해보자
	//1. default생성자
	//2. 매개변수가 있는 생성자(자동 default 생성자는 사라짐)
	//생성자는 멤버변수(필드)를 초기화시키는 역할을 하고
	//생성할 때 반드시 호출되는 것!
	public FieldDefaultValue() {
		
	}

	public FieldDefaultValue(String name, int age, double height, float weight, char gender, boolean flag, int[] lotto) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.gender=gender;
		this.flag=flag;
		this.setLotto(lotto);
	}
	
	
	//일부 데이터만 필요하다면 그 데이터만 받는 생성자를 만들어 주면 됨!
	public FieldDefaultValue(String name, int age) {
		this.name=name;
		if(age>19) {
			this.age=age;
		}
		
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public char getGender() {
		return gender;
	}
	
	public boolean getFlag() {
		return flag;
	}

	
	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
}
