package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�Է� : ");
		int input=sc.nextInt();
		if(input%2==0) {//2�� ������
			System.out.println("�Է��� "+input+"�� 2�� ����Դϴ�");
		} else {
			System.out.println("�Է��� "+input+"�� 2�� ����� �ƴմϴ�");
		}
	}
}
