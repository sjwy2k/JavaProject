package com.abstractobj.model.vo;

public class Dog extends Animal{

	public Dog() {}
	
	public Dog(String type, String name, String gender, int size) {
		//abstract Ŭ������ �ڽ��� ���ؼ��� ���� ����
		super(type, name, gender, size);
		
	}
	
	public void bark() {
		System.out.println("�۸�! ������!");
	}
	
	//��ӹ��� �޼��� ����
	@Override
	public void howl() {
		System.out.println("�۸�! �۸�!");
	}
}
