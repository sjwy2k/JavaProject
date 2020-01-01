package com.operator.contorller;

import java.util.Scanner;

public class OperatorTest {
	
	public void compareTest() {
		
		//비교연산자 활용해보기
		//단일값으로 활용되지는 않고, 조건문에서 분기처리할 때
		//활용됨. 주로 논리연산과 연결되어 활용함
		//동등비교 '=='
		int su = 10;
		int su2 = 20;
		int su3 = 10;
		
//		System.out.printf("%d와 %d가 같니? %b\n",su, su2, su==su2); //boolean 값 return
//		System.out.printf("%d와 %d가 같니? %b\n",su, su3, su==su3);
		boolean flag = su==su2; //boolean값을 boolean 변수에 집어넣음
		
		//문자 비교
		char ch = 'A';
		char ch2 = 'a';		
//		System.out.println("문자열 동등비교 : "+(ch==ch2));
//		System.out.printf("문자 동등비교 : %c == %c은 %b\n",ch, ch2, (ch==ch2));
		
		
		//실수 비교
		double dnum = 180.5;
		double dnum2 = 188.1;		
//		System.out.println("실수 동등비교 : "+(dnum==dnum2));
//		System.out.printf("문자열 동등비교 : %.1f == %.1f은 %b\n",dnum, dnum2, (dnum==dnum2));
		
		
		//문자열 동등비교
		String name = "유병승";
		String name2 = "유병승";
		String name3 = new String("신재원");
		
//		System.out.printf("%s와 %s의 문자열 동등비교 : %b\n", name, name2,(name==name2)); //
//		System.out.printf("%s와 %s의 문자열 동등비교 : %b\n", name, name3, (name==name3)); //
//		System.out.printf("%s, %s, %s\n", name, name2, name3);
		
		/*문자열을 비교할 때는 equals() 메서드를 이용*/
//		System.out.printf("%s과/와 %s이/가 같니 ? = %b\n",name, name3, name.equals(name3));
		
//		System.out.println(name.hashCode()); //hash코드, 주소값
//		System.out.println(name2.hashCode()); // Overriding 되어서 동일한 주소값으로 표현
//		System.out.println(name3.hashCode()); // 
		
		
		//대소비교하기
		//숫자형 자료형의 크기를 비교, 문자(char)비교가능
//		System.out.println(su>su2);
//		System.out.println(su<su2);
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("수입력 : ");
//		int num = sc.nextInt();
//		System.out.print("수입력 : ");
//		int num2 = sc.nextInt();
//		System.out.println("첫번째 입력값이 더 크니? : " + (num>num2));
		
		//두개의 문자열을 입력받아서
		//같은지 비교하고 같으면 true, 다르면 false를 반환
		//출력되는 프로그램 만들기
		
//		String a, b;
//		System.out.print("문자열 입력 : ");
//		a = sc.nextLine();
//		System.out.print("문자열 입력 : ");
//		b = sc.nextLine();
//		
//		System.out.printf("%s와 %s 문자열을 비교하면  %b이므로 %s", 
//				a, b, a.equals(b), (a.equals(b) ? "같다" : "다르다"));
		
	}
	
