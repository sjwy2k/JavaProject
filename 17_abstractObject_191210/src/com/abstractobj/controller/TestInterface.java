package com.abstractobj.controller;

public interface TestInterface extends TestInter2, TestInter3{

	//상수인 자료형(static final)만 선언가능

	public static final String name="유병승";
	
	//추상메서드만 선언이 가능함
//	public void printContent(String msg) {
//		System.out.println(msg);
//	}
	//구현되지않은 추상메서드, 가능
	public abstract void test();
	
	public abstract String getName();
	
	//public abstract는 생략이 가능(입력하지 않아도 public abstract로 간주)
	
	/*public abstract*/
	void calculator(int a, int b);
}
