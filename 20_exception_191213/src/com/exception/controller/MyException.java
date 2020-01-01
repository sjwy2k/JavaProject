package com.exception.controller;

public class MyException extends Exception{
	
	//사용자 정의 예외
	public MyException() {}
	
	public MyException(String msg) {
		super(msg);
	}

}
