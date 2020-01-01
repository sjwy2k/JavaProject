package com.method.main;

import java.util.Scanner;

import com.emp.model.vo.Member;
import com.emp.model.vo.Member2;
import com.method.contoller.MethodTest;

public class Main {

	public static void main(String[] args) {
		MethodTest test=new MethodTest();
		System.out.println("계산하기 : "
				+test.test1(20,10,'+'));
		int su=0;
		int su2=0;
		char op=' ';
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		su=sc.nextInt();
		System.out.print("정수입력 : ");
		su2=sc.nextInt();
		System.out.print("연산자 : ");
		op=sc.next().charAt(0);
		double result=test.test1(su, su2, op);
		
		test.test();
		System.out.println(test.getSu());
		System.out.println(test.getSu2());
		System.out.println(test.getOp());
		
		Member m=null;
		m=test.createMember("u", "u", "@", "123", "이승원", '여');
		System.out.println(m.getName()+m.getId());
		
		//정수두개를 전달받아 전달받은 정수만큼출력하기
		test.test3(10, 20);
		String msg=test.printPerson("유병승", 19, "010-3644-6259");
		System.out.println(msg);
		
		Member2 m2=new Member2();
		m2.getId();
		m2.setId("user22");
	}
	
}
