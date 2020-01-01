package com.abstractobj.model.vo;

public class Cat extends Animal{

	public Cat() {}
	
	public Cat(String type, String name, String gender, int size) {
		super(type, name, gender, size);
	}
	
	public void meow() {
		System.out.println("냐옹! 고양이!");
	}
	
	//상속받은 메서드 구현
	@Override
	public void howl() {
		System.out.println("야옹! 야옹!");
	}
	
	
}
