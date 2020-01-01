package com.object2.controller;

import java.util.Date;
import java.util.Scanner;

import com.object2.model.vo.Employee;
import com.object2.model.vo.Person;
import com.object2.model.vo.Student;
import com.object2.model.vo.Teacher;

public class PersonController {
	
	

	public void basicObjectTest() {
		Student s=new Student();
		Teacher t=new Teacher();
		Employee e=new Employee();
		
		s.setName("����");
		t.setName("����");
		t.setAge(19);
		e.setGender("����");
		
		System.out.println(s.getName());
		System.out.println(t.getName());
		System.out.println(t.getAge());
		System.out.println(e.getGender());
		
		
		
		//hasA���� ��ü ��������
		Student s2=new Student("����ȣ", 22, "����", 3, 1, 22, new Teacher("�����α׷���", 180.5, "����"));
		System.out.println(s2.getName()+" "+s2.getTeacher().getSubject());
		
//		Student s3=new Student("������", 25, "����", 3, 2, 22, new Teacher("�ý������α׷���", 175.5, "����"));
//		System.out.println(s3.getName()+" "+s3.getTeacher().getSubject());
		
		s.action();
		t.action();
		e.action();
		
		Student sCopy=(Student)s2.clone();
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println(sCopy);
		System.out.println(sCopy.hashCode());
		System.out.println(s2==sCopy);
		
		//��� �������� equals Overriding�� ���� �������� �� 
		//������ ��ü�� ����� Ȯ���ϱ� ���� equals�޼��带
		//�������̵��Ͽ� ������.
		System.out.println(s2.equals(sCopy));
		
		System.out.println(s2.hashCode());
		System.out.println(sCopy.hashCode());
		
		System.out.println("\n\n\n\n\n");
		
		
//		String str="������";
//		String str2=new String("������");
//		
//		//String�� equals�� Object�� equals�� �籸���� ���� ��!
//		str.equals(str2);//���ڿ� �����!
		
		
		//polymorphism
		
		
		//��ü�� ������ Ȱ���ϱ�
		//��ü�� �θ��ڽİ��踦 ����������
		//�θ�ü�� �ڽİ�ü�� ������ ���� �� ����
		Person p=new Student("������", 19, "����", 
					3, 1, 11, new Teacher()); //������-upcasting
		System.out.println(p); //Student�������
//		System.out.println(p.getBan());//����
		System.out.println(p.getName()); //����
		p=new Employee();//emp�� �� �� �ִ�.
		
		//�θ�� �ڽ��� ���� �� �ִ�.
		//�θ� �ڽİ�ü�� �޴´ٰ� �ؼ� �ڽİ�ü�� ���� 
		//�״�� ����� �� �ִ� ���� �ƴϴ�.
//		p.getJob(); //����
		
		//�θ��� �ڷ������� ���� ������ �ڽĵ����͸�
		//�̿��Ϸ��� ������ ����ȯ�� �ؾ���.downcasting
		((Employee)p).getJob(); //.���ٿ����� �켱������ ()��ȣ�� �ڷ� ���������
		System.out.println(((Employee)p).getJob());
		Employee e1=(Employee)p;
		
		//��Ӱ��谡 �ִ��� �ڽ��� �θ� ���� �� ����
//		Employee e2=new Person();
		
//		s2.equals(new Scanner(System.in));
//		s2.equals(new Date());
//		Object obj=new Person();
//		obj=new Student();
//		obj=new Employee();
		//obj.
		
		Student[] students=new Student[5];
		Employee[] emps=new Employee[5];
		Teacher[] teachers=new Teacher[5];
		students[0]=new Student("������", 19, "��", 3,1,12,new Teacher());
		students[1]=new Student("����", 19, "��", 3,1,12,new Teacher());
		emps[0]=new Employee();
		emps[1]=new Employee();
		teachers[0]=new Teacher();
		teachers[1]=new Teacher();
		
		int count1=0;
		for(Student ss:students) {
			if(ss!=null) count1++;
		}
		int count2=0;
		for(Employee ee:emps) {
			if(ee!=null) count2++;
		}
		int count3=0;
		for(Teacher tt: teachers) {
			if(tt!=null) count3++;
		}
		
		
		//���� �Ͽ�ȭ
		Person[] persons=new Person[20];
		persons[0]=new Student();
		persons[1]=new Employee();
		persons[2]=new Teacher();
		persons[3]=new Employee();
		
		//��ü ��ϵ� ��� ���ϱ�
		int count=0;
		for(Person p1:persons) {
			if(p!=null) count++;
		}
		
		//instanceof downcasting
		System.out.println(persons[0] instanceof Student);
		System.out.println(persons[0] instanceof Employee);
		System.out.println(persons[0] instanceof Teacher);
		
		//��ϵ� student, employee �� ���ϱ�
		int studentCount=0, employeeCount=0;
		for(Person pp : persons) {
			if(pp!=null) {
				if(pp instanceof Student) {
					studentCount++;
				} else if(pp instanceof Employee) {
					employeeCount++;
				}
			}
		}
	}
	
	
}
