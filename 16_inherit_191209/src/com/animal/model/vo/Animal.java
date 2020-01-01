package com.animal.model.vo;

public class Animal {

	private String name, type;
	private int footNum;
	
	public Animal() {}
	
	public Animal(String name, String type, int footNum) {
		super();
		this.name = name;
		this.type = type;
		this.footNum = footNum;
	}
	
	public void action() {
		System.out.println("울음소리~");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFootNum() {
		return footNum;
	}
	public void setFootNum(int footNum) {
		this.footNum = footNum;
	}
	
	
	
	
}
