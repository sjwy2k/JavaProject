package com.doublearray.controller;

import java.util.Scanner;

public class DoubleArrayTest {
	
	//2차원 배열 선언/할당하기
	public void basicDoubleArray() {
		//2차원배열의 선언
		int[][] numbers;
		int numbers1[][];
		String[][] strs;
		//선언된 변수에 2차원배열 할당하기
		numbers=new int[3][3]; /*{{0,0,0}
								 ,{0,0,0}
							     ,{0,0,0}}*/
		strs=new String[4][4]; /*{{null,null,null,null}
								 ,{null,null,null,null}
								 ,{null,null,null,null}
								 ,{null,null,null,null}}*/
		
		//할당된 배열에 값 넣기
		//1. 인덱스를 이용해서 넣기
		//2. for문을 이용해서 넣기
		
//		numbers[0][0]=10;
//		numbers[0][1]=9;
//		strs[1][2]="유병승";
//		strs[1][3]="마경호";
		//for문을 이용해서 초기화
//		int count=1;
//		for(int i=0; i<numbers.length; i++) { //행
//			for(int j=0; j<numbers[i].length; j++) { //열
//				numbers[i][j]=count++;
//				System.out.print(numbers[i][j]+"	");
//			}
//			System.out.println();
//		}
		
		//추가적인 배열선언
		//2차원 배열의 행에 대입되는 배열의 길이를
		//행별로 설정할 수 있다 - 가변배열
		int[][] number2;
		number2=new int[3][];//에러나지 않음! 가변배열!
		System.out.println(number2[0]);
		number2[0]=new int[10];//2차 행에 가변적 열 할당;
		number2[1]=new int[5];
		number2[2]=new int[3];
		
		for(int i=0; i<number2.length; i++) {
			for(int j=0; j<number2[i].length; j++) { //고정적인 길이를 설정하면 indexoutofboundexception에러
				System.out.print(number2[i][j]);
			}
			System.out.println();
		}
		
		
	}

