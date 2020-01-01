package com.stringtest;

import java.util.ArrayList;

public class WrapperTest {

	public static void main(String[] args) {
		
		//Wrapper클래스 형변환	
		int age=10;
		System.out.println(age);
		Integer ageObj=age;//autoBoxing 
		int age2=ageObj;//autoUnboxing
		age2=ageObj+10;//객체와 리터럴값 끼리의 계산도 가능하다.
		System.out.println(age2);
		
		test(20);
		test(age);
		test(ageObj);
		
		
		
		Double d=3.14;
		double dnum=d;
		
		//객체배열관리 ArrayList
		ArrayList list=new ArrayList();
		list.add(10);
		
		int a=Integer.parseInt("10");
		dnum=Double.parseDouble("180.5");
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		String ac=String.valueOf(dnum);
		
	}
	
	public static void test(Object obj) {
		System.out.println(obj);
	}
}
