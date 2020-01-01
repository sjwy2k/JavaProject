package com.condition.controller;

import java.util.Scanner;

public class ControllTest {
	public void doubleIf() {
		//if안에 if는 '전제조건'을 사용할 때
		//첫 if를 만족한다면 두번째 if
		//여성전용 클럽, 전제조건1:성인 전제조건2:여성
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이는?\n나이:");
		int age=sc.nextInt();
		
		if(age>19) {
			System.out.print("당신의 성별은는?\n성별:");
			char gender=sc.next().charAt(0);
			if(gender=='여') {
				System.out.println("재미있게 즐기세요.");
			} else {
				System.out.println("여성만 입장이 가능합니다");
			}
			
			System.out.println("이건 출력되는가?");
			
		} else {
			System.out.println("20세 이상만 입장이 가능합니다.");
		}
	}
	
	public void bmiCalc() {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		double height = 0, weight = 0;
		System.out.print("키:");
		String ki = sc.nextLine(); 
		System.out.print("몸무게:");
		String mom = sc.nextLine();
		
		try {
			height = Double.parseDouble(ki);
			weight = Double.parseDouble(mom);
		} catch(NumberFormatException ne) {
			System.out.println("올바른 수치를 입력하세요.");
		}
		
		System.out.println("입력받은 키 : "+height);
		System.out.println("입력받은 몸무게 : "+weight);
		
		
		if(height>0&&weight>0) {
			double result = weight/((height*0.01)*(height*0.01));
			
			System.out.printf("결과값 : %.2f\n",result);
			if(result<20) {
				System.out.println("저체중");
			} else if(result>=20&&result<25) {
				System.out.println("정상체중");
			} else if(result>=25&&result<30) {
				System.out.println("과체중");
			} else if(result>30) {
				System.out.println("비만");
			}
		} else {
			System.out.println("올바른 수치를 입력하세요.");
		}
		
	}

	//switch문 활용하기
	public void switchTest() {
		Scanner sc = new Scanner(System.in);
		
		//정수를 비교하여 출력		
//		System.out.println("당신의 취미는?");
//		System.out.print("1. 운동\n2. 영화\n3. 게임\n취미(1, 2, 3) : ");
//		int choice = sc.nextInt();		
		
		//문자값비교
//		System.out.print("당신의 취미는?\n가.운동\n나.영화 \n다.게임\n취미 : ");
//		char choice = sc.next().charAt(0);		
		
		//문자열 비교
		System.out.print("당신의 취미는?\n운동, 영화, 게임\n취미 : ");
		String choice = sc.nextLine();
//		switch(choice) { //case문을 주로 method 호출하는 방식으로 활용을 많이 함
//						//일종의 메뉴판 역할
//		//case문:(이곳은 {}와 비슷하여 여러가지 구문들이 들어올 수 있음);break;
////			case 1: //변수가 숫자
////			case '가': //변수가 문자
//			case "운동": //변수가 문자열
//				System.out.println("저랑 같이 운동해요!");
////				System.out.print("무슨운동 좋아하세요?\n운동 종류 : ");
////				String ex = sc.next();
////				if(ex.equals("축구")) {
////					System.out.println("11명이서 하는 운동이죠?");
////				}
//				break;
////			case 2:
////			case '나':
//			case "영화":
//				System.out.println("저랑 같이 영화 봐요!");
//				break;
////			case 3:
////			case '다':
//			case "게임":
//				System.out.println("저는 게임 안해요!");
//				break;
//			default:
////				System.out.println("1~3까지 번호만 누르세요!");
////				System.out.println("가~다까지 문자만 입력하세요!");
//				System.out.println("잘못 입력하셨습니다");
//				break;
//		}
		
		//운동, 영화, 게임을 입력하면 그만놀고 코딩해!
		switch(choice) {
		case "운동" : 
		case "영화" : //case 내의 변수는 대, 소 비교 불가능(논리식 아님)
//		case "잠자기".equals(choice) : //불가능
		case "게임" :
			System.out.println("그만놀고 코딩해");
			//'return'은 method 종료후 method 호출한 곳으로 돌아감.
			//logic을 종료시킬때 사용
//			return; 			
			break;
		default : System.out.println("잘못 입력했네요");
		}
		System.out.println("switch끝났니?");
	}
	
