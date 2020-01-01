package kh.vari.function;

import java.util.Scanner;

public class ScannerTest {
	public void inputTest() {
		//Scanner 객체 생성 -> 변수에 보관
		Scanner sc = new Scanner(System.in); //sc는 new 생성자의 값을 받은 참조형 변수
		//숫자입력 - 정수
//		System.out.print("당신의 나이를 입력 하세요\n나이(숫자) : ");
//		int age = sc.nextInt();	//입력된 값은 변수를 선언하여 보관해야 한다.
		
		//숫자입력 - 실수
//		System.out.print("당신의 키를 입력하세요\n키(숫자) : ");
//		double height = sc.nextDouble();
		
		//출력
//		System.out.printf("당신의 나이는 %d살 이고, 당신의 키는 %.02fcm 네요!\n", age, height);
		
//		System.out.print("당신의 취미는 무엇입니까?\n취미 : ");
//		String hobby = sc.next();//띄어쓰기를 구분자로 두고 구분자 이전의 값을 모두 가져온다. 남은 데이터는 버퍼에 그대로 둔다.
//		System.out.print("취미가 "+hobby+"네요.\n");
////		
//				
//		String test = sc.nextLine();	
//		System.out.print("이런.. buffer에 \'"+test+"\'가 남아 있네요\n"); //buffer에 입력된 값이 남아있다.
////		next(), nextInt(), nextDouble()은 띄어쓰기 이전 값은 가져오고 그 이후 값은  buffer에 남긴다
////		buffer영역을 비우고 싶으면, nextLine()을 한번 입력한다.
//		System.out.print("당신의 취미는 무엇입니까?\n취미 : ");
//		sc.nextLine(); //buffer 비우기
//		String line= sc.nextLine();	//buffer에 값을 모조리 가져온다
//		System.out.print("당신의 취미는 "+line); 
		
		
		//char형 입력받기
		System.out.print("당신의 등급은 무엇입니까?\n(예시 : S, R, A, B):");
//		char grade = (char)sc.nextLine(); //String은 char로 형변환 할 수 없다. 문자열은 배열이기 때문
		char grade1 = sc.nextLine().charAt(0);
		
		System.out.println("등급 : " + grade1);		
		System.out.println("Rclass".charAt(3)); // zero부터 시작하는 컴퓨터 생활
		String content = "하하하 이제 실습시간!";
		System.out.println(content.charAt(5));
		
	}	
}
