package com.repeat.controller;

import java.util.Scanner;

public class RepeatTest {

	//기본 for문 연습하기
	public void basicFor() {
		//반복되는 코드를 for문을 이용하여 깔끔하게
		Scanner sc = new Scanner(System.in);
		
		//10번 찍기
//		for(int i=0; i<10; i++) {
//			System.out.println("Rclass 화이팅! "+(i+1)+"번 반복한 i횟수");
//		}
//		String name="";
//		int age=0,grade=0;
//		int i=0;
//		//기본 for문 응용하기
//		//10명의 학생의 정보를 입력받고 출력
//		for(i=0; i<10; i++) {
//			if(i!=0) { sc.nextLine(); }
//			System.out.print("학생이름 : ");
//			name = sc.nextLine();
////			name = sc.next();
//			System.out.print("학생나이 : ");
//			age = sc.nextInt();
//			System.out.print("학년 : ");
//			grade = sc.nextInt();
////			System.out.println("다음 학생을 입력하세요");		
//			System.out.printf("\n이름 : %s\n"
//					+ "학생나이 : %d\n"
//					+ "학년 : %d학년\n",name, age, grade);
//		}
		//
//		for(int i=0; i<3; i++) {
//			System.out.println("유병승");
//		}
	}
	
	public void forExam1() {
		System.out.println("1부터 100까지의 숫자를 출력");
		for(int i=0; i<100; i++) {
			System.out.print((i+1)+" ");
		}
		System.out.println();
		System.out.println("1부터 100까지의 숫자를 출력완료");
		System.out.println();
		
		System.out.println("100부터 1까지의 숫자를 출력");
		for(int i=100; i>0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("100부터 1까지의 숫자를 출력 완료");
		System.out.println();
		
		System.out.println("1부터 100까지의 짝수를 출력");
		for(int i=0; i<100; i+=2) {
			System.out.print(i+2+" ");
		}
		System.out.println();
		System.out.println("1부터 100까지의 짝수를 출력완료");
		System.out.println();
		
		System.out.println("1부터 100까지의 총합 출력");
		int sum = 0;
		for(int i=0; i<100; i++) {
			sum+=i+1;//1부터 총합 누적
		}
		System.out.println();
		System.out.println("1부터 100까지의 총합 : "+sum);
		System.out.println();
		
		System.out.println("입력한 정수까지의 짝수의 합 출력");
		int even=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		even=sc.nextInt();
		for(int i=0;i<even;i+=2) {
			sum+=i+2;
			System.out.print((i+2)+" ");
		}
		System.out.println();
		System.out.println("입력한 정수 "+even+" 까지의 짝수의 합은 "+sum);
		System.out.println();
		
		
	}
	
	public void forExam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int baksu = sc.nextInt();
		String result = "";
		for(int i=0; i<baksu; i++) {
			if(i%2==0) {
				result += "박";
			} else {
				result += "수";
			}
		}
		System.out.println(baksu+"입력 : "+result);
	}

	public void forExam3() {
		Scanner sc = new Scanner(System.in);
		String numCheck="";
		int num=0;
		boolean flag=false;
		
		try {
			System.out.print("정수 입력 : ");
			numCheck=sc.nextLine();
			num=Integer.parseInt(numCheck);
			flag=true;
		} catch(NumberFormatException e) {
			System.out.println("잘못 입력하셨습니다");
		}
		
		if(!flag) {
			System.out.println("올바른 정수를 입력하세요");
		} else if(num>0&&num<10) {
			for(int i=0; i<9; i++) {				
				System.out.println(num+"X"+(i+1)+"="+(num*(i+1)));
			}
		} else {
			System.out.println("잘못입력하셨습니다.프로그램종료합니다.");
		}
		
	}
		
	public void ex1() {
		//1~100까지 숫자를 출력하세요!
		//1 2 3 4 .... 100
		//변경되는 값 -> 변수
		
//		int a=0;
//		for(int i=0; i<100; i++) {
//			System.out.print((i+1)+" "); 방법1
//			System.out.println(i++); 
			//i를 더해서 넣으니 i+=2;의 효과(위 증감식이랑 같이 적용)
//			System.out.println(++a);//방법2
			//a까지 더해서 넣어라 그리고 출력(전위연산)
//		}
//		for(int i=1; i<=100; i++) {//방법3
//		}
		
		//100부터 0까지 숫자 출력
		
//		for(int i=100; i>=0; i--) {	
//			System.out.println(i);
//		}
//		int a=100;
//		for(int i=0; i<100; i++) {
//			System.out.println(a--);
//		}
		//1~100까지 짝수만 출력
		//짝수라면 출력 아니면 출력X
//		for(int i=0; i<100; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
//		
//		for(int i=0; i<=100; i+=2) {
//			
//		}
		
//		int a=0;
//		for(int i=50; i>0; i--) {
//			System.out.println(a+=2);
//		}
		
		//1부터 100까지의 합을 출력
//		System.out.println("1~100까지의 합을 출력");
//		int sum=0;
//		for(int i=0; i<100; i++) {
//			//합계 -> 누적 +=
////			int sum=0;
//			sum+=i+1;			
//		}
//		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in);		
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
		
		//사용자가 100 입력시
//		for(int i=0; i<=100; i++)
		//사용자가 50 입력시
//		for(int i=0; i<=50; i++)
		//사용자가 5 입력시
//		for(int i=0; i<=5; i++)
//		System.out.println("입력받은 수까지의 짝수");
//		for(int i=0; i<=input; i++) {
//			if(i%2==0)
//				System.out.println(i); //1줄 조건이면 중괄호 없이 입력가능
//			//헷갈리므로 중괄호 사용 권장!!
//		}
		
		
		
		//초기식없이 사용하기
		int i=10;//외부에다 초기식 대응하는 변수
//		for(/*초기식을 반드시 for문안에 선언할 필요는 없다*/;i<10;i++) 
//			System.out.print(i);//1줄 조건이면 중괄호 없이 입력가능
//		System.out.println();
//		System.out.println("for문 빠져나온 전역변수 i의 결과값 : "+i);//마지막 i 빠져나올의 값이 출력
		
		//증감식없이 for문 활용
//		System.out.println("증감식 없는 for문");
//		for(int j=0;j<5;) {//j값을 바꾸지 않으면 무한loop에 빠진다
//			System.out.println(j++);//j값을 내부에서 증감시켜 false로 변경
//		}
		//초기식, 증감식 없는 for문
//		for(;i>0;) {
//			System.out.print(i--);
//		}
		//다 없는(초기식, 조건식, 증감식) for문 사용
		for(;;) {
			System.out.println("무한루프!@_@");
			break;
		}
	}

	

}