	public void logicalTest() {
		//논리연산테스트
		//진위 두개를 비교하는 것
		//&& : and 그리고 / 둘 다 참이어야지 성립(true)
		//|| : or 또는 / 둘 중 하나만 참이면 성립(true)
		// * | -> shift +\
//		int su=10; int su2=20;
//		char ch='a'; char ch2='b';
		
		//&&연산하기
//		System.out.println(su<su2 && ch!=ch2); // T && T == T
//		System.out.println(su>su2 && ch!=ch2); // F && T == F
		
//		boolean ticket = true; //티켓소유여부
//		int height = 140; //키가 139
//		
//		System.out.printf((ticket==true && height >= 140) 
//				? "티켓이 있고, 키가 %d이므로 탑승가능" 
//				: "티켓이 있고, 키가 %d이므로  작아서 탑승불가능", height, height);
		
		//1. 로직 돌아가는 내용이 뭔지 파악
		//2. 논리로 어떻게 기준을 잡을 지 판단!
		//3. 코드로 논리를 구현
		//ex)놀이공원 입장, 도서 대여와 연체,
		
		
		//여성전용 사우나 출입관리 프로그램
		//기준 1: 여성인가?, 기준2 성년/미성년 성년만?
		
//		char gender ='여';
//		int age = 19;		
//		System.out.println((gender=='여'&&age>=19) ? "출입" : "입장불가");
		
		//클럽 출입관리 프로그램
		//티켓 있거나, 상품권 있으면 출입		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("나이가 얼마입니까?\n나이 : ");		
//		int age = sc.nextInt();		
//		if(age>=19) {
//		System.out.print("티켓을 가지고 있으십니까? \n(예 : y / 아니오 : n) : ");
//		char check1 = sc.next().charAt(0);
//		System.out.print("상품권을 가지고 있으십니까? \n(예 : y / 아니오 : n) : ");
//		char check2 = sc.next().charAt(0);
//		
//		boolean ticket = (check1 == 'y');
//		boolean coupon = (check2 == 'y');
//		
//		System.out.printf((ticket==true) || (coupon==true) 
//				? "입장이 가능합니다 어서오세요" 
//				: "입장이 불가능합니다. 티켓이나 상품권을 지참하세요" );
//		} else if(age<19){
//			System.out.println("나이가 어려서 클럽 입장이 불가능합니다.");
//		}
		
		//수업시간 예제
//		boolean clubTicket = true;
//		boolean coupon = false;
//		int age = 19;
//		
//		System.out.print((clubTicket==true || coupon==true) && age >= 19);		
				
//		System.out.print("아이디 입력 : ");
//		String id = sc.nextLine();
//		System.out.print("패스워드 입력 : ");
//		String pw = sc.nextLine();
//		
//		boolean idCheck = (id.equals("admin"));
//		boolean pwCheck = (pw.equals("abcd"));
//		
//		System.out.printf((idCheck==true) && (pwCheck==true) 
//				? "로그인 되었습니다" 
//				: ((idCheck!=true) ? "id가 일치하지 않습니다" : "비밀번호가 일치하지 않습니다"));		
		
		//회원가입
//		id, password, name, address, phoneNum, email
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String pw = sc.nextLine();
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("주소 입력 : ");
		String address = sc.nextLine();
		System.out.print("휴대전화 번호 입력 : ");
		String phoneNum = sc.nextLine();
		System.out.print("집전화 번호 입력 : ");
		String telNum = sc.nextLine();
		System.out.print("이메일 입력 : ");
		String email =  sc.nextLine();
		
		//1
		if(!id.equals("")
			&&!pw.equals("")
			&&!name.equals("")
			&&!address.equals("")
			&&!(phoneNum.equals("")||telNum.equals(""))
			&&!email.equals(""))			
		{
			System.out.println("회원가입가능");
		} else {
			System.out.println("회원가입불가능");
		};
		//2
//		if(!(id.equals("")
//				||pw.equals("")
//				||name.equals("")
//				||address.equals("")
//				||(phoneNum.equals("")&&telNum.equals(""))
//				||email.equals("")))			
//			{
//				System.out.println("회원가입가능");
//			} else {
//				System.out.println("회원가입불가능");
//		};
		
		
		//수치비교시 범위를 나타낼 때 &&
		//입력받은 값이 10~20사이 확인
		//x -> 10 < x < 20 없음. 한 번에 비교 불가
		//x > 10 && x < 20 x는 10보다 크고! 그 다음 x는 20보다 작다! 둘 다 만족!
//		System.out.print("숫자를 입력하세요 \n숫자 : ");
//		int x = sc.nextInt();
//		if(x > 10 && x < 20) {
//			System.out.println(x+"는 10보다 크고 20보다 작은 수입니다.");
//		}
		
		
		//입력한 알파벳이 A~F사이에 있는지 확인하는 논리
//		System.out.print("대문자 알파벳을 하나 입력하세요\n알파벳 : " );
//		char alpha = sc.nextLine().charAt(0);
//		if(alpha>='A' && alpha <= 'F') {
//			System.out.println("입력한 "+alpha+" 알파벳은 A~F 사이입니다");
//		} else {
//			System.out.println("입력한 "+alpha+" 알파벳은 A~F 사이가 아닙니다");
//		}
		
//		System.out.print("알파벳을 하나 입력하세요\n알파벳 : " );
//		char alpha = sc.nextLine().charAt(0);
//		if(alpha>='A' && alpha <= 'F' || alpha >= 'a' && alpha <= 'f') {
//			System.out.println("입력한 "+alpha+" 알파벳은 A~F 사이거나 a~f 사이입니다");
//		} else {
//			System.out.println("입력한 "+alpha+" 알파벳은 A~F 사이거나 a~f 사이가 아닙니다");			
//		}
		
		
	
	}
	
