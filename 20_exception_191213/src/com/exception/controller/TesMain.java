package com.exception.controller;

public class TesMain {

	public static void main(String[] args) {
		try {
			throw new MyException("내가만든것!");
		} catch(MyException e) {
			e.printStackTrace();
		}
	}

}
