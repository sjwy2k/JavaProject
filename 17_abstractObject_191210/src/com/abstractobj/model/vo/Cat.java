package com.abstractobj.model.vo;

public class Cat extends Animal{

	public Cat() {}
	
	public Cat(String type, String name, String gender, int size) {
		super(type, name, gender, size);
	}
	
	public void meow() {
		System.out.println("�Ŀ�! �����!");
	}
	
	//��ӹ��� �޼��� ����
	@Override
	public void howl() {
		System.out.println("�߿�! �߿�!");
	}
	
	
}
