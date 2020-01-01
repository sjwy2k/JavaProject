package com.method.controller;

import java.util.Scanner;

import com.obj.model.vo.Member;
import com.obj.model.vo.Member2;

public class MethodTest {

	//1. 
	public double test1(int su, int su2, char op) {
		double result=0;
		
		switch(op) {
			case '+':result=su+su2;break;
			case '-':result=su-su2;break;
			case '*':result=su*su2;break;
			case '/':result=(double)su/su2;break;
		}
		
		return result;
	}
	
	
	public Method input() {
		Method m=new Method();
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		m.setSu(sc.nextInt());
		System.out.print("정수 입력 : ");
		m.setSu2(sc.nextInt());
		System.out.print("연산자 입력 : ");
		m.setOperator(sc.next().charAt(0));
		return m;
	}
	
	
	public void test() {
		System.out.println(test1(20, 30, '+'));
	}


	//2.
	public Member createMember(String id, String password, String email, String phone, String name, char gender) {
		Member m=new Member(id, password, email, phone, name, gender);
//		m.setId(id);
//		m.setPassword(password);
//		m.setEmail(email);
//		m.setPhone(phone);
//		m.setName(name);
//		m.setGender(gender);
		return m;
	}

	
	//3.
	public void test3(int a, int b) {
		for(int i=a; i<=b; i++) {
			System.out.println(i);
		}
	}


	
	//4.
	public String clientInfo(String name, int age, String phone) {
		String result="";
		result+="이름 : "+name+"\n"
		+"나이 : "+age+"\n"
		+"전화번호 : "+phone+"\n";
		return result;
	}


	//5.
	public void insertMember(String id, String pw, 
			String name, String email, String address) {
		Member2 m2=new Member2();
		m2.setId(id);
		m2.setPw(pw);
		m2.setName(name);
		m2.setEmail(email);
		m2.setAddress(address);
		System.out.println("id : "+m2.getId()
						+"\n"+"pw : "+m2.getPw()
						+"\n"+"name : "+m2.getName()
						+"\n"+"email : "+m2.getEmail()
						+"\n"+"address : "+m2.getAddress());
	}
	
	


}
