package oop.practice.controller;

import oop.practice.model.Book;

public class TestBook {
	public static void main(String[] args) {
		Book bk=new Book();
		Book bk2=new Book("���� �ڱ��ϴ� JAVA",20000,0.2,"������");
		
		bk.bookInformation();
		bk2.bookInformation();
		
		bk.setTitle("�ڹ��� ����");
		bk.setPrice(35000);
		bk.setDiscountRate(0.1);
		bk.setAuthor("����");
		bk.bookInformation();
		
		System.out.println("������: "+bk.getTitle());
		System.out.println(bk.getPrice()*(1-bk.getDiscountRate())+"��" );
		System.out.println("������: "+bk2.getTitle());
		System.out.println(bk2.getPrice()*(1-bk2.getDiscountRate())+"��");

		
	}
}
