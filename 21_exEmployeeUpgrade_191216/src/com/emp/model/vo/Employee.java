package com.emp.model.vo;

public class Employee {

	private int empNo;//사원번호
	private String name;//사원명
	private String dept;//부서
	private String job;
	private int salary;
	
	//생성자
	public Employee() {}
	//매개변수가 있는 생성자
	public Employee(int empNo, String name, 
			String dept, String job, int salary) {
		this.empNo=empNo;
		this.name=name;
		this.dept=dept;
		this.job=job;
		this.salary=salary;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String getDept() {
		return dept;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public String getJob() {
		return job;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	//멤버변수 전체값을 전달해주는 메소드 만들어보기!
	public String informationMember() {
		return empNo+name+dept+job+salary;
	}
	
	
	
}
