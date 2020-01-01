package com.obj.main;

import com.obj.controller.ReturnTest;

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
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
