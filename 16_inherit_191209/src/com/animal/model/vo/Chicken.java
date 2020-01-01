package com.animal.model.vo;

public class Chicken extends Animal{

	public Chicken() {
		this.setName("´ß");
		this.setType("´ß°ú");
		this.setFootNum(2);
	}
	
	public Chicken(String name, String type, int footNum) {
		super(name, type, footNum);
	}
	
	@Override
	public void action() {
		System.out.println("²¿³¢¿À~ ´ß~");
	}
}
