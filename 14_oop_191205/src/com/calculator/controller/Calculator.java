package com.calculator.controller;

import java.util.Scanner;

public class Calculator {
	//사칙연산 - 더하기 빼기 곱하기 나누기
	private int su, su2;
	public Calculator() {} //기본생성자
	
	
//	private void inputSu() { //계산할 값 입력. 중복코드 메서드로 빼내어 호출
//		Scanner sc=new Scanner(System.in);
//		System.out.print("정수 : ");
//		su=sc.nextInt();
//		System.out.print("정수 : ");
//		su2=sc.nextInt(); 
//	}
	
	public int inputSu() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 : ");
		su=sc.nextInt();
		if(su<=0) {
			System.out.println("0보다 작은 수를 입력하면 안됩니다."
					+ " \n입력값을 1로 초기화합니다.");
			su=1;
		}
		return su; 
	}
	
//	public int plus() {		
////		inputSu();//호출
////		int result=su+su2;
////		return result;
//		
//		return inputSu()+inputSu();
//	}
	
		
//	public int minus() {
////		inputSu();
////		int result=su-su2;
////		return result;
//		return inputSu()-inputSu();
//	}
//	
//	
//	public int complex() {
////		inputSu();
////		int result=su*su2;		
////		return result;
//		return inputSu()*inputSu();
//	}
//	
//	
//	public double divide() {
////		inputSu();
////		double result=Math.round(su*1.0/su2*100)/100;
////		return result;
//		return Math.round(inputSu()/inputSu()*100.0)/100;
//	}
	

	
	//매개변수가 있는 메소드로 계산하기
	public int plus(int a, int b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	
	public int complex(int a, int b) {
		return a*b;
	}
	
	public double divide(int a, int b) {
		return (double)a/b;
	}
}
