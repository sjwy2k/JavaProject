package com.method.controller;

import java.util.Scanner;

import com.method.controller.Method;

public class MethodTest {

	public void calculator() {
//		while(true) {
//			Method m=new Method();
//			m=input();
//		}
	}
	
	
	
	
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 : ");
//		setSu(sc.nextInt());
		System.out.print("연산자 입력(+,-,*,/) : ");
//		setOperator(sc.next().charAt(0));
		System.out.print("정수 입력 : ");
//		setSu(sc.nextInt());
		
	}
	
	public int plus(int su, int su2) {
		return su+su2;
	}
	
	public int minus(int su, int su2) {
		return su-su2;
	}
	
	public int complex(int su, int su2) {
		return su*su2;
	}
	
	public double divide(int su, int su2) {
		return (double)su/su2;
	}
	

}