	public void switchExam1() {
		Scanner sc = new Scanner(System.in);
		
		int check=0;
		boolean isNum = false;
		try {
			System.out.println("*****과일가게 입니다*****");
			System.out.println("1. 사과");
			System.out.println("2. 바나나");
			System.out.println("3. 복숭아");
			System.out.println("4. 키위");
			System.out.println("********************");
			System.out.print("입력 : ");
			check = sc.nextInt();
		} catch(NumberFormatException ne) {
			System.out.println("숫자를 입력하세요");
		}
		
		if(check>=1&&check<=4) {
			switch(check) {
				case 4:
					System.out.println("키위의 가격은 5000원입니다"); break;
				case 3:
					System.out.println("복숭아의 가격은 2000원입니다"); break;
				case 2:
					System.out.println("바나나의 가격은 3000원입니다"); break;
				case 1:
					System.out.println("사과의 가격은 1000원입니다"); break;
			}
		} else {
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}
	}

	public void switchExam2() {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		String numCheck = "";
		int num = 0;
		System.out.println("********초기 메뉴********");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴번호 입력 : ");
		try {
			numCheck = sc.nextLine();
			num = Integer.parseInt(numCheck);
			flag = true;
		} catch(NumberFormatException ne) {
			System.out.println("잘못 입력되었습니다.");
		}
		
		
		if(!flag) {
			System.out.println("정수를 입력하세요.");
		} else {
			//switch는 예상되는 변수를 집어넣고, 조건에 맞는 값을 실행
			//ars, 메뉴판, 입력값 정해져있을 때 switch 자주 사용
			switch(num) { //문자 사용시 single-quotation(' ')
			case 1:
				System.out.println("입력메뉴선택");
				break;//break는 switch를 빠져나간다
			case 2:
				System.out.println("수정메뉴선택");
				break;
			case 3:
				System.out.println("조회메뉴선택");
				break;
			case 4:
				System.out.println("삭제메뉴선택");
				break;
			case 7:
				System.out.println("프로그램을 종료합니다");
				break;
			default :
				System.out.println("번호가 잘못 입력되었습니다.\n프로그램을 종료합니다.");
				break;
			}
		}
		
	}

	public void switchExam3() {
		System.out.println("********메 뉴********");
		System.out.println("1. 떡볶이----------------1000");
		System.out.println("2. 김밥----------------2000");
		System.out.println("3. 오뎅----------------1000");
		System.out.println("4. 순대----------------2000");
		System.out.println("5. 튀김----------------3000");
		System.out.println("6. 떡튀순----------------8000");
		System.out.print("메뉴번호 입력 : ");
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		String check = "";
		boolean flag = false;
		
		try {
			check = sc.nextLine();
			menu=Integer.parseInt(check);
			flag = true;
		} catch(NumberFormatException ne) {
			System.out.println("잘못 입력되었습니다.");
		}
		
		if(!flag) {
			System.out.println("숫자를 입력하세요.");
		} else {
			switch(menu) {
			case 1:
				System.out.println("떡볶이는 1000원입니다.");
				break;
			case 2:
				System.out.println("김밥은 2000원입니다.");
				break;
			case 3:
				System.out.println("오뎅은 1000원입니다.");
				break;
			case 4:
				System.out.println("순대는 2000원입니다.");
				break;
			case 5:
				System.out.println("튀김은 3000원입니다.");
				break;
			case 6:
				System.out.println("떡튀순은 8000원입니다.");
				break;
			default :
				System.out.println("번호가 잘못 입력되었습니다.");
				break;
			}
		}		
	}

