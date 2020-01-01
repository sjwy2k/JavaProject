package com.object2.model.vo;

public class Teacher extends Person{

	//이름, 나이, 성별, 담당과목

	private String subject;
	private double height;
	private String hakyear;
	private Student[] students; //has A 관계
	
	public Teacher() {}
	
	public Teacher(String subject, double height, String hakyear) {
		this.setSubject(subject);
		this.setHeight(height);
		this.setHakyear(hakyear);
	}


	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getHakyear() {
		return hakyear;
	}

	public void setHakyear(String hakyear) {
		this.hakyear = hakyear;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	@Override
	public void action() {
		System.out.println("수업하는 중!");
	}
}
