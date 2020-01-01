package com.arrobj.controller;

import java.util.Scanner;

import com.arrobj.model.vo.Employee;

public class ObjectArrayController {

	public void basicObjArray() {
		//1. 객체배열을 선언
		Employee[] employees;
		//2. 객체배열을 할당		
//		employees=new Employee[5];
		
		//3. 객체배열 각각의 객체변수에 생성자로 생성을 해야!! 접근가능
		//1.2.까지만 하고 3을 빠뜨리면 NullPointerException
//		for(int i=0; i<employees.length; i++) {
//			employees[i]=new Employee();
//		}
		
//		employees[0]=new Employee(1, "정총명", "Rclass", "훈련생", 100);
//		employees[1]=new Employee(2, "신재원", "Rclass", "훈련생", 200);
//		employees[2]=new Employee(3, "유병승", "Rclass", "강사", 300);
//		System.out.println(employees[0].getEmpName());
		
//		System.out.println("번호"+"\t"+"이름"+"\t"+"소속"+"\t"+"직급"+"\t"+"연봉");
//		System.out.println(employees[0]+"\n"+employees[1]+"\n"+employees[2]);
		
		
		//employees배열의 사원 3명을 등록하고, 각 내용을 출력하세요
		//테이블사람 정보를 이용할것
//		employees[0].setEmpNo(1);
//		employees[0].setEmpName("정총명");
//		employees[0].setDept("Rclass");
//		employees[0].setJob("훈련생");
//		employees[0].setSalary(1000000);
//		System.out.println(employees[0].getEmpNo()
//				+employees[0].getEmpName()
//				+employees[0].getDept()
//				+employees[0].getJob()
//				+employees[0].getSalary());
		
//		employees[1]=new Employee(2, "신재원", "Rclass", "훈련생", 2000000);
//		System.out.println(employees[1].getEmpNo()
//				+employees[1].getEmpName()
//				+employees[1].getDept()
//				+employees[1].getJob()
//				+employees[1].getSalary());
		
//		employees[2]=new Employee(3, "유병승", "Rclass", "강사", 3000000);
		
//		System.out.println(employees[2].getEmpNo()
//				+employees[2].getEmpName()
//				+employees[2].getDept()
//				+employees[2].getJob()
//				+employees[2].getSalary());
//		System.out.println(employees[2]);
		
//		for(int i=0; i<employees.length; i++) {
//			System.out.println(employees[i]);
//			System.out.println(employees[i].getEmpNo()
//					+"\t"+employees[i].getEmpName()
//					+"\t"+employees[i].getDept()
//					+"\t"+employees[i].getJob()
//					+"\t"+employees[i].getSalary());
//		}
		
		//for-each
//		for(Employee e : employees) {
//			System.out.println(e);
//		}
		
		employees=new Employee[6];
		//Employee배열 6개를 선언하고 6명의 사원을 입력  
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<employees.length; i++) {
			employees[i]=new Employee();
			employees[i].setEmpNo(i+1);
			System.out.print("사원명 : ");
			employees[i].setEmpName(sc.nextLine());
			System.out.print("소속 : ");
			employees[i].setDept(sc.nextLine());
			System.out.print("직책 : ");
			employees[i].setJob(sc.nextLine());
			System.out.print("연봉 : ");
			employees[i].setSalary(sc.nextInt());
			sc.nextLine();
		}
		
		for(Employee e:employees) {
			System.out.println(e);
		}
		
		
	}
}
