package com.obj.main;

import com.obj.controller.ReturnTest;
import com.obj.model.vo.Member;

public class ReturnMain {
	//static 메서드
	public static void main(String[] args) {
		ReturnTest rt=new ReturnTest();
//		rt.returnVoidTest();//호출
//		System.out.println(rt.returnVoidTest());
//		System.out.println("되돌아 왔니?");
		
		//int받기
//		rt.calculator();
//		int result=rt.calc(); //에러나지않음
//		if(result>600) {
//			System.out.println("크다");
//		} else {
//			System.out.println("작다");
//		}
		
		//String 받기
//		String msg=rt.msgTest();
//		System.out.println(msg);
		
		
		//배열받기
		int[] arr=rt.arrayReturn();
		//arrayReturn()메서드가 없으면? 일일히 기능을 만들어야..
		//int arr=new int[5]
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=(i+1)*10;
//		}
//		System.out.println(arr.length); //test=int[5]
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		int[] arr2=rt.arrayReturn();
//		System.out.println(arr2[0]);
		
		
		//객체를 메소드이용해서 생성하기
		Member member1=rt.createMember();
		System.out.println(member1.getId()+" : "+member1.getName());
		Member member2=rt.createMember();
	}

}
