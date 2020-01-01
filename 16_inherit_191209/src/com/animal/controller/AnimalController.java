package com.animal.controller;

import com.animal.model.vo.Cat;
import com.animal.model.vo.Chicken;
import com.animal.model.vo.Lion;

public class AnimalController {

	public void basicAnimalTest() {
		Cat c=new Cat();
		Chicken ck=new Chicken();
		Lion l=new Lion();
		
		System.out.println("�̸� : "+c.getName()+"\n"
				+"���� : "+c.getType()+"\n"
				+"�ٸ��� : "+c.getFootNum());
		System.out.println();
		System.out.println("�̸� : "+ck.getName()+"\n"
				+"���� : "+ck.getType()+"\n"
				+"�ٸ��� : "+ck.getFootNum());
		System.out.println();
		System.out.println("�̸� : "+l.getName()+"\n"
				+"���� : "+l.getType()+"\n"
				+"�ٸ��� : "+l.getFootNum());
		
		System.out.println();
		System.out.print("����� �����Ҹ� : ");
		c.action();
		System.out.print("�� �����Ҹ� : ");
		ck.action();
		System.out.print("���� �����Ҹ� : ");
		l.action();
		
		System.out.println();
		System.out.println("���� l�� ����");
		System.out.println(l.hashCode());
		System.out.println("�̸� : "+l.getName()+"\n"
				+"���� : "+l.getType()+"\n"
				+"�ٸ��� : "+l.getFootNum());
		System.out.println();
		//�����
		Lion l2=(Lion)l.clone();
		
		
		System.out.println("l�� ������ ���� l2�� ����");
		System.out.println(l2.hashCode());
		System.out.println("�̸� : "+l2.getName()+"\n"
				+"���� : "+l2.getType()+"\n"
				+"�ٸ��� : "+l2.getFootNum());
		
		System.out.println("�����Ѱ�? "+l.equals(l2));
		
	}

}
