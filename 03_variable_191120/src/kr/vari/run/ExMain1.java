package kr.vari.run;
import java.util.Scanner;

public class ExMain1 {
	public static void main(String[] args) {
		
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
		System.out.println("이름을 입력하세요.\n이름 : ");	
		name = sc1.nextLine();
		System.out.println("나이를 입력하세요.\n나이 : ");
		age = sc2.nextInt();
		System.out.println("주소를 시/구/동 까지 입력하세요.\n주소 : ");
		address = sc3.nextLine();
		System.out.println("키를 입력하세요.\n키 : ");
		height = sc4.nextDouble();
		System.out.println("몸무게를 입력하세요.\n몸무게 : ");
		weight = sc5.nextDouble();
		System.out.println("성별을 입력하세요.\n성별(M/F): ");
		gender = sc6.next().charAt(0);
				
		System.out.printf("\n\n\n결과값!!\n이름 : %s\n나이 : %d\n주소 : %15s\n키 : %.0f\n몸무게 : %.1f\n성별 : %c", name, age, address, height, weight, gender);
		
	}
}
