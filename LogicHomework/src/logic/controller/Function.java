package logic.controller;

import java.util.Scanner;

public class Function {
	public void calculator() {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int input1=sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int input2=sc.nextInt();
		System.out.print("연산문자 입력 : ");
		char op=sc.next().charAt(0);
		switch(op) {
			case '+':System.out.println(input1+" + "+input2+" = "+(input1+input2));break;
			case '-':System.out.println(input1+" - "+input2+" = "+(input1-input2));break;
			case 'x':
			case 'X':System.out.println(input1+" x "+input2+" = "+(input1*input2));break;
			case '/':
				if(input2==0) {
					System.out.println("0으로 나눌 수 없습니다.");
				} else {
					System.out.println(input1+" / "+input2+" = "+(input1/input2));
					break;
				}		
		}
	}
}