	public void studentAssign() {
		//12명의 학생들을 출석부 순으로 2열6행으로 자리배치하여
		//분단을 출력하시오!
		String[] students= {"홍길동", "이순신", "유관순", "윤봉길",
				"장영실", "임꺽정", "장보고", "이태백",
				"김정희", "대조영", "김유신", "이사부"};
		String[][] studentPosition=new String[6][2];
		
		int studentNum=0;//내부 로직용 외부 변수 선언
		for(int i=0; i<studentPosition.length; i++) {
			for(int j=0; j<studentPosition[i].length; j++) {
				studentPosition[i][j]=students[studentNum++];
//				studentNum++;//0~11까지 출력해줄 수 있도록 회수별로 증가
			}
		}
		
		for(int i=0; i<studentPosition.length; i++) {
			if(i==0) System.out.println("======1분단======");
			else if(i==3) System.out.println("======2분단======");
			for(int j=0; j<studentPosition[i].length; j++) {
				System.out.print(studentPosition[i][j]+"	");
			}
			System.out.println();
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름 : ");
		String keyword=sc.nextLine();
		String position=""; //몇번째 줄인지
		int bundan=0; //분단
		String side=""; //좌우
		
		for(int i=0; i<studentPosition.length; i++) {
			for(int j=0; j<studentPosition[i].length; j++) {
				if(keyword.equals(studentPosition[i][j])) {
					if(i<=3) bundan=2;
					else bundan=1;	
//					bundan= i<=3 ?2 :1;
					
					switch(i) {
					case 0: case 3: position="첫번째";break;
					case 1: case 4: position="두번째";break;
					case 2: case 5: position="세번째"; break;
					}					
					switch(j) {
					case 0: side="왼쪽"; break;
					case 1: side="오른쪽"; break;	
					}
//					side=j==0?"왼쪽":"오른쪽";
				}
			}
		}
		System.out.println("검색하신"+keyword+"학생은"+bundan+"분단"+position+"번째 중"+side+"쪽에 있습니다.");
	}
	
	public void ex01() {
		int[][] numbers = new int[15][11];
		int count=1;
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				numbers[i][j]=count++;
				System.out.print(numbers[i][j]+"	");
			}
			System.out.println();
		}
	}
	
	public void ex02() {
		String[][] stuBook= 
			{{"홍길동","장보고"},
			 {"이순신","이태백"},
			 {"유관순","김정희"},
			 {"윤봉길","대조영"},
			 {"장영실","김유신"},
			 {"임꺽정","이사부"},};
		for(int i=0; i<stuBook.length; i++) {
			if(i==0) System.out.println("=== 1분단 ===");
			else if(i==3) System.out.println("=== 2분단 ===");
			for(int j=0; j<stuBook[i].length; j++) {
				System.out.print(stuBook[i][j]+"	");
			}
			System.out.println();
		}
	}

	public void ex03() {
		String[][] stuBook= 
			{{"홍길동","장보고"},
			 {"이순신","이태백"},
			 {"유관순","김정희"},
			 {"윤봉길","대조영"},
			 {"장영실","김유신"},
			 {"임꺽정","이사부"},};
		for(int i=0; i<stuBook.length; i++) {
			if(i==0) System.out.println("=== 1분단 ===");
			else if(i==3) System.out.println("=== 2분단 ===");
			for(int j=0; j<stuBook[i].length; j++) {
				
				System.out.print(stuBook[i][j]+"	");
			}
			System.out.println();
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String input=sc.nextLine();
		for(int i=0; i<stuBook.length; i++) {
			for(int j=0; j<stuBook[i].length; j++) {
				if(stuBook[i][j].equals(input)) {
					System.out.print("검색하신 "+input+" 학생은 ");
					switch(i) {
						case 0:System.out.print("1분단 첫번째 ");break;
						case 1:System.out.print("1분단 두번째 ");break;
						case 2:System.out.print("1분단 세번째 ");break;
						case 3:System.out.print("2분단 첫번째 ");break;
						case 4:System.out.print("2분단 두번째 ");break;
						case 5:System.out.print("2분단 세번째 ");break;
					}
					switch(j) {
						case 0:System.out.print("중 왼쪽에 있습니다.");break;
						case 1:System.out.print("중 오른쪽에 있습니다.");break;
					}
					
				}
			}
		}
		
	}

	public void ex04() {
		Scanner sc=new Scanner(System.in);
		System.out.print("행을 입력하세요(1~10) : ");
		int hang=sc.nextInt();
		System.out.print("열을 입력하세요(1~10) : ");
		int yeol=sc.nextInt();
		
		char[][] matrix=new char[hang][yeol];
		
		int input=0;
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[hang-1].length; j++) {
				input=(int)(Math.random()*26)+65;
				matrix[i][j]=(char)input;
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	public void ex05() {
		String[][] scoreBoard = new String[5][6];
		int[][] score=new int[3][3];
		
		String[] title= {"이름","국어","영어","수학","합계","평균"};
		String[] etc= {"홍길동","이순신","유관순","합계"};
		int[] inputScore= {80,90,77,78,97,86,71,68,88};
		int[] sum=new int[3];
		int[] sum2=new int[4];
		double[] avg=new double[4];
		
		System.out.println("입력전");
		//입력 전
		for(int i=0; i<scoreBoard.length; i++) {
			for(int j=0; j<scoreBoard[i].length; j++) {
				System.out.print(scoreBoard[i][j]+" ");
			}
			System.out.println();
		}
		
		//title 입력
		int count=0;
		for(int i=0; i<scoreBoard[0].length; i++) {
			scoreBoard[0][i]=title[count++];
		}
		count=0;
		for(int i=1; i<scoreBoard.length; i++) {
			scoreBoard[i][0]=etc[count++];
		}
		count=0;
		for(int i=1; i<4; i++) {
			for(int j=1; j<4; j++) {
				scoreBoard[i][j]=""+inputScore[count++];
			}
		}
//		for(int i=0; i<)
		System.out.println("입력후");
		
		
		
		//입력 후
		for(int i=0; i<scoreBoard.length; i++) {
			for(int j=0; j<scoreBoard[i].length; j++) {
				System.out.print(scoreBoard[i][j]+"	");
			}
			System.out.println();
		}
		
		
		
		
//		System.out.println("=============== A반 성적표 ===============");
		
	}
}
