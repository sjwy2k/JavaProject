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
		System.out.print("��� ��ȣ:");
		empNo=sc.nextInt();
		sc.nextLine();
		System.out.print("��� �̸�:");
		empName=sc.nextLine();
		System.out.print("��� �μ�:");
		dept=sc.nextLine();
		System.out.print("��� ��å:");
		job=sc.nextLine();
		System.out.print("��� ����:");
		age=sc.nextInt();
		System.out.print("��� ����:");
		gender=sc.next().charAt(0);
		System.out.print("��� ����:");
		salary=sc.nextInt();
		System.out.print("��� ���ʽ�:");
		bonusPoint=sc.nextDouble();
		sc.nextLine();
		System.out.print("��� ��ȭ��ȣ:");
		phone=sc.nextLine();
		System.out.print("��� �ּ�:");
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
