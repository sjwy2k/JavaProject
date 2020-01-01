package com.calculator.controller;

import java.util.Scanner;

public class CalculatorController {
	
	private Calculator c=new Calculator();
	
	//계산기 메뉴출력 메서드
	public void mainMenu() {
		do {
			System.out.println("=========나의 계산기=========");
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("0. 계산기 종료");
			System.out.print("입력 : ");
//			c.inputSu();
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			
//			switch(choice) {
//				case 1:System.out.println("더하기 결과 : " + c.plus()); break;
//				case 2:System.out.println("빼기 결과 : " + c.minus()); break;
//				case 3:System.out.println("곱하기 결과 : " + c.complex()); break;
//				case 4:System.out.println("나누기 결과 : " + c.divide()); break;
//				case 0:System.out.println("계산기 종료");return;
//			}
			
			switch(choice) {
				case 1:System.out.println("더하기 결과 : " + c.plus(c.inputSu(),c.inputSu())); break;
				case 2:System.out.println("빼기 결과 : " + c.minus(c.inputSu(),c.inputSu())); break;
				case 3:System.out.println("곱하기 결과 : " + c.complex(c.inputSu(),c.inputSu())); break;
				case 4:System.out.println("나누기 결과 : " + c.divide(c.inputSu(),c.inputSu())); break;
				case 0:System.out.println("계산기 종료");return;
			}
		}while(true);
		

	}
}
