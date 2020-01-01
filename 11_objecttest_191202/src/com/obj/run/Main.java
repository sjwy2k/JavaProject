package com.obj.run;

import com.obj.controller.OopTest;
import com.obj.controller.*;
import com.obj.controller.Person;

public class Main extends Person{ //Main이 Person을 상속받았다.
	public static void main(String[] args) {
		//public 클래스 생성
//		new AccessTest(); //클래스를 인스턴스화 -> 객체로 생성
//		new DefaultAccessTest(); //default 접근제한자로 인해 외부 패키지에서는 보이지않음
//		new SamePackage(); //default 접근제한자 이지만 생성 가능!
//		new OopTest().ex01();
		
		//클래스의 명칭도 자료형(참조형)이다. 변수 타입이 class명이다
//		AccessTest at=new AccessTest(); //AccessTest class
//		SamePackage sp=new SamePackage(); //SamePackage class
//		String str=new String("신재원"); //String class
		
		//클래스 생성 후 객체의 멤버변수에 접근하기
		//Person클래스를 생성해서 변수에 넣기
		Person p=new Person();
//		String name=p.getName();
//		p.setName("Main에서 넣은 name");
//		int age=p.getAge();
//		System.out.println(p.name);
//		System.out.println(age);
		
		
		//생성된 객체에 접근연산자.을 통해 접근하기!
//		p.setName("유병승"); //직접 접근해서 값 넣고
//		System.out.println(p.name); //출력도 가능
		
		
		
//		p.age=10; //protected 라서 직접접근 불가, 상속받으면 가능
//		Main m=new Main();
//		m.age=10; //protected임에도 상속 후 main m객체 생성 후 접근가능
//		
//		Student s=new Student();
//		s.name="마경호";
		
		//default접근제한자 접근
		//같은 패키지내에서 접근이 가능
//		p.jumin="010224-123999"; //접근 불가
//		s.jumin="010224-123999"; //같은 패키지 Student에는 접근 가능
		
		//private접근제한자 접근
//		p.gender='남';
//		s.gender='남'; //둘 다 접근 안됨
		
//		char gen=p.getGender();
//		gen='여';
//		p.setGender(gen);
//		char gen1=p.getGender();
//		System.out.println(gen1);
		
//		Person newP=new Person();
//		
//		newP.setName("신재원");
//		newP.setAge(33);
//		newP.setGender('남');
//		newP.setJumin("870902-1111111");
//		
//		System.out.println(newP.getName());
//		System.out.println(newP.getAge());
//		System.out.println(newP.getGender());
//		System.out.println(newP.getJumin());
		
//		Person p2=new Person();
//		
//		p2.setName("신재원");
//		p2.setAge(33);
//		p2.setJumin("010111-1122111");
//		p2.setGender('남');
//		System.out.println(p2.getName()+"\n"+p2.getAge()+"\n"+p2.getJumin()+"\n"+p2.getGender());
//		
//		System.out.println(p2.hashCode());
//		//p에 새로운 값을 넣기
//		p.setName("마경호");
//		p.setAge(21);
//		p.setJumin("880221-1******");
//		p.setGender('남');
////		
////		System.out.println(p.getName()+"\n"+p.getAge()+"\n"+p.getJumin()+"\n"+p.getGender());
////		
////		p2.setName("정재훈");
////		System.out.println(p2.getName()+"\n"+p2.getAge()+"\n"+p2.getJumin()+"\n"+p2.getGender());
////		System.out.println(p.getName()+"\n"+p.getAge()+"\n"+p.getJumin()+"\n"+p.getGender());
////		
//		System.out.println(p2.hashCode());
//		p2=new Person();
//		System.out.println(p2.hashCode());
//		System.out.println(p2.getName()+"\n"+p2.getAge()+"\n"+p2.getJumin()+"\n"+p2.getGender());
		
		
//		System.out.println("value1");
//		//객체 멤버변수 기본설정값 확인
//		FieldDefaultValue value=new FieldDefaultValue(); //recall default constructor
//		System.out.println("String : "+value.getName()+"\nint : "+value.getAge()+"\ndouble : "+value.getHeight()+"\nfloat : "+value.getWeight()+"\nchar : '"+value.getGender()+"'\nboolean : "+value.getFlag());
//		System.out.println("\nvalue2");
//		//매개변수가 있는 생성자 이용 객체생성하기!
//		int[] lotto= {1, 5, 23, 19, 32, 42};
//		FieldDefaultValue value2=
//				new FieldDefaultValue("신재원", 33, 177.7, 65.5f, '남', true, lotto);
//		System.out.println(value2.getName()+"\n"
//							+value2.getAge()+"\n"
//							+value2.getHeight()+"\n"
//							+value2.getWeight()+"\n"
//							+value2.getGender()+"\n"
//							+value2.getFlag()+"\n"
//							+value2.getLotto());
//		
//		System.out.println("\nvalue3");
//		FieldDefaultValue value3=new FieldDefaultValue("유병승", 19);
//		System.out.println(value3.getName()+"\n"
//							+value3.getAge()+"\n"
//							+value3.getHeight()+"\n"
//							+value3.getWeight()+"\n"
//							+value3.getGender()+"\n"
//							+value3.getFlag());
		
		Student[] students = new Student[3];
		
		for(int i=0; i<students.length; i++) {
			students[i]=new Student();
		}
		
		students[0]=new Student("홍길동", 3, 10, 90, 99, 64);
		students[1]=new Student("이순신", 3, 11, 80, 90, 70);
		students[2]=new Student("마경호", 3, 7, 40, 20, 50);
		
		System.out.println("이름\t학년\t반\t국어\t영어\t수학");
		for(int i=0; i<students.length; i++) {
			students[i].print();
		}
		
		
		
	}
	
}
