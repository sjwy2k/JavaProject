package com.obj.model.vo;

public class Test {
	//멤버변수의 예약어사용
	//final, static 변수
	
	//final 멤버변수 활용
	//1. 선언과 동시에 초기화
	//2. 생성자에서  초기화
	private final int AGE=20;//상수, 수동 초기화가 반드시 필요	
	private final double weight; //setter가 필요하지 않음. 값을 바꿀 수가 없기 때문. getter만 가능
	
	//3. 초기화 블록 사용으로 초기화
	private final char grade; 
	{
		//초기화 블록
		//class를 생성하면 생성자 실행 전에 바로 실행되는 블록
		grade='A';
		age=19;
	}
	
	//static 예약어
	//객체를 생성하지 않고 활용할 수 있는 변수
	public static String name;
	
	//메모리공간에 올라갈 때 한 번 실행, 그냥 초기화 블록이랑 헷갈리니까 static을 붙임
	static {
		name="유병승";
		//static 영역에서 멤버변수는 접근할 수 없음
		//age가 생성되어 있는지 아닌지 알 수 없으므로
//		age=89; 
	}
	
	
	private int age; //초기값이 자동으로 들어감
	
	
	
	//생성자
	public Test() { 
		weight=65.5;
		age=100;
		name="하하하"; //static 멤버변수는 어디에서나 접근 가능
	}
	
	
	public int getAge() {
		return age;
	}

	


}