	public void bitTest() {
		//비트연산 테스트하기
		int a = 10, b = 22;
		String basic = "00000000000000000000000000000000";
		String bit = basic + Integer.toBinaryString(a);
		//a비트값
		bit = bit.substring(bit.length()-32);
		System.out.println("a비트값	:	"+bit);
		
		//~a연산 0, 1 반전값 연산
		bit = basic + Integer.toBinaryString(~a);
		bit = bit.substring(bit.length()-32);
		System.out.println("~a비트값	:	"+bit);
		
		//b비트값
		bit = basic + Integer.toBinaryString(b);
		bit = bit.substring(bit.length()-32);
		System.out.println("b비트값	:	"+bit);
		
		//a&b연산 and연산
		bit = basic + Integer.toBinaryString(a&b);
		bit = bit.substring(bit.length()-32);
		System.out.println("a&b비트값	:	"+bit);
		
		//a|b연산 or연산
		bit = basic + Integer.toBinaryString(a|b);
		bit = bit.substring(bit.length()-32);
		System.out.println("a|b비트값	:	"+bit);
		
		//a^b연산 (XOR 연산, 서로 달라야만(배타적) true)
		bit = basic + Integer.toBinaryString(a^b);
		bit = bit.substring(bit.length()-32);
		System.out.println("a^b비트값	:	"+bit);
		
		
		
		//a<<1 1/2 a<<2 1/(2*2) a<<3 1/(2*2*2)
		bit = basic + Integer.toBinaryString(a>>2);
		bit = bit.substring(bit.length()-32);
		System.out.println("a<<1 1/2로 나누기	:	"+bit);
		
		//a>>1 *2 a>>2 *2*2 a>>3 *2*2*2
		bit = basic + Integer.toBinaryString(a<<2);
		bit = bit.substring(bit.length()-32);
		System.out.println("a>>1 2로 곱하기	:	"+bit);
		
		//>>>부호비트 0으로 채운다
	}
	
	public void complexOperator() {
//		int a=20, b=30, c=40;
////		(a=a+3 == a+=3)
//		a+=3; //23
//		a+=200; //223
//		a+=300; //523
//		
//		a+=b; // a=a+b
		
		//입력받은 변수만큼 누적(월급, 조회수, 포인트)
		Scanner sc = new Scanner(System.in);
//		System.out.print("당신의 이번달 월급을 입금합니다\n월급:");
//		a+=sc.nextInt();		
//		System.out.println("통장에 있는 돈 : "+a);
//		
//		System.out.print("휴대폰 이용료를 차감합니다\n이용료:");
//		a-=sc.nextInt();
//		System.out.println("통장에 남은 돈 : "+a);
//		
//		System.out.print("통장에 이자가 들어왔습니다\n이자:");
//		a*=(sc.nextDouble();
		
		
		//총 4개의 수를 입력받고 총 합계 및 평균을 구하시오
		//변수를 한개만 사용해서 계산하세요!
		//변수의 자료형은 int
//		System.out.print("4개의 점수를 계산합니다\n국어 점수 : ");
//		int sum;
//		sum = sc.nextInt();		
//		System.out.print("수학 점수 : ");
//		sum += sc.nextInt();
//		System.out.print("사회 점수 : ");
//		sum += sc.nextInt();
//		System.out.print("영어 점수 : ");
//		sum += sc.nextInt();
//		
//		System.out.println("4개 과목의 점수 합계는 " +sum+ "입니다");
//		System.out.println("평균 점수는 "+(sum*1.0/4)+"입니다");
		
		
		//'+' 문자열 결합 연산과 누적(-, /, *, % 불가능)
//		String msg = ""; //초기화, 누적연산에
						//String msg;로 초기화하면 쓰레기가 있으므로 누적연산에 부적합 
//		System.out.print("입력한 문자열을 같이 출력합니다\n원하는 첫번째 말 입력 : ");
//		msg += sc.nextLine();
//		System.out.print("원하는 두번째 말 입력 : ");
//		msg += sc.nextLine();
//		System.out.print("원하는 세번째 말 입력 : ");
//		msg += sc.nextLine();
//		System.out.print("원하는 네번째 말 입력 : ");
//		msg += sc.nextLine();
//		System.out.println(msg);
		
		
		
		
	}

	public void thirdOper() {
		Scanner sc = new Scanner(System.in);
//		System.out.print("회원 정보를 입력하세요\n아이디 : ");
//		String id = sc.nextLine();
//		System.out.print("패스워드 : ");
//		String pw = sc.nextLine();
//		
//		System.out.println(id.equals("admin")&&pw.equals("abcd")
//		? "로그인 성공"
//		: "로그인 실패");
		
		
		//놀이공원 티켓이 존재하고 키가 140 초과면
		//재미있게 즐기세요! 출력
		//아니면 미안해요 다음에 오세요! 출력
		
		boolean ticket = false;
		int height = 0;
		
		System.out.print("놀이공원에 입장하셨습니다. 입장표가 있나요?\n(y/n) : ");
		ticket=(sc.nextLine().charAt(0) == 'y');
		System.out.print("키가 얼마인가요?\n키 : ");
		height = sc.nextInt();
				
		System.out.print(
				ticket&&(height>140)
				? "입장하셨습니다"
				: (!ticket ?"입장표가 없습니다" :"키가 140 넘어야만 입장 가능합니다"));
		
		
	}
	
