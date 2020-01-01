package com.collectionlist.model.vo;

import java.util.Objects;

public class Student {

	private String name;
	private int age;
	private int grade;
	private int ban;
	private GradePoint gradePoint;
	
	public Student() {
		
	}

	public Student(String name, int age, int grade, int ban, GradePoint gradePoint) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.ban = ban;
		this.gradePoint = gradePoint;
	}
	
	//auto-toString Overriding
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + ", ban=" + ban + ", gradePoint="
				+ gradePoint + "]";
	}
	
	//hashcode Overriding
	@Override
	public int hashCode() {
		return Objects.hash(name, age, grade, ban);
	}

	//eqauls overriding
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s=(Student)obj;
			if(name.equals(s.getName())
				&&age==s.getAge()
				&&grade==s.getGrade()
				&&ban==s.getBan()) {
				return true; //Student의 내용이 일치할 경우
			}
			return false;//Student의 내용이 다를경우
		}
		return false;//Student 객체가 아닐경우
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public GradePoint getGradePoint() {
		return gradePoint;
	}

	public void setGradePoint(GradePoint gradePoint) {
		this.gradePoint = gradePoint;
	}

	
	
	
}
