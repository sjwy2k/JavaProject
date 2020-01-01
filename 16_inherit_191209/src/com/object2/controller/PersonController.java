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
		
		s.setName("유병");
		t.setName("마경");
		t.setAge(19);
		e.setGender("남자");
		
		System.out.println(s.getName());
		System.out.println(t.getName());
		System.out.println(t.getAge());
		System.out.println(e.getGender());
		
		
		
		//hasA관계 객체 가져오기
		Student s2=new Student("마경호", 22, "남자", 3, 1, 22, new Teacher("웹프로그래밍", 180.5, "고재"));
		System.out.println(s2.getName()+" "+s2.getTeacher().getSubject());
		
//		Student s3=new Student("정재훈", 25, "남자", 3, 2, 22, new Teacher("시스템프로그래밍", 175.5, "대졸"));
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
		
		//어떻게 비교할지를 equals Overriding을 통해 재정의해 비교 
		//생성된 객체의 동등성을 확인하기 위해 equals메서드를
		//오버라이딩하여 구현함.
		System.out.println(s2.equals(sCopy));
		
		System.out.println(s2.hashCode());
		System.out.println(sCopy.hashCode());
		
		System.out.println("\n\n\n\n\n");
		
		
//		String str="유병승";
//		String str2=new String("유병승");
//		
//		//String의 equals는 Object의 equals를 재구현해 놓은 것!
//		str.equals(str2);//문자열 동등비교!
		
		
		//polymorphism
		
		
		//객체의 다형성 활용하기
		//객체가 부모자식관계를 설정했을때
		//부모객체는 자식객체를 값으로 받을 수 있음
		Person p=new Student("유병승", 19, "남자", 
					3, 1, 11, new Teacher()); //다형성-upcasting
		System.out.println(p); //Student정상출력
//		System.out.println(p.getBan());//에러
		System.out.println(p.getName()); //가능
		p=new Employee();//emp도 들어갈 수 있다.
		
		//부모는 자식을 받을 수 있다.
		//부모가 자식객체를 받는다고 해서 자식객체의 값을 
		//그대로 사용할 수 있는 것은 아니다.
//		p.getJob(); //에러
		
		//부모의 자료형으로 받은 변수로 자식데이터를
		//이용하려면 강제적 형변환을 해야함.downcasting
		((Employee)p).getJob(); //.접근연산자 우선순위를 ()괄호로 뒤로 땡겨줘야함
		System.out.println(((Employee)p).getJob());
		Employee e1=(Employee)p;
		
		//상속관계가 있더라도 자식은 부모를 받을 수 없음
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
		students[0]=new Student("유병승", 19, "남", 3,1,12,new Teacher());
		students[1]=new Student("유병", 19, "남", 3,1,12,new Teacher());
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
		
		
		//관리 일원화
		Person[] persons=new Person[20];
		persons[0]=new Student();
		persons[1]=new Employee();
		persons[2]=new Teacher();
		persons[3]=new Employee();
		
		//전체 등록된 사람 구하기
		int count=0;
		for(Person p1:persons) {
			if(p!=null) count++;
		}
		
		//instanceof downcasting
		System.out.println(persons[0] instanceof Student);
		System.out.println(persons[0] instanceof Employee);
		System.out.println(persons[0] instanceof Teacher);
		
		//등록된 student, employee 수 구하기
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
