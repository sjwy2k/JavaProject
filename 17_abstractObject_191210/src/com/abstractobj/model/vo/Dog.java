package com.abstractobj.model.vo;

public class Dog extends Animal{

	public Dog() {}
	
	public Dog(String type, String name, String gender, int size) {
		//abstract 클래스는 자식을 통해서만 생성 가능
		super(type, name, gender, size);
		
	}
	
	public void bark() {
		System.out.println("멍멍! 강아지!");
	}
	
	//상속받은 메서드 구현
	@Override
	public void howl() {
		System.out.println("멍멍! 멍멍!");
	}
}
