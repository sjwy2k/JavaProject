package com.oop.model.dto;

import java.util.Scanner;

public class Employee {

	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() {}
	
	public void empInput(){
		Scanner sc=new Scanner(System.in);
		System.out.print("사원 번호:");
		empNo=sc.nextInt();
		sc.nextLine();
		System.out.print("사원 이름:");
		empName=sc.nextLine();
		System.out.print("사원 부서:");
		dept=sc.nextLine();
		System.out.print("사원 직책:");
		job=sc.nextLine();
		System.out.print("사원 나이:");
		age=sc.nextInt();
		System.out.print("사원 성별:");
		gender=sc.next().charAt(0);
		System.out.print("사원 연봉:");
		salary=sc.nextInt();
		System.out.print("사원 보너스:");
		bonusPoint=sc.nextDouble();
		sc.nextLine();
		System.out.print("사원 전화번호:");
		phone=sc.nextLine();
		System.out.print("사원 주소:");
		address=sc.nextLine();
	}
	public void empOutput(Employee em) {
		Employee e=em;
		System.out.println(e.getEmpNo()+e.getEmpName()+e.getDept()
				+e.getJob()+e.getAge()+e.getGender()+e.getSalary()+e.getBonusPoint()
				+e.getPhone()+e.getAddress());
		
	}
	public int getEmpNo() {
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept	) {
		this.dept=dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	
	
	
	
}
