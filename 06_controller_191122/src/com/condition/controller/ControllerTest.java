package com.condition.controller;

import java.util.Scanner;

class Calculator {
	static int add(int n1, int n2) {
		return n1 + n2;
	}
	static int sub(int n1, int n2) {
		return n1 - n2;
	}
	static int mul(int n1, int n2) {
		return n1 * n2;
	}
	static int div(int n1, int n2) {
		return n1 / n2;
	}
}

public class ControllerTest {
	//기본 if문 활용
	public void basicIf() {
		//if문이란
		//프로그램의 흐름을 제어할 수 있는 조건문으로
		//()안에 조건식을 넣어 조건에 따라 내용을 실행하거나 실행하지 않도록 분기할 수 있음
		//조건의 결과는 반드시 true/false/로 나와야 하고 true일 경우 만 실행
		//통상 비교연산, 논리연산을 활용하여 구성함(논리식 중요)
		//if(조건이 true일때) { 실행될 내용} 
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("당신의 나이는?\n나이 : ");
//		int age = sc.nextInt();
//		
//		if(age>19) {
//			System.out.println("성년이네요");			
//		} else if(age<=19) {
//			System.out.println("미성년이네요");
//		}
		
		//숫자하나를 입력받고 입력받은 숫자가 
		//3의 배수이면 3의 배수를 출력하시오
		
//		System.out.print("정수 하나를 입력하세요\n숫자 : ");
//		int checkThree=sc.nextInt();
//		
//		if(checkThree%3==0) {
//			System.out.printf("입력한 3의 배수는 %d 입니다", checkThree);
//		} else if(checkThree%3!=0) {	
//			System.out.printf("입력한 %d 숫자는 3의 배수가 아닙니다", checkThree);
//		}
		//월급은 어떤 자료형으로 입력할 것인가? 정수
		//실 생활에서의 자료형 선택을 고려
//		//월급을 입력받아 300~500이면 월급 좀 받으시네요 문구 출력		
//		System.out.print("월급의 액수를 입력하세요\n월급 : ");
//		int checkSalary=sc.nextInt();
//		
//		if(checkSalary>=300&&checkSalary<=500) {
//			System.out.printf("%d만원! 월급 좀 받으시네요\n", checkSalary);
//		} else if(checkSalary%3!=0) {	
//			System.out.printf("%d만원 정도면 한달 생활이 빠듯하겠네요\n", checkSalary);
//		}
//		
//		//id, pw를 입력받고
//		//id가 admin이고 pw가 admin이거나
//		//id가 user01이고 pw가 user01일경우
//		//로그인성공 출력
		
//		System.out.print("아이디를 입력하세요\n아이디 : ");
////		sc.nextLine(); 
//		//위에 데이터를 받아왔을 경우 nextLine()을 사용하기 전 필히 비워야 한다.
//		String id = sc.nextLine();
//		System.out.print("패스워드를 입력하세요\n패스워드 : ");
//		String pw = sc.nextLine();
//		
//		
//		if(id.equals("admin")&&pw.equals("admin")
//				||id.equals("user01")&&pw.equals("user01")) {
//				System.out.println("로그인 성공!");
//		} else if(!(id.equals("admin")&&pw.equals("admin")||id.equals("user01")&&pw.equals("user01"))) {	
//				System.out.println("아이디 혹은 패스워드가 일치하지 않습니다!");
//		}
		
		//간단if문1
		System.out.print("동물, 식물중 어느것을 좋아하세요?\n선택 : ");
		String flag = sc.nextLine();
		if(flag.equals("동물")) {
			System.out.println("동물");
		}
		
		//간단if문2
		System.out.print("나이가 몇살이에요?\n나이 : ");
		int age = sc.nextInt();
		if(age>=8&&age<=12) {
			System.out.println("초딩이네요!!");
		} else if(age>=13&&age<=16) {
			System.out.println("중딩이네요!!");
		} else if(age>=17&&age<=19) {
			System.out.println("고딩이네요!!");
		}
		
		//간단if문3
		System.out.print("월급을 입력하세요\n월급 : ");
		int salary = sc.nextInt();
		if(salary>=5000) {
			System.out.println("고액연봉자네요! 한턱 쏘세요~!");
		}
		System.out.println();
		//실습1 우수생
		System.out.print("성적을 입력하세요\n국어 : ");
		int korean = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = 0;
		sum += korean += eng += math;
		System.out.printf("성적 총합은 %d점 입니다.\n",sum);
		if(sum>=250) {
			System.out.println("우수생");
		}
		
		System.out.println();
		//실습2 연봉
		System.out.print("연봉을 입력하세요\nA의 연봉 : ");
		int aSal = sc.nextInt();
		System.out.print("B의 연봉 : ");
		int bSal = sc.nextInt();
		System.out.print("C의 연봉 : ");
		int cSal = sc.nextInt();
		
		if(aSal>=5000) {
			System.out.println("A는 고액연봉자입니다");
		}
		if(bSal>=5000) {
			System.out.println("B는 고액연봉자입니다");
		}
		if(cSal>=5000) {
			System.out.println("C는 고액연봉자입니다");
		}
		
		System.out.println();
		//실습3 홀수 짝수
		System.out.print("홀수 짝수를 체크합니다\n정수 입력 : ");
		int oddEven = sc.nextInt();
		
		if(oddEven%2==0) {
			System.out.println("짝수입니다");
		} else if(oddEven%2!=0){
			System.out.println("홀수입니다");
		}
		
	}
	
