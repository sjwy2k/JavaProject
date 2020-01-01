package com.object.ex.controller;

public class ObjectExample {
	
	
	public String joinMsg(String msg1, String msg2) {
		return msg1+msg2;
	}
	
	public int sumInt(int a, int b) {
		if(a<=b) {
//			System.out.println("첫번째 수가 두번째 수보다 작거나 같습니다");
			return 0;
		} else {
			return a+b;
		}
	}
	
	public boolean isUpperCase(char ch) {
		boolean flag=false;
		if(ch>='A'&&ch<='Z') {
			System.out.println(ch+"는 대문자입니다.");
			flag=true;
		} else {
			System.out.println(ch+"는 대문자가 아닙니다.");
			flag=false;
		}
		return flag;
	}
}
