package com.animal.model.vo;

public class Cat extends Animal{

	public Cat() {
		this.setName("고양이");
		this.setType("고양이과");
		this.setFootNum(4);
	}
	
	public Cat(String name, String type, int footNum) {
		super(name, type, footNum);
	}
	
	@Override
	public void action() {
		System.out.println("야옹 고양이~");
	}
}
