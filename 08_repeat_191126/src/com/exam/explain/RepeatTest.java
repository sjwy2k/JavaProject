package com.exam.explain;

import java.util.Scanner;

public class RepeatTest {

	public void test() {
		//국어, 영어, 수학 세과목의 점수를 입력받아
		//차근차근 생각하자(필요한게뭐지? 변수를 어떻게 선언하지?)
		//변수명, 자료형, 
		Scanner sc = new Scanner(System.in);
		int kor=0, eng=0, math=0;
		double avg=0;
		System.out.print("성적입력 프로그램\n국어:");
		kor=sc.nextInt();
		System.out.print("영어:");
		eng=sc.nextInt();
		System.out.print("수학:");
		math=sc.nextInt();
				
		avg=(kor+eng+math)/3.0;
		
		//평균이 60점 미만이면 평균미달
		//과목이 40점 미만이면 과락
		if(avg<60) {
			System.out.println("평균 점수 미달");
		}
		if(kor<40||eng<40||math<40){
			String subject ="";
			if(kor<40) subject +="국어 ";
			if(eng<40) subject +="영어 ";
			if(math<40) subject +="수학 ";
			System.out.println(subject+"과목 점수 미달로 불합격");
		}		
		if(avg>60&&kor>=40&&eng>=40&&math>=40) {
			System.out.println("합격입니다.");
		}
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		int input=0;
		System.out.print("정수 입력 : ");
		input=sc.nextInt();
//		System.out.println("input : "+input);
		
		//5입력! ->1,2,3,4,5
		//10입력! ->1,2,3,4,5,6,7,8,9,10
		//1부터 입력받은 정수까지 수
		for(int i=1; i<=input; i++) {
			//홀수와 짝수를 나눠서(분기=조건=if)
			//짝수면 "박" 기준값%2==0
			//홀수면 "수" 기준값%2==1
			//기준값==input
			if(i%2==1) System.out.print("수"); //홀수면
			else System.out.print("박"); //짝수면
//			System.out.println();
		}
		
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
				
		int input=0;
		System.out.print("정수 입력 : ");
		input=sc.nextInt();
		
		
		//input>=1&&input<=9 1~9까지 범위표현
		//2입력
		//2*1=2 2*2=4 ... 2*9=18
		//4입력
		//4*1=4 4*2=8 ... 4*9=36
		if(input<1||input>9) {
			System.out.print("1부터 9까지의 숫자를 입력하세요");
		} else {
			for(int i=1; i<=9; i++) {
				System.out.println(input+" * "+i+ " = "+input*i);				
			}
		}
		
	}

	//while문 활용하기
	//while문도 for와 동일하게 반복하는 기준이 되는 초기식, 조건식, 증감식이 있다.
	//초기식, 조건식, 증감식의 위치가 for문처럼 정해져 있지 않기때문에
	//개발자가 위치를 직접 선정해 구성
	//1. 초기식은 while문이 나오기 이전에 선언/초기화
	//2. 증감식은 while문 {} 내부에 존재
	//점심식사 맛있게 하세요
	public void whileTest() {
		int input=0;//초기식
		while(input<5) /*조건식*/{
			System.out.println("점심식사 맛있게 하세요!");
			input++; //증감식
		}
		
		
	}
	
	public void whileTest2() {
		//1~100까지 출력하는 while문
//		int j=1;
//		while(j<=100) {
//		j++; 2~101 //위치1
//		System.out.println(j);			
		//j를 증감시키는 코드의 위치에 따라 달라짐
//		j++ 1~100 //위치2
		
//		System.out.println(j++); //1찍고 증감식이 바로 적용
		
		//j값이랑 상관 없으므로 위치에 따라 변경되는 것이 없다
//		System.out.println("힘내요"); 
//		}
		
//		for(int i=100; i>=0; i--)
//		int m=100;
//		while(m>=0) {
//			System.out.println(m);
//			m--;
//		}
		
		
		//입력받은 정수까지의 홀수를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		//for(i=0; i<input; i++)
		int r=1;
		while(r<input) {
//			System.out.println(r%2==1);
			if(r%2==1) {
				System.out.println(r);				
			}
			r++;
//			System.out.println(r);
//			System.out.println(input);
		}
		
		
	}
	
