package com.method.main;

import java.util.Scanner;

import com.emp.model.vo.Member;
import com.emp.model.vo.Member2;
import com.method.contoller.MethodTest;

public class Main {

	public static void main(String[] args) {
		MethodTest test=new MethodTest();
		System.out.println("����ϱ� : "
				+test.test1(20,10,'+'));
		int su=0;
		int su2=0;
		char op=' ';
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է� : ");
		su=sc.nextInt();
		System.out.print("�����Է� : ");
		su2=sc.nextInt();
		System.out.print("������ : ");
		op=sc.next().charAt(0);
		double result=test.test1(su, su2, op);
		
		test.test();
		System.out.println(test.getSu());
		System.out.println(test.getSu2());
		System.out.println(test.getOp());
		
		Member m=null;
		m=test.createMember("u", "u", "@", "123", "�̽¿�", '��');
		System.out.println(m.getName()+m.getId());
		
		//�����ΰ��� ���޹޾� ���޹��� ������ŭ����ϱ�
		test.test3(10, 20);
		String msg=test.printPerson("������", 19, "010-3644-6259");
		System.out.println(msg);
		
		Member2 m2=new Member2();
		m2.getId();
		m2.setId("user22");
	}
	
}
