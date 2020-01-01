package com.obj.controller;

public class Overloading {

	public void print(String msg) {
		System.out.println(msg);
	}
	
	//오버로딩-중복 정의
	public void print(int msg) {
		System.out.println(msg);
	}
	
	//매개변수가 달라도 된다.
	public void print(String msg, int msg2) {
		
	}
}
