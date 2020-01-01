package com.ex.controller;

import java.util.Scanner;

public class ExController {

	public void printStudent() {
		Scanner sc = new Scanner(System.in);
		//학생 입력받은 수 만큼 학생정보를 입력받아 출력
		//몇명 입력받을지 사용자가 결정
		
		System.out.print("입력할 학생수 : ");
		int studentsCount=sc.nextInt();
		sc.nextLine();
		String students="";//출력문을 누적시켜 한번에 출력
		
		//입력 로직을 반복해야함 for||while
		//평균 나이, 몸무게, 키 출력
		//이름, 나이, 주소, 키, 몸무게, 전화번호		
		
		int sumAge=0;
		double sumHeight=0, sumWeight=0;
		
		for(int i=0; i<studentsCount; i++) {
			//학생입력 로직을 구성
			System.out.print("이름 : ");
			String name=sc.nextLine();
			System.out.print("나이 : ");
			int age=sc.nextInt();
			sumAge+=age;
			sc.nextLine();//버퍼비우기
			System.out.print("주소 : ");
			String address=sc.nextLine();
			System.out.print("키 : ");
			double height=sc.nextDouble();
			sumHeight+=height;
			System.out.print("몸무게 : ");
			double weight=sc.nextDouble();
			sumWeight+=weight;
			sc.nextLine();//버퍼비우기
			System.out.print("전화번호 : ");
			String phone=sc.nextLine();
			students += name+" "+age+"세 "+address+" "+height+"cm "+weight+"kg "+phone+"\n";
		}
		
		System.out.println(students);
		System.out.printf("평균 나이 : %.1f\n",sumAge*1.0/studentsCount);
		System.out.printf("평균 키 : %.1f\n",sumHeight/studentsCount);
		System.out.printf("평균 몸무게 : %.1f",sumWeight/studentsCount);
		
	}

	public void productsTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 개수 입력 : ");
		int proCount = sc.nextInt();
		
		//상품 출력 변수
		String products=""; 
		
		//상품의 종류별 갯수 확인하는 변수
		int phoneCount=0, comCount=0, gajeonCount=0;
		
		//상품의 종류별 금액을 누적시킬 변수
		int phonePrice=0, comPrice=0, gajeonPrice=0;
		
		for(int i=0; i<proCount; i++) {
			System.out.print("상품코드 : ");
			String pCode=sc.next();
			
			System.out.print("상품종류 : ");
			String pList=sc.next();
						
			sc.nextLine();
			System.out.print("상품명 : ");
			String pName=sc.nextLine();
			
			System.out.print("상품가격 : ");
			int pPrice=sc.nextInt();
			
			switch(pList) {
				case "핸드폰" : phoneCount++; phonePrice+=pPrice; break;
				case "컴퓨터" : comCount++; comPrice+=pPrice; break;
				case "가전" : gajeonCount++; gajeonPrice+=pPrice; break;
			}
			products+=pCode+" "+pList+" "+pName+" "+pPrice+"만원"+"\n";
		}
		
