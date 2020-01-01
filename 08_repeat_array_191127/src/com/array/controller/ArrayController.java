package com.array.controller;

import java.util.Scanner;

//import java.util.Scanner;

public class ArrayController {

	//배열선언과 할당하기
	public void basicArray() {
		//배열선언 자료형[] 변수명;
		//여기 변수에는 주소값을 보관하는 참조형임
//		int[] numbers; //자료형[]에 선언
//		int numbers2[]; //자료형 변수명[] 둘 다 선언 가능
		
		//배열은 다수의 변수가 연결되어있는 형태(ex.기차)
//		numbers=new int[5];//주소값이 들어감
//		numbers2=new int[3];
//		System.out.println(numbers);
		
		//참조형변수명[인덱스번호] -> 배열 한 개의 저장공간(변수)
//		System.out.println(numbers[0]);
//		int age=0;
		//age==numbers[0]같은 의미
		
		//배열을 선언하고 할당하지 않으면??
//		System.out.println(numbers2); //초기값을 넣지 않으면 이용할 수 없다
//		numbers[0]=100;
		
		//선언과 동시에 할당
//		char[] chars=new char[10];
		
//		//선언과 동시에 초기화
//		String[] names = {"유병승", "한지현", "마경호", "정재훈"};
//		int[] numbers3 = {1, 2, 3, 4, 5};
		
//		System.out.println(names[2]);
		
		//초기화 한 값이 있으므로 초기값이 아닌 초기화 한 값이 출력
//		System.out.println(numbers3[0]);
//		System.out.println(names[2]);
//		names[2] = "박덕현";
//		System.out.println(names[2]);
		
		//자료형이 다른 값을 배열에 넣으면
//		names[0]=10; //타입이 달라 입력불가(String)
		
		//int형 배열 3개를 선언하고 본인테이블 친구들의 나이를 입력하고 출력해 보세요
		int[] tableAge = new int[3];
		
		tableAge[0]=19;
		tableAge[1]=20;
		tableAge[2]=21;
		
//		age= {19, 20, 21};//이미 선언한 후에는 불가능
				
		
		//배열은 출력하거나 대입할 때 for문을 이용해서 처리할수 있음
		//for문 이용해 출력하기
//		System.out.print("테이블 친구의 나이는 : ");
//		for(int i=0; i<3; i++) {
//			System.out.print(ages[i]+"세 ");
//		}	
//		System.out.println();
//		for(int i=0; i<5; i++) {
//			System.out.println(numbers3[i]);
//		}
		
		//for문을 이용한 배열에 값넣기
		java.util.Scanner sc = 
				new java.util.Scanner(System.in); //FQN
		//배열입력
//		for(int i=0; i<3; i++) {
//			System.out.print("당신의 나이 : ");
//			tableAge[i]=sc.nextInt();
//		}		
		//배열출력
//		for(int i=0; i<3; i++) {
//			System.out.println(tableAge[i]+"세");
//		}
		
		//배열도 하나의 객체
		//객체 활용하는 메서드(기능) 존재
		//String.length() -> 문자열의 개수 의미
		//배열의 길이는 배열명(변수명).length 로 구할 수 있다
		tableAge=new int[4];//배열길이 변경
		for(int i=0; i<10; i++) {
			System.out.print("당신의 나이 : ");
			tableAge[i]=sc.nextInt();
		}
		
		
		//java.lang.ArrayIndexOutOfBoundsException
		//배열 번호가 없어서 참조에 실패했을 때 발생
		System.out.println("배열개수변경!");
		tableAge=new int[4];
		for(int i=0; i<tableAge.length/*동적 변수 할당*/; i++) {
			System.out.println(tableAge[i]+"세");
		}
		
		
	}

	
	
	
	public void arrayEx1() {
		int[] nums = new int[10];
		
		System.out.println("인덱스 이용");
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		nums[3]=4;
		nums[4]=5;
		nums[5]=6;
		nums[6]=7;
		nums[7]=8;
		nums[8]=9;
		nums[9]=10;
		
		System.out.println("nums[0]:"+nums[0]);
		System.out.println("nums[1]:"+nums[1]);
		System.out.println("nums[2]:"+nums[2]);
		System.out.println("nums[3]:"+nums[3]);
		System.out.println("nums[4]:"+nums[4]);
		System.out.println("nums[5]:"+nums[5]);
		System.out.println("nums[6]:"+nums[6]);
		System.out.println("nums[7]:"+nums[7]);
		System.out.println("nums[8]:"+nums[8]);
		System.out.println("nums[9]:"+nums[9]);
		
		
		
		System.out.println("for문이용");
		nums = new int[10];
		for(int i=0; i<nums.length; i++) {
			nums[i]=i+1;
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println("nums["+i+"] : "+nums[i]);
		}
		
		
		
		System.out.println("100까지");
		nums = new int[100];
		for(int i=0; i<nums.length; i++) {
			nums[i]=i+1;
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println("nums["+i+"] : "+nums[i]);
		}
	}

	public void arrayEx2() {
		String[] fruits = 
				new String[]{"딸기", "바나나", "복숭아", "키위", "사과"};		
		System.out.println(fruits[1]);
		
		
//		for(int i=0; i<fruits.length; i++) {
//			if(fruits[i].equals("복숭아")) {
//				System.out.println("복숭아 위치를 찾았다! 위치는 배열에서 "+(i+1)+"번째다");
//			}
//		}
		
//		String[] random= {"딸기", "바나나", "복숭아", "키위", "사과"};
//		
//		for(int i=0; i<random.length; i++) {
//			//조건문 추가
//			if(random[i].equals("복숭아")) {
//				System.out.println("복숭아는 "+i+"인덱스에 있습니다");
//			}
//		}
	}

	public void arrayEx3() {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[5];		
		
		//ch배열 생성시 초기화 완료됨.
//		for(int i=0; i<ch.length; i++) {
//			ch[i]=' ';
//		}
		
		for(int i=0; i<ch.length; i++) {
			System.out.print("문자 입력 : ");
			ch[i]=sc.next().charAt(0);
		}
		
		System.out.print("출력 : ");
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

	public void arrayEx4() {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[5];		
		
		for(int i=0; i<ch.length; i++) {
			ch[i]=' ';
		}
		
		
		for(int i=0; i<ch.length; i++) {
			System.out.print("문자 입력 : ");
			ch[i]=sc.next().charAt(0);
		}
		
		System.out.println("출력 : ");
		for(int i=0; i<ch.length; i++) {
			if(i==0||i==3) {
				System.out.printf("%s번째 : %c\n",
					i==0?"첫"
					:i==3?"네"
					:"",ch[i]);
			}
		}
	}

	public void arrayEx5() {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		int sum=0;
		for(int i=0; i<num.length; i++) {
			System.out.print("정수 "+(i+1)+" : " );
			num[i]=sc.nextInt();
			sum+=num[i];
		}
		
		System.out.println("배열의 합은 "+sum+"입니다");
		
		
		
	}

	
}