	public void ifelseTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한개 입력\n정수 : ");
		int su = sc.nextInt();
		
		if(su%2==1) {
			System.out.println("입력한 "+su+"는 홀수");
		} else {
			System.out.println("입력한 "+su+"는 짝수");
		}
		
		
		System.out.print("당신의 나이는?\n나이 : ");
		int age = sc.nextInt();
		boolean ticket = true;
		
		if(age>19) {
			System.out.println("당신은 성인입니다");
		} else {
			System.out.println("당신은 미짜입니다 돌아가세요");
		}
		
//		if() { } else { } if를 확인하고 true면 else를 읽지 않음
//		if() { } if{ } if를 확인하고 재차 다른 if로 확인, 건너뛰지 않음 
		if(age>19||ticket) {
			System.out.println("당신은 성인입니다");
		} 
		if(!(age>19)||ticket){
			System.out.println("당신은 미짜입니다 돌아가세요");
		}
		
	}
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수:");
		int su = sc.nextInt();
		System.out.print("두번째 정수:");
		int su2 = sc.nextInt();
		
		sc.nextLine();
		System.out.print("연산자(+,-,*,/) 중에 하나 입력:");
		char op = sc.next().charAt(0);
//		if(su<=0&&su2<=0){
//			System.out.println("양수를 입력하세요");
//		}else if(op=='+') {
//			System.out.println("더하기 : "+su+op+su2+"="+(su+su2));
//		}else if(op=='-') {
//			System.out.println("빼하기 : "+su+op+su2+"="+(su-su2));
//		}else if(op=='*') {
//			System.out.println("곱하기 : "+su+op+su2+"="+(su*su2));
//		}else if(op=='/') {
//			System.out.println("나누기 : "+su+op+su2+"="+(su*1.0/su2));
//		} else {
//			//위의 기준값은 op, 연산자를 기준으로 분기 처리
//			//위에 있는 연산자와 맞지 않는 값이 들어오면 else가 실행
//			System.out.println("연산자가 맞지 않습니다");
//		}
		
		if(su>0
			||su2>0
			||op=='+'
			||op=='-'
			||op=='*'
			||op=='/') 
		{
			if(op=='+') {
				System.out.println("더하기 연산");
			}else if(op=='-') {
				if(su-su2<0) {
					
				}
				System.out.println("兮?연산");
			}else if(op=='*') {
				System.out.println("곱하기 연산");
			}else if(op=='/') {
				System.out.println("나누기 연산");
			}else {
				System.out.println("연산자 오류");
			}			
		} else {
			System.out.println("잘못된 값 입력");
		}
		
		
		
	}
	
	public void ifExam1() {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		String check = ""; 
		
		System.out.print("계산기로 계산합니다. \n첫번째 정수 : ");
		a = sc.nextInt();
				
		System.out.print("두번째 정수 : ");
		b = sc.nextInt();
		
		sc.nextLine();
		System.out.print("연산자를 입력하세요 (+,-,*,/ 만 가능)\n연산자 : ");
		check = sc.nextLine();
				
		if(check.equals("+")
			||check.equals("-")
			||check.equals("*")
			||check.equals("/")) {
			if(check.equals("+")) {
				System.out.printf("계산값!! %d %s %s = %d",a,check, b, Calculator.add(a, b));
			}
			if(check.equals("-")) {
				System.out.printf("계산값!! %d %s %s = %d",a,check, b, Calculator.sub(a, b));
			}
			if(check.equals("*")) {
				System.out.printf("계산값!! %d %s %s = %d",a,check, b, Calculator.mul(a, b));
			}
			if(check.equals("/")) {
				System.out.printf("계산값!! %d %s %s = %d",a,check, b, Calculator.div(a, b));
			}
		} else {
			System.out.println("연산자를 잘못 입력하셨습니다");
		}
		
//		if(check.equals("+")) {
//			calc ="+";
//		} else {
//			if(check.equals("-")) {
//				calc ="-";
//			} else {
//				if(check.equals("*")) {
//					calc ="*";
//				} else {
//					if(calc.equals("/")) {
//						calc ="/";
//					} else {
//						System.out.println("연산자를 잘못 입력하셨습니다");
//					}
//				}
//			}			
//		}
		
//		System.out.printf("계산값!! %d %s %s = %d",a,calc, b, a+b);
		
	}
	
	public void ifelseifTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("level 입력\n레벨 : ");
		int level = sc.nextInt();
		
		
