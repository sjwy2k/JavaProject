package com.calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ù��° ���� �Է� : ");
		int input=sc.nextInt();
		int input2=0;
		do {
			System.out.print("�ι�° ���� �Է� : ");
			input2=sc.nextInt();
			if(input2!=0) {
				break;
			} else {
				System.out.println("�Է°��� 0���� �� ū ���� �Է��ؾ� �մϴ�.");
			}
		}while(true);
		
		
		System.out.println("�� : "+(input+input2));
		System.out.println("�� : "+(input-input2));
		System.out.println("�� : "+(input*input2));
		System.out.println("������ : "+(input/input2));
		
	}
}