	public void doWhileTest() {
		//do~while
		//메뉴나 이정표 등 로직을 무조건 한번은 실행해야 할 경우 사용
		//이후 while문에서 T/F 판단 후 T면 한번 더 돌고 판단
		//초기값, 조건식, 증감식 마찬가지로 필요
		//(초기값)do{(로직+증감식)}while(조건문); //;세미콜론 반드시필요;;;;;;
		
		//while사용시
		int i=0;
		while(i>0) {
			System.out.println("이제 곧 쉬는시간");
		}
		
		//do~while사용시
		do {
			System.out.println("이제 곧 쉬는시간");
		} while(i>0);
		
	}
	
	public void searchText() {
		//문자열과 문자열에서 검색할 문자를 입력받음
		String text="";
		char keyword=' ';
		//char형에 대해 아무것도 없는 초기값을 설정할 때는
		//' ', 공백으로 표시(or '\u0000')
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열입력 : ");
		text=sc.nextLine();
		System.out.print("문자입력 : ");
		keyword=sc.next().charAt(0);
		//1. 문자열에서 찾을문자의 개수를 확인
		//apple을 입력(문자열) p를 입력(찾을 문자) 예상 결과 : 2
		//banana를 입력(문자열) a를 입력(찾을 문자) 예상 결과 : 3
		//how to compare banana and a?
		
		//String은 char의 배열이다.
		//String의 각 문자는 char이므로 char끼리 비교하는 식을 짜 보자
		//apple을 입력 - 각각의 apple char를 출력
//		System.out.print(text.charAt(0)+" ");
//		System.out.print(text.charAt(1)+" ");
//		System.out.print(text.charAt(2)+" ");
//		System.out.print(text.charAt(3)+" ");
//		System.out.print(text.charAt(4));
		
		//2. 각각 비교 -  동일한 char 비교에 매개변수만 다르다 0~4
//		System.out.println(text.charAt(0)==keyword);
//		System.out.println(text.charAt(1)==keyword);
//		System.out.println(text.charAt(2)==keyword);
//		System.out.println(text.charAt(3)==keyword);
//		System.out.println(text.charAt(4)==keyword);
//		int count=0;
//		//코드중복=개선
//		if(text.charAt(0)==keyword) {
//			count++;
////			||count+=1;
//		}
//		if(text.charAt(1)==keyword) {
//			count++;
//		}
//		if(text.charAt(2)==keyword) {
//			count++;
//		}
//		if(text.charAt(3)==keyword) {
//			count++;
//		}
//		if(text.charAt(4)==keyword) {
//			count++;
//		}
//		System.out.println("찾은 문자 개수 : "+count);
		
		
		//3. for문을 이용하여 변경
		int count2=0;
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i)==keyword) {
				count2++;
			}
		}
		System.out.println("for문 문자 찾은 개수 : "+count2);
		System.out.println(text.length());
	}
	
	public void repeatTest1() {
		Scanner sc = new Scanner(System.in);
		String input="";
		char ch = ' ';
		int sum=0;
		boolean chCheck = false;
		
		System.out.print("문자열 입력 : ");
		input=sc.nextLine();
		System.out.print("문자 입력 : ");
		ch=sc.next().charAt(0);
		
		for(int i=0; i<input.length(); i++) {	
			if(ch==input.charAt(i)) sum++;
		}
		
		if(sum==0) {
			if(sum==0) System.out.println("영문자가 아닙니다");
		} else {
			System.out.println("포함된 갯수 : " +sum+" 개");
		}	
		
	}
	
	public void repeatTest2() {
		Scanner sc = new Scanner(System.in);		
		
		String[] info;
		info = new String[5];
		int i=0;
		do {
			System.out.print("입력 : ");
			info[i]=sc.nextLine();
			//info[i]에는 기본적으로 null값이 들어있으므로
			//+=연산자로 넣으면 null이 출력된다.
			i++;
		} while(i<5);
		
		System.out.println("========저장회원========");
		for(int j=0; j<5; j++) {			
			System.out.println(info[j]);
		}
		
	}
	
	public void repeatTest3() {
		Scanner sc = new Scanner(System.in);
		
		String name="", add="", phoneNum="", 
				age="", height="", weight="";
		
		
		for(int i=0; i<5; i++) {
			System.out.println("이름 입력 : ");
			name+=sc.nextLine();
			System.out.println("나이 입력 : ");
			age+=sc.nextLine();
			System.out.println("주소 입력 : ");
			add+=sc.nextLine();
			System.out.println("키 입력 : ");
			height+=sc.nextLine();
			System.out.println("몸무게 입력 : ");
			weight+=sc.nextLine();
			System.out.println("연락처 입력 : ");
			phoneNum+=sc.nextLine();
		}
		
		System.out.println("========저장회원========");
		for(int i=0; i<5; i++) {
			
			System.out.println(name+" "+age+" "+add+" "+height+" "+weight+" "+phoneNum);
		}
		
		
	}
	
	
	public void repeatExam1() {
		int input=1;
		while(input<101){
			System.out.println(input);
			input++; 
		}
	}
	
	public void repeatExam2() {
		int input=100;
		while(input>=0){
			System.out.println(input);
			input--; 
		}
	}
	
	public void repeatExam3() {
		int input=1;
		while(input<101){
			if(input%2==1) System.out.println(input);
			input++; 
		}
	}
	
	public void repeatExam4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input=sc.nextInt();
		int start=1;
		while(start<input+1){
			if(start%2==1) System.out.println(start);
			start++; 
		}
	}
	
	public void repeatExam5() {
		Scanner sc = new Scanner(System.in);
		int start=1, sum=0, input=0;
		System.out.print("정수 입력 : ");
		input=sc.nextInt();		
		while(start<input+1){
			if(start%2==1) {
				sum+=start;
				System.out.print(start+" ");
			}
			start++; 
		}
		System.out.println("\n총합 : "+sum);
	}
	
	public void breakTest() {
		//반복문을 빠져나올 때 , 사용을 함
//		int i=0;//초기식
//		while(true) {
//			System.out.println("여러분 힘내요!");
//			i++;//증감식
//			if(i==5) {//조건식
//				//break를 읽으면  while문이 종료됨.
//				break;//없으면 무한루프
//			}
//		}
		
		
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("1. 회원가입");
			System.out.println("2. 회원조회");
			System.out.println("3. 회원탈퇴");
			System.out.println("0. 프로그램 종료");
			System.out.print("입력 : ");
			int choice = sc.nextInt();			
			switch(choice) {				
				case 1: System.out.println("회원가입중..."); break;
				case 2:	System.out.println("회원 조회중..."); break;
				case 3: System.out.println("회원 탈퇴중..."); break;
				case 0: System.out.println("프로그램이 종료됩니다."); break;
			}
			if(choice==0) {
				break;
			}
		}while(true);
		
	}
	
	//random값에 의해 반복문 중단하기
	public void randomRepeat() {
//		String sum = "";
//		for(int i=0;i<6;i++) {
//			sum+=((int)(Math.random()*45)+1)+", ";
//		}
//		System.out.println("오늘의 로또번호 : "+sum);
		
		
		
		//random을 출력하는 객체 Math
		//Math.random() => 랜덤값이 출력이 됨.
//		for(int i=0; i<20; i++) {
//			//0~9까지의 랜덤값이 출력
//			System.out.println((int)(Math.random()*5)+1); 
//			//1~45까지 6개 출력 = 로또, //중복값 나올 수 있음(처리)
//		}
		
		
		while(true) {
			int value=(int)(Math.random()*10)+1;
			System.out.println(value);
			if(value==5) break; //랜덤한 수가 나오면 무한loop while문 종료
		}
		
		//응용 가능한 프로그램
		//가위바위보게임 
		//묵찌빠게임 
		//(가위바위보 인덱스 할당, 입력받는 조건, 승패 조건, 종료되는 조건)

	}
	
	public void continueTest() {
		//continue는 반복문에서 continue 
		//라인 아래의 구문을 실행하지 않고 
		//증감연산 후 반복문을 재실행하는 것이다
		
		System.out.println("실행?");
		for(int i=0; i<10; i++) {
			if(i%3==0) continue;
			System.out.println("출력 : "+i);
		}
	}
	
	
}
