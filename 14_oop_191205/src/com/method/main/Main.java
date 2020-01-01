package com.method.main;

import com.method.controller.Method;
import com.method.controller.MethodTest;
import com.obj.model.vo.Member;
import com.obj.model.vo.Member2;

public class Main {

	public static void main(String[] args) {
		
		Method me=new Method();
		MethodTest mt=new MethodTest();
//		System.out.println("계산하기 : "+mt.test1(79, 7, '*'));
		
//		//입력
//		m=mt.input();
//		
//		//출력
//		System.out.print(mt.test1(
//				m.getSu(), m.getSu2(), m.getOperator()));
		
//		mt.test();
//		
//		
//		Member m=null;
//		m=mt.createMember("u","u","@","123","이승원",'여');		
//		System.out.println(m.getName()+m.getId());
//		
//		
//		
//		//정수 두개를 전달받고 첫번째 정수 -> 두번째 정수까지의 수를 출력
//		mt.test3(10, 20);
		
		//4.
		String result=mt.clientInfo("유병승", 19, "01011112222");
		System.out.println(result);
				
		//5.
		mt.insertMember("user01","user01","유관순","ygs@ygs.com","서울시 동대문구");
		Member2 m2=new Member2();
		m2.setId("user02");
		System.out.println(m2.getId());
				
	}
}

