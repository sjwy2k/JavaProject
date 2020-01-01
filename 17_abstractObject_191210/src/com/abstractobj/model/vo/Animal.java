package com.abstractobj.model.vo;

public abstract class Animal {

	private String type;
	private String name;
	private String gender;
	private int size;
	
	public Animal() {}

	public Animal(String type, String name, String gender, int size) {
		super();
		this.type = type;
		this.name = name;
		this.gender = gender;
		this.size = size;
	}
	
	
	//추상 메서드를 포함하면 반드시 추상클래스로 선언해야 함.
	public abstract void howl();
	
//	public abstract String printContent();
//	public abstract String printParam(String content);
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	
	
	
}
