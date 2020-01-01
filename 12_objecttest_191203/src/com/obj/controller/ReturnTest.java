package com.obj.controller;

import java.util.Scanner;

public class ReturnTest {

	//반환이란?
	//메서드가 호출된 곳으로 되돌아가는 것
	//반환할때는 return이라는 예약어를 사용
	//return에서 돌아갈 때는 가져갈 값에 대한 설정을 해야 함
	//가져갈 값에 대한 설정이 반환형 - void, 자료형(기본,참조(배열, 객체))
	//반환형은 단 한개만 가져갈 수 있음
	
	//void : 반환형이 없는것을 의미 -> 반환값이 없는것
	public void returnVoidTest() {
		System.out.println("출력하고 끝");
//		return; 이 없어도 중괄호가 끝나면 자동으로 돌아감
	}
	
	//통상 void는 출력문에 자주쓰임
	public void calculator() {
		int su1=10;
		int su2=20;
		int result=su1+su2;
		System.out.println("계산결과 : "+result);
	}
	
	//반환형이 있는 메서드
	//기본자료형
	//리턴으로 int 넘기기
	public int calc() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int su=sc.nextInt();
		System.out.print("정수 입력 : ");
		int su2=sc.nextInt();
		int result=su*su2;
		return result;
	}
	
	//리턴으로 String 넘기기
	public String msgTest() {
		Scanner sc=new Scanner(System.in);
		String msg="";
		System.out.print("메세지 입력(종료는 0) : ");
		while(true) {
			String temp=sc.nextLine();
			if(temp.equals("0")) {
				break;
			}
			msg+=temp;
		}
		return msg;
	}
	
	//리턴으로 배열 넘기기
	public int[] arrayReturn() {
		int[] test=new int[5];
		for(int i=0; i<5; i++) {
			test[i]=(i+1)*10;
		}		
		return test;
	}
}
