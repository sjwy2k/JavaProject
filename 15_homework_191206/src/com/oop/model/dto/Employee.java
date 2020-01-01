package com.oop.model.dto;

import java.util.Scanner;

public class Employee {

	private int empNo, age, salary;
	private String empName, dept, job, phone, address;
	private char gender;
	private double bonusPoint;
	
	public static Employee modifyMenu(Employee e) {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		do {
			System.out.print("****사원 정보 수정 메뉴****");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("5. 이전 메뉴로 이동");
			System.out.print("입력 : ");
			int input=sc.nextInt();
			switch(input) {
			case 1:
				System.out.print("변경할 이름을 입력 : ");
				emp.setEmpName(sc.nextLine());
				break;
			case 2:
				System.out.print("변경할 급여 입력 : ");
				emp.setSalary(sc.nextInt());
				break;
			case 3:
				System.out.print("변경할 부서 입력 : ");
				emp.setDept(sc.nextLine());
				break;
			case 4:
				System.out.print("변경할 직급을 입력 : ");
				emp.setJob(sc.nextLine());
				break;
			case 5:
				System.out.println("수정 종료");
				return emp;
			}
		}while(true);
	}
	
	public static void deleteMenu(Employee e) {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		do {
			System.out.print("****사원 정보 수정 메뉴****");
			System.out.println("1. 삭제할 사원 검색");
			System.out.println("2. 이전 메뉴로 이동");
			System.out.print("입력 : ");
			int input=sc.nextInt();
			switch(input) {
			case 1:
				System.out.print("변경할 이름을 입력 : ");
				emp.setEmpName(sc.nextLine());
				break;
			case 2:
				System.out.println("삭제 종료");
				return;
			}
		}while(true);
	}
	
	
	public Employee setName(String newName) {
		Employee e=new Employee();
		
		return e;
	}
	
	
	public void empInput() {
		
	};
	
	public void empOutput() {
		
	};
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
