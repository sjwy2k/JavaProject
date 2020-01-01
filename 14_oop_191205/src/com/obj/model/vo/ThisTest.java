package com.obj.model.vo;

public class ThisTest {
	private String name;
	private int age;
	
	public ThisTest() { //기본 생성자
//		name="박지수"; //이렇게 쓰고싶지 않다면??
		this("박지수"); 
		//내부에 있는 자기 생성자를 호출할 때 사용, this생성자
		//this생성자는 항상 맨 위 라인에 존재해야 함. 그렇지 않으면..?
		//Constructor call must be the first statement in a constructor
		age=19;
		
	}
	public ThisTest(String name) { //매개변수 있는 생성자
		this.name=name;
	}
}
