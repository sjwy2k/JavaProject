package kh.vari.function;

import java.util.Scanner;

public class VariExample {
	
	public void Example0() {		
			
		String name = "";
		int age = 0;
		String address = "";
		double height = 0;
		double weight = 0;
		char gender;
		
		Scanner sc1 = new Scanner(System.in),
				sc2 = new Scanner(System.in),
				sc3 = new Scanner(System.in),
				sc4 = new Scanner(System.in),
				sc5 = new Scanner(System.in),
				sc6 = new Scanner(System.in);
		System.out.print("이름을 입력하세요.\n이름 : ");	
		name = sc1.nextLine();
		System.out.print("나이를 입력하세요.\n나이 : ");
		age = sc2.nextInt();
		System.out.print("주소를 시/구/동 까지 입력하세요.\n주소 : ");
		address = sc3.nextLine();
		System.out.print("키를 입력하세요.\n키 : ");
		height = sc4.nextDouble();
		System.out.print("몸무게를 입력하세요.\n몸무게 : ");
		weight = sc5.nextDouble();
		System.out.print("성별을 입력하세요.\n성별(M/F): ");
		gender = sc6.next().charAt(0);
				
		System.out.printf("\n결과값!!\n이름 : %s\n나이 : %d\n"
				+ "주소 : %15s\n키 : %.0f\n"
				+ "몸무게 : %.1f\n성별 : %c", name, age, address, height, weight, gender);
		
	}
	
	public void Example() {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		int a, b, c, d, e;
		double f;
		
		System.out.print("\n\n첫번째 예제! 정수 두 개를 입력받아 두수의 합, 차, 곱, 나누기 구하기!\n");
		System.out.print("정수 값을 입력하세요\n첫번째 정수 : ");
		a = sc1.nextInt();
		System.out.print("나머지 정수 값을 입력하세요\n두번째 정수 : ");
		b = sc2.nextInt();
		c = a+b;
		d = a-b;
		e = a*b;
		f = a/(double)b; //정수 값과 정수 값을 나누면 몫만 남고 나머지는 버려진다.
		//소수점 값을 표현려면 나누는 값 둘 중 하나를 실수 값으로 형변환 해야 한다. 
		
		System.out.printf("두 수의 합 : %d + %d = %d\n",a, b, c);
		System.out.printf("두 수의 차 : %d - %d = %d\n",a, b, d);
		System.out.printf("두 수의 곱 : %d * %d = %d\n",a, b, e);
		System.out.printf("두 수의 나누기 : %d / %d = %.02f",a, b, f);
	}
	
	public void Example2() {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		double a, b, c, d;
		
		System.out.print("\n\n두번째 예제! 가로, 세로 실수값을 입력받아 사각형의 면적과 둘레를 구하기!\n");
		System.out.print("가로 값을 입력하세요\n(실수 값 두 자리) : ");
		a = sc1.nextDouble();
		System.out.print("세로 값을 입력하세요\n(실수 값 두 자리) : ");
		b = sc2.nextDouble();
		c = a*(double)b;
		d = (double)(a+b)*2;
		
		System.out.printf("사각형의 면적 : 가로 %.2f * 세로 %.2f = %.2f (cm)\n",a, b, c);
		System.out.printf("사각형의 둘레 : (가로 %.2f + 세로 %.2f) * 2 = %.2f (cm)\n",a, b, d);		
		
	}
	
	public void Example3() {		
		Scanner sc = new Scanner(System.in);		
		
		String words = "";
		char a, b, c;
		
		System.out.print("\n세번째 예제! 영어 문자열 값을 키보드로 입력받아 3개 자리까지의 문자 구하기!\n");
		System.out.print("문자열을 입력하세요 : ");
		words = sc.nextLine();
		
		a = words.charAt(0);
		b = words.charAt(1);
		c = words.charAt(2);
		
		System.out.printf("\n첫번째 문자 : %c\n"
				+ "두번째 문자 : %c\n"
				+ "세번째 문자 : %c", a, b, c);
		
	}
}
