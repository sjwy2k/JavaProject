package com.method.contoller;

import com.emp.model.vo.Member;
import com.emp.model.vo.Member2;

public class MethodTest {
	private int su;
	private int su2;
	private char op;
	//1.
	public double test1(int su, int su2, char op) {
		double result=0;
		switch(op) {
			case '+' :result=su+su2;break;
			case '-' :result=su-su2;break;
			case '*' :result=su*su2;break;
			case '/' :result=su/(double)su2;break;
		}
		return result;
	}
	
	
	public void test() {
		su=20;
		su2=30;
		op='+';
		System.out.println(test1(20,30,'+'));
	}
	
	public int getSu() {
		return su;
	}
	public int getSu2() {
		return su2;
	}
	public char getOp() {
		return op;
	}
	
	public Member createMember(String id,String pw, 
			String email, String phone, String name,
			char gender) {
		
		Member m=new Member(id,pw,email,phone,
				name,gender);
		return m;
	}
	
	public void test3(int a, int b) {
		for(int i=a;i<b;i++) {
			System.out.println(i);
		}
	}
	
	public String printPerson(String name, 
			int age, String phone) {
		return name+"\t"+age+"\t"+phone;
	}
	
	public void insertMember2(String id, 
			String pw, String name, 
			String email, String address) {
		Member2 m=new Member2();
		m.setId(id);
		m.setPw(pw);
		m.setName(name);
		m.setEmail(email);
		m.setAddress(address);
		System.out.println(m.getId()+m.getPw()
		+m.getName()
		+m.getEmail()+m.getAddress());
		
	}
	
	
}






