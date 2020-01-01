package com.exception.controller;

public class OverrideTestB extends OverrideTestA{

	//더 구체화된 상태에서 더 추상화된 예외를 던질 수 없다
	//부모 예외를 던지면 넓은 범위이므로 에러
//	@Override
//	public void testException() throws Exception{
//		
//	}
}
