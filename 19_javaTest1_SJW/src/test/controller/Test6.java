package test.controller;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
			boolean flag=false;
			int input=0;
			while(!flag) {
				System.out.print("���� �Է� : ");
				input=sc.nextInt();
				flag=checkNum(input);
			}
		
			switch(input) {
				case 1:System.out.println("** �Է��� ���������� �Ǿ����ϴ�! **");return;
				case 2:System.out.println("** ��ȸ�� ���۵Ǿ����ϴ�! **");return;
				case 3:System.out.println("** ������ ���������� �Ǿ����ϴ�! **");return;
				case 4:System.out.println("** ������ ���������� �Ǿ����ϴ�! **");return;
				case 5:System.out.println("** ���������� ����Ǿ����ϴ�! **");return;
				default:System.out.println("** �ٽ� �Է��� �ּ���. **"); break;
			}
		}while(true);
	}
	
	public static boolean checkNum(int num) {
		boolean flag=false;
		if(num>0&&num<10) {
			flag=true;
		} else {
			System.out.println("�Է°��� 1�� 9 ���̸� �Է��ؾ� �մϴ�.");		
		}
		return flag;
	}
}
