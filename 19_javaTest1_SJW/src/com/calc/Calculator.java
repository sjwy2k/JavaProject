package com.calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int input=sc.nextInt();
		int input2=0;
		do {
			System.out.print("두번째 정수 입력 : ");
			input2=sc.nextInt();
			if(input2!=0) {
				break;
			} else {
				System.out.println("입력값은 0보다 더 큰 수를 입력해야 합니다.");
			}
		}while(true);
		
		
		System.out.println("합 : "+(input+input2));
		System.out.println("차 : "+(input-input2));
		System.out.println("곱 : "+(input*input2));
		System.out.println("나누기 : "+(input/input2));
		
	}
}
