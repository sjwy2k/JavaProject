package com.animal.model.vo;

public class Cat extends Animal{

	public Cat() {
		this.setName("�����");
		this.setType("����̰�");
		this.setFootNum(4);
	}
	
	public Cat(String name, String type, int footNum) {
		super(name, type, footNum);
	}
	
	@Override
	public void action() {
		System.out.println("�߿� �����~");
	}
}
