package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		int input=0, input2=0;
		while(!flag) { //���� ���� ������ �ʾҴٸ� ����
			System.out.print("ù��° ���� �Է� : ");
			input=sc.nextInt();
			flag=checkNum2(input); //���� ���� ������ true
		}
		flag=false;
		while(!flag) { //���� ���� ������ �ʾҴٸ� ����
			System.out.print("�ι�° ���� �Է� : ");
			input2=sc.nextInt();
			flag=checkNum2(input2);
		}
		
		int result=input*input2;
		System.out.println(result>9?"���ڸ� �� �Դϴ�":"���ڸ� �� �Դϴ�");
		
	}
	
	public static boolean checkNum(int num) {
		boolean flag=false;
		if(num!=0) {
			flag=true;
		} else {
			System.out.println("�Է°��� 0���� �� ū ���� �Է��ؾ� �մϴ�.");		
		}
		return flag;
	}
	
	public static boolean checkNum2(int num) {
		boolean flag=false;
		if(num>0&&num<10) {
			flag=true;
		} else {
			System.out.println("�Է°��� 1�� 9 ������ ���� �Է��ؾ� �մϴ�");		
		}
		return flag;
	}
}
