package com.obj.main;

import com.obj.controller.Overloading;

public class OverloadMain {

	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.print("오늘 정말 춥네요!");
		o.print(10+20); 
		System.out.println("안녕하세요");
		System.out.println(10+20);
	}
}
