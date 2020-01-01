package com.arrobj.model.vo;

public class Employee {

	private int empNo, salary;
	private String empName, dept, job;
	
	public Employee() {}
	
	public Employee(int empNo, String empName, String dept, String job, int salary) {
		this.empNo=empNo;
		this.empName=empName;
		this.dept=dept;
		this.job=job;
		this.salary=salary;
	}
	
	//멤버변수가 private로 감춰져 있으므로 접근/수정가능한 getter/setter생성
	
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
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	//객체를 생성해서 참조형변수에 값을 넣었을  주소값이 저장됨.
	//저장된 변수를 출력을 하면??? 주소값이 나옴
	//Object객체의 toString()메서드가 자동으로 호출되는것임
	//변수명으로 객체의 데이터를 출력하려면 
	//toString()을 표시하고싶은 형식에 맞게 오버라이드한다. 
	@Override
	public String toString() {	
		return empNo+"\t"+empName+"\t"+dept+"\t"+job+"\t"+salary;
	}
}