	public void testCal() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.printf("현재 a값은 %d, b값은 %d, c값은 %d\n", a, b, c);
		a++; //a 11
		System.out.printf("현재 a값은 %d, b값은 %d, c값은 %d\n", a, b, c);
		b=(--a)+b; // a 10 b 30
		System.out.printf("현재 a값은 %d, b값은 %d, c값은 %d\n", a, b, c);
		c=(a++)+(--b);// a 10 b 29 c (10+29) 39 a 11  
		System.out.printf("현재 a값은 %d, b값은 %d, c값은 %d", a, b, c);
	}

	public void testCal2() {
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
	
	public void testCal3() {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int a, b;
		System.out.print("첫번째 수 입력 : ");
		a = sc1.nextInt();
		System.out.print("\n두번째 수 입력 : ");
		b= sc2.nextInt();
		
		System.out.printf("%d < %d은 %b이다.\n",a, b, a<b);
		System.out.printf("%d > %d은 %b이다.\n",b, a, b>a);
		System.out.printf("%d == %d은 %b이다.\n",a, b, a==b);
		System.out.printf("%d <= %d은 %b이다.\n",b, a, b<=a);
		
	}
	
	public void testCal33() {
		Scanner sc = new Scanner(System.in);		
		int a, b;
		
		System.out.print("첫번째 수 입력 : ");
		a = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		b = sc.nextInt();
		
		System.out.printf("%d는 %s므로 %b입니다\n", 
				a, a%2==0?"2의 배수":"2의 배수가 아니", a%2==0);
		System.out.printf("%d는 %s이므로 %b입니다", 
				b, b%3==0?"3의 배수":"3의 배수가 아님", b%3==0);
		
	}
	
	public void testCal4() {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int a, b;
		System.out.print("첫번째 수 입력 : ");
		a = sc1.nextInt();
		System.out.print("\n두번째 수 입력 : ");
		b= sc2.nextInt();
		
		System.out.println("결과값");
		System.out.printf("%d!=%d && %d<%d은 %b이다.\n",
				a, b, a, b, ((a!=b)&&(a<b))); // 예상값 T && F == F
		System.out.printf("%d<%d || %d<55는 %b이다.\n",
				a, b, --b, ((a<b)||(--b<55))); // 예상값 F || F == F
		System.out.printf("%d!=%d && %d<%d은 %b이다.\n",
				a, b, b--, a++, ((a!=b)&&(b--<a++))); // 예상값 T && T == T
		System.out.printf("%d!=%d || %d>=85는 %b이다.\n",
				a, b, a, b, ((a>b)||(a==b))); // 예상값 T || F == T
		
	}

	public void testCal5() {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.print("첫번째 수 입력 : ");
		a = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		b= sc.nextInt();
		
		System.out.println("결과값");
		System.out.printf("%d==%d || %d++<100은 %b이다.\n",
				a, b, a, ((a==b)||(a++<100))); // 예상값 F || F == F
		System.out.printf("%d<%d && %d<%d는/은 %b이다.\n",
				a, b, a, b, ((a<b)||(a==b))); // 예상값 F || F == F
		System.out.printf("%d!=%d && %d<%d는/은 %b이다.\n",
				a, b, a, b, ((a>b)&&(a!=b))); // 예상값 T && T == T
		System.out.printf("%d!=%d || %d>=%d는/은 %b이다.\n",
				a, b, a, b, ((a>b)||(a==b))); // 예상값 T || F == T
		
	}
	
	public void testCal6() {
		Scanner sc1 = new Scanner(System.in);
		
		int age;
		boolean isTrue = false;
		
		System.out.print("당신의 나이를 숫자로 입력하세요\n나이 : ");
		age = sc1.nextInt();
		isTrue = age >= 19;
		
		
		
//		if (isTrue) {
//			Scanner sc2 = new Scanner(System.in);
//			String gender;
//			
//			System.out.println("성인입니다. 들어오세요");
//			System.out.println("당신은 남자입니까/여자입니까?");
//			System.out.print("남자 혹은 여자 문자를 입력 : ");
//			gender = sc2.nextLine();
//			
//			if(gender.equals("남자")) {
//				System.out.println("왼쪽으로 가세요");
//			} else if(gender.equals("여자")) {
//				System.out.println("오른쪽으로 가세요");
//			} else {
//				System.out.println("잘못된 문자를 입력했습니다.");
//			}
//			
//		} else {
//			System.out.println("미성년자 입니다. 들어올 수 없습니다.");
//		}
		
	}
}

