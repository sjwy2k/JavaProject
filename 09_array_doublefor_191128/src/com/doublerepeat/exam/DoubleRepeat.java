package com.doublerepeat.exam;

import java.util.Scanner;

public class DoubleRepeat {

	public void ex01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 입력 : ");
		int input=sc.nextInt();
		
		if(input<1) {
			System.out.println("양수가 아닙니다.");
		} else {
			for(int i=0; i<input; i++) {
				for(int j=0; j<i+1; j++) {
					if(i==j) System.out.print(i+1);
					else System.out.print("*");
				}
				System.out.println();
			}
		}
		
	}

	public void ex02() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input=sc.nextInt();
		if(input<1) {
			System.out.println("양수가 아닙니다.");
		} else {
			for(int i=0; i<input; i++) {
				for(int j=1; j<input+1; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
	}

	public void ex03() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input=sc.nextInt();
		
		if(input>0) {
			for(int i=0; i<input; i++) {
				for(int j=0; j<i+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if(input<0) {
			for(int i=0; i<-input; i++) {
				for(int k=0; k<i; k++) {
					System.out.print(" ");
				}
				for(int j=-input; j>i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("출력 기능이 없습니다");
		}
		
	}

	public void ex04() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input=sc.nextInt();
		
		if(input>0) {
			for(int i=1; i<input; i++) {
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=0; i<input; i++) {
				for(int k=0; k<i; k++) {
					System.out.print(" ");
				}
				for(int j=input; j>i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("출력 기능이 없습니다");
		}
	}
	
	public void ex05() {
		System.out.println("Q1");
		int input=5;
		for(int i=0; i<input; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("Q2");
		for(int i=0; i<input; i++) {
			System.out.println("*");
		}
		System.out.println("Q3");
		for(int i=0; i<input; i++) {
			for(int j=0; j<input; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q4");
		for(int i=0; i<input; i++) {
			for(int j=0; j<input; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		System.out.println("Q5");
		for(int i=0; i<input; i++) {
			for(int j=0; j<input; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		System.out.println("Q6");
		for(int i=0; i<input; i++) {
			for(int j=0; j<input; j++) {
				System.out.print(i+j+1);
			}
			System.out.println();
		}
		System.out.println("Q7");
		for(int i=input; i>0; i--) {
			for(int j=0; j<input; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
		System.out.println("Q8");
		for(int i=0; i<input; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q9");
		for(int i=0; i<input; i++) {
			for(int j=input; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q10");
		for(int i=0; i<input; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=input; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q11");
		for(int i=0; i<input; i++) {
			for(int k=input; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
