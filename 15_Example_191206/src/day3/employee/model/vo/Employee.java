package day3.employee.model.vo;

import java.util.Scanner;

public class Employee {

	private int empNo, age, salary;
	private String empName, dept, job, phone, address;
	private char gender;
	private double bonusPoint;
	
	public Employee() {}
	
	public Employee inputInfo() {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("사원 정보를 입력합니다");
		e.setEmpNo();
		System.out.print("사원이름 : ");
		e.setEmpName(sc.nextLine());
		System.out.print("부서 : ");
		e.setDept(sc.nextLine());
		System.out.print("직책 : ");
		e.setJob(sc.nextLine());
		System.out.print("나이 : ");
		e.setAge(sc.nextInt());
		System.out.print("성별 : ");
		e.setGender(sc.next().charAt(0));
		System.out.print("연봉 : ");
		e.setSalary(sc.nextInt());
		System.out.print("보너스 : ");
		e.setBonusPoint(sc.nextDouble());
		System.out.print("전화번호 : ");
		sc.nextLine();
		e.setPhone(sc.nextLine());
		System.out.print("주소 : ");
		e.setAddress(sc.nextLine());
		return e;
	}
	
	public void printEmployee(Employee e) {
		System.out.println(
				"사원번호 : "+e.getEmpNo()+"\n"
				+"사원이름 : "+e.getEmpName()+"\n"
				+"부서 : "+e.getDept()+"\n"
				+"직책 : "+e.getJob()+"\n"
				+"나이 :  : "+e.getAge()+"\n"
				+"성별 :  : "+e.getGender()+"\n"
				+"연봉 :  : "+e.getSalary()+"만원\n"
				+"보너스 : "+e.getBonusPoint()+"만원\n"
				+"전화번호 : "+e.getPhone()+"\n"
				+"주소 :  : "+e.getAddress());
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo() {
		this.empNo++;
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
