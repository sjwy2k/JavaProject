package com.object2.model.vo;

public class Employee extends Person{

	//�̸�, ����, ����, �μ�, ��å, ����

	private String dept;
	private String job;
	private int salary;
	
	//constructor
	public Employee() {}
	public Employee(String dept, String job, int salary) {

		this.dept=dept;
		this.job=job;
		this.salary=salary;
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
	
	@Override
	public void action() {
		System.out.println("���ؾ����Ф�");
	}
}
