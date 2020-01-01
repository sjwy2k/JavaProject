package com.doublerepeat.controller;

import java.util.Scanner;

public class RepeatTest {

	//기본 중첩반복문을 처리해보자
	public void doubleRepeat() {
		//구구단 출력하기
//		for(int i=2; i<10; i++) {
//			System.out.println(i+"단");
//			for(int j=1; j<10; j++) {				
//				if(j==3) System.out.print(i+" * "+j+" = "+i*j+"\n");
//				else if(j==6) System.out.print(i+" * "+j+" = "+i*j+"\n");
//				else System.out.print(i+" * "+j+" = "+i*j+"	");
//			}
//			System.out.println();
//		}
		//중첩반복문으로 배열에 있는값의 중복개수를 확인가능
//		int[] nums = {1, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 4, 3, 2, 1};

//		String result="";
//		for(int i=0; i<nums.length; i++) {
//			int count=0;
//			String value="";
//			for(int n=0; n<nums.length; n++) {
//				if(i!=n&&nums[i]==nums[n]) {
//					count++;					
//				}
//			}
//			System.out.print(nums[i]+"의 중복 개수는 : "+count+"\n");
//		}
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//		for(int i=0; i<nums.length; i++) {
//			if(input==nums[i]) {
//				count++;
//			}
//		}
//		System.out.println("입력한 "+input+"과 같은값의 개수는 "+count);
		
		end:
		for(int i=2; i<10; i++) {
//			if(i%2==0) continue;break;
			System.out.println(i+"단");
			for(int j=1; j<10; j++) {	
				if(j%2==0) continue end;
				if(j==3) System.out.print(i+" * "+j+" = "+i*j+"\n");
				else if(j==6) System.out.print(i+" * "+j+" = "+i*j+"\n");
				else System.out.print(i+" * "+j+" = "+i*j+"	");
			}
			System.out.println();
		}
		
	}
	
	

}
