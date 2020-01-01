package com.emp.model.vo;

public class Employee {
	//int사원번호 str사원명 str부서 str직책 int연봉
	private int empNo, salary;
	private String name, dept, job;
	
	//default생성자
	public Employee() { }
	
	//parameter 있는 constructor
	public Employee(int empNo, String name, String dept, String job, int salary) {
		this.empNo=empNo;
		this.name=name;
		this.dept=dept;
		this.job=job;
		this.salary=salary;
		
	}

	
	//setter, getter
	public int getEmpNo() {
		return empNo;
	}
	
	//사원번호는 수정하면 안되므로 setter를 없애서 수정을 막아 놓음

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	

	
	//멤버변수 전체를 전달하는 메소드 만들어보기
	public String memberInfo() {
		return empNo+name+dept+job+salary;
	}
}
