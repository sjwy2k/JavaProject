package com.operator.controller;

import java.util.Scanner;

public class OperatorTest {
	
	//증감연산 및 부정연산해보기
	public void selfAdd() {
		int num = 33;
		num++; //num = num+1
		System.out.println(num);
		
		++num;
		System.out.println(num);
		
		System.out.println(++num);
		System.out.println(num++);
		System.out.println(num);
		
		
		int num2 = 25;
		int temp = ++num2+30;//++num2
		System.out.println(temp);
		
		int num3 = 25;
		int temp2 = num3+++30;//num3++
		System.out.println(temp2);
		System.out.println(num3);
		
		//부정연산하기
		boolean flag = true;
		System.out.println(!flag);// '!'
		System.out.println(!!flag);// '!!'
		
//		int a, b, c;
//		a = 10; 
//		b = 20; 
//		c = 30;
//		
//		a++;
//		b=(--a)+b;
//		c=(a++)+(--b);	
		
	}
	
	public void calculator() {
		int a = 10;
		int b = 20;
		
		//더하기
		System.out.println("더하기 : "+(a+b));
		//빼기
		System.out.println("빼기 : "+(a-b));
		//곱하기
		System.out.println("곱하기 : "+(a*b));
		//나누기 - 몫
		System.out.println("나누기(몫) : "+(a/b));
		//나누기 - 실수값(자동 형변환 이용)
		System.out.println("나누기(실수값) : "+((double)a/b)); //1
		System.out.println("나누기(실수값) : "+(a*1.0/b)); //2		
		//나누기 - 나머지
		System.out.println("나누기(나머지) : "+(a%b));
		
		int testNum = 6;
		int testNum2 = 3;
		
		
		System.out.println(testNum);
		System.out.println(testNum2);
		System.out.println("true이면 짝수 : "+(testNum%2==0));
		System.out.println("false이면 홀수 : "+(testNum2%2==0));
		
		
		
	}
	
	public void testCal() {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int a, b;
		System.out.print("첫번째 수 입력 : ");
		a = sc1.nextInt();
		System.out.print("\n두번째 수 입력 : ");
		b= sc2.nextInt();
		
		System.out.println("더하기결과 : "+a+"+"+b+"="+(a+b)+"입니다.");
		System.out.println("빼   기결과 : "+a+"-"+b+"="+(a-b)+"입니다.");
		System.out.println("나누기결과 : "+a+"/"+b+"="+(a/b)+"입니다.");
		System.out.println("나머지결과 : "+a+"/"+b+"의 나머지는 "+(a%b)+"입니다.");
		System.out.println("곱하기결과 : "+a+"*"+b+"="+(a*b)+"입니다.");
		
		
		
	}
}
