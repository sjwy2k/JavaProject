package day3.book.controller;

import day3.book.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b=new Book();
		Book b2=new Book("완벽한공부법", "로크미디어", "신영준고영성");
		Book b3=new Book("일취월장", "로크미디어", "신영중고영성", 18000, 0.25);
		
		System.out.println(b2.infomation(b2));
		System.out.println(b3.infomation(b3));
		
	}

}
