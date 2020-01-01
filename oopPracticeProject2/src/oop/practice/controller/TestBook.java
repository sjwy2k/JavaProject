package oop.practice.controller;

import oop.practice.model.Book;

public class TestBook {
	public static void main(String[] args) {
		Book bk=new Book();
		Book bk2=new Book("³ú¸¦ ÀÚ±ØÇÏ´Â JAVA",20000,0.2,"±èÀ±¿µ");
		
		bk.bookInformation();
		bk2.bookInformation();
		
		bk.setTitle("ÀÚ¹ÙÀÇ Á¤¼®");
		bk.setPrice(35000);
		bk.setDiscountRate(0.1);
		bk.setAuthor("À±»ó¼·");
		bk.bookInformation();
		
		System.out.println("µµ¼­¸í: "+bk.getTitle());
		System.out.println(bk.getPrice()*(1-bk.getDiscountRate())+"¿ø" );
		System.out.println("µµ¼­¸í: "+bk2.getTitle());
		System.out.println(bk2.getPrice()*(1-bk2.getDiscountRate())+"¿ø");

		
	}
}
