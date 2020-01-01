package com.emp.model.vo;

public class Employee {

	private int empNo;//�����ȣ
	private String name;//�����
	private String dept;//�μ�
	private String job;
	private int salary;
	
	//������
	public Employee() {}
	//�Ű������� �ִ� ������
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
	//������� ��ü���� �������ִ� �޼ҵ� ������!
	public String informationMember() {
		return empNo+name+dept+job+salary;
	}
	
	
	
}