	public void switchExam4() {
		System.out.println("********메 뉴********");
		System.out.println("a. 햄버거----------------3000");
		System.out.println("b. 감자튀김----------------2000");
		System.out.println("c. 치킨----------------5000");
		System.out.println("d. 사이다----------------1000");
		System.out.println("e. 콜라----------------1000");		
		System.out.print("메뉴번호 입력 : ");
		Scanner sc = new Scanner(System.in);
		char menu = ' ';
		String check = "";
		boolean flag = false;
		
		try {
			check = sc.nextLine();
			menu=check.charAt(0);
			flag = true;
		} catch(Exception e) {
			System.out.println("잘못 입력되었습니다.");
		}
		
		if(!flag) {
			System.out.println("영문자를 입력하세요.");
		} else {
			switch(menu) {
			case 'a':
				System.out.println("햄버거는 3000원입니다.");
				break;
			case 'b':
				System.out.println("감자튀김은 2000원입니다.");
				break;
			case 'c':
				System.out.println("치킨은 5000원입니다.");
				break;
			case 'd':
				System.out.println("사이다는 1000원입니다.");
				break;
			case 'e':
				System.out.println("콜라는 1000원입니다.");
				break;
			default :
				System.out.println("문자가 잘못 입력되었습니다.");
				break;
			}
		}
	}

	public void switchExam5() {				
		System.out.print("학점 입력 : ");
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String check = "";
		boolean flag = false;
		
		try {
			check = sc.nextLine();
			score=Integer.parseInt(check);
			flag = true;
		} catch(Exception e) {
			System.out.println("잘못 입력되었습니다.");
		}
		
		if(!flag) {
			System.out.println("올바른 점수를 입력하세요");
		} else if(score>0&&score<101) {
			switch(score/10) {
			case 10:				
			case 9:
				System.out.println("A학점입니다");
				break;
			case 8:
				System.out.println("B학점입니다");
				break;
			case 7:
				System.out.println("C학점입니다");
				break;
			case 6:
				System.out.println("D학점입니다");
				break;
			default :
				System.out.println("F학점입니다");
				break;
			}
		} else {
			System.out.println("점수를 100점이상 입력할 수 없습니다");
		}
	}

	public void switchExam6() {
		
		Scanner sc = new Scanner(System.in);
		int kor=0, eng=0, math=0;
		String check = "";
		boolean flag = false;
		String fail = "";
		
		System.out.print("점수 입력 프로그램\n국어: ");
		
		try {
			check = sc.nextLine();
			kor=Integer.parseInt(check);
			System.out.print("영어: ");
			check = sc.nextLine();
			eng=Integer.parseInt(check);
			System.out.print("수학: ");
			check = sc.nextLine();
			math=Integer.parseInt(check);
			flag = true;
		} catch(Exception e) {
			System.out.println("점수가 잘못 입력되었습니다.");
		}
		int avg=(kor+eng+math)/3;
		if(!flag) {
			System.out.println("올바른 점수를 입력하세요");
		} else if(avg>0&&avg<101) {
			switch(avg/10) {				
				case 10:
				case 9:
				case 8:
				case 7:
				case 6:
					System.out.println("합격입니다");
					break;
				case 5:				
				case 4:
				case 3:
				case 2:
				case 1:
					System.out.println("평균점수 미달로 불합격입니다");
					break;
				default :
					System.out.println("올바른 점수가 입력되지 않았습니다");
					break;
			}
		} else {
			System.out.println("점수를 100점이상 입력할 수 없습니다");
		}
		
		if(!(kor>39)||!(eng>39)||!(math>39)) {
			if(kor<40) fail = "국어";
			if(eng<40) fail += " 영어";
			if(math<40) fail += " 수학";
			System.out.println(fail+"점수 미달로 불합격입니다.");
		} 
	
	}

	public void switchExam7() {
		
	}
}