		System.out.println(products);
		System.out.printf("핸드폰 평균 가격 : %.0f만원\n", phonePrice*1.0/phoneCount);
		System.out.printf("컴퓨터 평균 가격 : %.0f만원\n", comPrice*1.0/comCount);
		System.out.printf("가전 평균 가격 : %.0f만원", gajeonPrice*1.0/gajeonCount);
	}

	public void orderProgram() {
		//분식집 주문받는 프로그램 만들기
		Scanner sc=new Scanner(System.in);
		
		//출력문을 누적할 변수(반복문에 포함시키면 안됨)
		String choiceMenu = "";
		//합계금액 보관할 변수
		int totalPrice=0;
		
		do {
			//메뉴 출력
			System.out.println("김밥류========================");
			System.out.println("1. 원조김밥============1000원");
			System.out.println("2. 치즈김밥============1200원");
			System.out.println("3. 참치김밥============2000원");
			System.out.println("라면========================");
			System.out.println("4. 그냥라면============1200원");
			System.out.println("5. 치즈라면============1500원");
			System.out.println("6. 짬뽕라면============2000원");
			System.out.println("기타========================");
			System.out.println("7. 튀김============1200원");
			System.out.println("8. 순대============2500원");
			System.out.println("9. 오뎅============1000원");
			System.out.println("10. 음료수============800원");
			//입력 선택
			System.out.print("메뉴선택 : ");
			int choice=sc.nextInt();
			System.out.print("수량선택 : ");
			int count=sc.nextInt();
			System.out.printf("%d개를 주문하셨습니다.\n", count);
			//주문내역 저장하기
			switch(choice) {
				case 1 : 
					choiceMenu += "원조김밥 : "+count+"개 - "+(1000*count)+"원\n";
					totalPrice+=(1000*count);
					break;
				case 2 : 
					choiceMenu += "치즈김밥 : "+count+"개 - "+(1200*count)+"원\n";
					totalPrice+=(1200*count);
					break;
				case 3 : 
					choiceMenu += "참치김밥 : "+count+"개 - "+(2000*count)+"원\n";
					totalPrice+=(2000*count);
					break;
				case 4 : 
					choiceMenu += "그냥라면 : "+count+"개 - "+(1200*count)+"원\n";
					totalPrice+=(1200*count);
					break;
				case 5 : 
					choiceMenu += "치즈라면 : "+count+"개 - "+(1500*count)+"원\n";
					totalPrice+=(1500*count);
					break;
				case 6 : 
					choiceMenu += "짬뽕라면 : "+count+"개 - "+(2000*count)+"원\n";
					totalPrice+=(2000*count);
					break;
				case 7 : 
					choiceMenu += "튀김 : "+count+"개 - "+(1200*count)+"원\n";
					totalPrice+=(1200*count);
					break;
				case 8 : 
					choiceMenu += "순대 : "+count+"개 - "+(2500*count)+"원\n";
					totalPrice+=(2500*count);
					break;
				case 9 : 
					choiceMenu += "오뎅 : "+count+"개 - "+(1000*count)+"원\n";
					totalPrice+=(1000*count);
					break;
				case 10 : 
					choiceMenu += "음료수 : "+count+"개 - "+(800*count)+"원\n";
					totalPrice+=(800*count);
					break;
				
			}
			System.out.print("추가 주문하시겠습니까?(y/n)");
			char flag=sc.next().charAt(0);
			
		
			
			if(flag=='n') { 
				break; //무한반복문을 끝내는 조건
			}
		} while(true);
		//y를 누를 때 메뉴를 다시 보여주려면 반복문이 필요
		//무한 반복문(몇번 반복할 지 모르니까)
		System.out.println("*주문하신 정보는 다음과 같습니다.*");
		System.out.println("============================");
		System.out.print(choiceMenu);
		System.out.println("============================");
		System.out.println("총 가격 : "+totalPrice);
		//변수 선정
		
		
		
		
	}

	public void monsterHunt() {
		Scanner sc = new Scanner(System.in);
		
		int result=0;
		int totalExp=0;
		
		System.out.println("============몬스터 사냥하기============");
		System.out.println("0. 사냥시작");
		System.out.println("1. 오크사냥");
		System.out.println("2. 용사냥");
		System.out.println("3. 사람사냥");
		System.out.println("99. 끝내기");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		
		boolean flag=false;
		if(!(choice==99)) {
			System.out.println("사냥을 시작합니다.");
			flag=true;
		}
		
		do {
			if(choice==0) {	
				System.out.println("============몬스터 사냥하기============");
				System.out.println("1. 오크사냥");
				System.out.println("2. 용사냥");
				System.out.println("3. 사람사냥");
				System.out.println("99. 끝내기");
				System.out.print("입력 : ");
				int input = sc.nextInt();
				
				switch(input) {
					case 1: 
						result++; 
						totalExp+=1; 
						System.out.println("오크 사냥완료 +1 xp"); 
						break; 
					case 2: 
						result++; 
						totalExp+=15; 
						System.out.println("용 사냥완료 +15 xp"); 
						break;
					case 3: 
						result++; 
						totalExp+=5; 
						System.out.println("사람 사냥완료 +5 xp"); 
						break;
					case 99:
						System.out.println("사냥을 마쳤습니다.");
						flag=false;
						break;
				}
			} 
		}while(flag);
		System.out.println("사냥한 몹의 수는 "+result+"마리, 획득한 경험치는 "+totalExp+"Exp 입니다");
		
	}

	
}
