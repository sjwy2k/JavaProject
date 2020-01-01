package com.calculator.controller;

public class ParameterTest {

	//매개변수가 있는 메소드
	public void printMsg(String msg, int su) {
		System.out.println(su+"번 "+msg);
	}
	
	public String joinString(String msg1, String msg2) {
		return msg1+msg2;
	}
	
	//객체를 매개변수로 전달
	//얕은 복사!! -> 주소값만 복사해서 다른복사가 가지고 있는 것

	public void arrayUpdate(int[] nums) {
		System.out.println("arrayUpdate - "+nums.hashCode());
		for(int i=0; i<nums.length; i++) {
			if(i%2==0) {
				nums[i]=100;
			}
		}
	}
	
	public int change(int a) {
		a++;
		return a;
	}
}
