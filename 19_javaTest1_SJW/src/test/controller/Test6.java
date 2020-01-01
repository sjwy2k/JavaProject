package test.controller;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
			boolean flag=false;
			int input=0;
			while(!flag) {
				System.out.print("정수 입력 : ");
				input=sc.nextInt();
				flag=checkNum(input);
			}
		
			switch(input) {
				case 1:System.out.println("** 입력이 정상적으로 되었습니다! **");return;
				case 2:System.out.println("** 조회가 시작되었습니다! **");return;
				case 3:System.out.println("** 수정이 정상적으로 되었습니다! **");return;
				case 4:System.out.println("** 삭제가 정상적으로 되었습니다! **");return;
				case 5:System.out.println("** 정상적으로 종료되었습니다! **");return;
				default:System.out.println("** 다시 입력해 주세요. **"); break;
			}
		}while(true);
	}
	
	public static boolean checkNum(int num) {
		boolean flag=false;
		if(num>0&&num<10) {
			flag=true;
		} else {
			System.out.println("입력값은 1과 9 사이를 입력해야 합니다.");		
		}
		return flag;
	}
}
