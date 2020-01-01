package com.arraytest.controller;

import java.util.Scanner;

public class ArrayEx {

	public void ex06() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String word=sc.nextLine();
		System.out.print("찾을 문자 입력 : ");
		char check=sc.next().charAt(0);		
		char[] wordch=new char[word.length()];
		int count=0;
		
		for(int i=0; i<word.length(); i++) {
			wordch[i]=word.charAt(i);
		}
		for(int i=0; i<word.length(); i++) {
			if(check==wordch[i]) {
				count++;
			}
		}
		System.out.println("입력하신 문자열 "+word+"에서 찾으시는 문자 "+check+"은 "+count+"개 입니다");		
		
	}

	public void ex07() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		System.out.print("입력 : ");
		String idNum=sc.nextLine();
		char[] copyIdNum=new char[idNum.length()];
		for(int i=0; i<idNum.length(); i++) {
			copyIdNum[i]=idNum.charAt(i);
		}
		System.out.println("기존 주민번호 : "+idNum);
		System.out.print("바뀐 주민번호 : ");
		for(int i=0; i<copyIdNum.length; i++) {
			if(i>7) {
				System.out.print("*");
			} else{
				System.out.print(copyIdNum[i]);
			}			
		}
		
	}

	public void ex08() {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 입력");
		System.out.print("입력 : ");
		int num=sc.nextInt();
		
		System.out.print("[");
		for(int i=0; i<num; i++) {
			if(num/2>i) {
				System.out.print(i+1);
			} else {
				System.out.print(num-i);
			}
			if(i!=num-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
	
	public void ex09() {
		System.out.print("오늘의 로또 번호 : ");
		int[] nums=new int[6];
		int lotto=0;
		boolean flag = false;
		nums[0]=(int)((Math.random()*45)+1);
		
		
		System.out.print("[");		
		
		//로또 로직
		for(int i=1; i<nums.length; i++) {
			lotto=(int)((Math.random()*45)+1);
			for(int j=0; j<=i; j++) {//i번만큼 반복
				if(nums[j]==lotto) { //같은 값이 랜덤값에서 있을경우
					i=0;//0으로 바꾸고 출력하지 않음
					break;
				}
			}
			nums[i]=lotto;//로또 번호 중복이 없으므로 입력
		}
		
		//오름차순 로직
		int temp=0;
		for(int i=0; i<6; i++) {
			for(int j=i; j<6; j++) {
				if(nums[i]<nums[j]) {//i의 값이 j보다 작니?
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		
		//출력 로직
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
			if(i<nums.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		
	}
}
