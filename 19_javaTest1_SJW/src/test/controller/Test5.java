package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		int input=0, input2=0;
		while(!flag) { //옳은 값이 들어오지 않았다면 실행
			System.out.print("첫번째 정수 입력 : ");
			input=sc.nextInt();
			flag=checkNum2(input); //옳은 값이 들어오면 true
		}
		flag=false;
		while(!flag) { //옳은 값이 들어오지 않았다면 실행
			System.out.print("두번째 정수 입력 : ");
			input2=sc.nextInt();
			flag=checkNum2(input2);
		}
		
		int result=input*input2;
		System.out.println(result>9?"두자리 수 입니다":"한자리 수 입니다");
		
	}
	
	public static boolean checkNum(int num) {
		boolean flag=false;
		if(num!=0) {
			flag=true;
		} else {
			System.out.println("입력값은 0보다 더 큰 수를 입력해야 합니다.");		
		}
		return flag;
	}
	
	public static boolean checkNum2(int num) {
		boolean flag=false;
		if(num>0&&num<10) {
			flag=true;
		} else {
			System.out.println("입력값은 1과 9 사이의 수를 입력해야 합니다");		
		}
		return flag;
	}
}