//		if(level > 300) {
//			System.out.println("너 미쳤니?");
//		} else if (level >= 200) {
//			System.out.println("너 약간 미쳤니?");
//		} else if(level >= 100) {
//			System.out.println("게임 취미로 하는구나");
//		}
		
		//else if가 아니면 if는 개별로 모두 적용
//		if(level >= 300) {
//			System.out.println("너 미쳤니?");
//		} 
//		if(level <= 300 && level >= 200) {
//			System.out.println("너 약간 미쳤니?");
//		} 
//		if(level <= 200 && level >= 100) {
//			System.out.println("게임 취미로 하는구나");
//		}
		
		
		String msg = "";
		if(level > 300) {
			msg="너 미쳤니?";
		} else if(level >=200) {
			msg="너 약간 미쳤니?";
		} else if(level >=100) {
			msg="정상인";
		} else {
			msg = "난 안해!";
		}
		System.out.println(msg);
		
	}
	
	public void ifExam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~10 사이의 정수 입력\n정수:");
		int num = sc.nextInt();
		if(num < 0){
			System.out.println("양수를 입력해야 합니다");
		} else if(num%2==0) {
			System.out.println("짝수");
		} else if(num%2==1) {
			System.out.println("홀수");
		} else {
			System.out.println("1~10 사이의 정수를 입력해야 합니다");
		}
	}

	public void ifExam3() {
		Scanner sc = new Scanner(System.in);
		double height, weight;
		System.out.print("키 입력:");
		height = sc.nextDouble();
		System.out.print("체중 입력:");
		weight = sc.nextDouble();
		
		double bmi = weight/(height*0.01*height*0.01);
		
		if(bmi<20) {
			System.out.printf("bmi는 %.2f이므로 저체중", bmi);
		} else if(bmi>=20&&bmi<25) {
			System.out.printf("bmi는 %.2f이므로 정상체중", bmi);
		} else if(bmi>=25&&bmi<30) {
			System.out.printf("bmi는 %.2f이므로 과체중", bmi);
		} else if(bmi>=30) {
			System.out.printf("bmi는 %.2f이므로 비만", bmi);
		}
		
	}

	

}

