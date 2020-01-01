package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("입력 : ");
		int input=sc.nextInt();
		if(input%2==0) {//2의 배수라면
			System.out.println("입력한 "+input+"은 2의 배수입니다");
		} else {
			System.out.println("입력한 "+input+"은 2의 배수가 아닙니다");
		}
	}
}
