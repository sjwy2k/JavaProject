package com.object2.model.vo;

import java.util.Objects;

public class Student extends Person{
	//�̸�, ����, ����, �г�, ��, ��ȣ

	private int grade;
	private int ban;
	private int number;
	private Teacher teacher;//���Ӽ�����, hasA ����, �κ�-���Ӱ���
	//isA ���� : A�� ���� �Ƿ��̴�. hasA ���� : A�� ������ҷ� ������
	
	//default constructor
	public Student() {}
	
	public Student(String name, int age, String gender, int grade, int ban, int number, Teacher teacher) {
		//�θ� Ŭ������ �����ڸ� �ڽ� Ŭ������ ȣ���� �� �ִ�
		//super - �θ� Ŭ����, extends�� PersonŬ����
//		super();
		super(name, age, gender);//�θ� Person�� default������;
		//�θ� �Ű������� �ִ� ������ ȣ��
		this.grade=grade;
		this.ban=ban;
		this.number=number;
		this.setTeacher(teacher);
	}
	
	
	
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setBan(int ban) {
		this.ban=ban;
	}
	
	public int getBan() {
		return ban;
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	public int getNumber() {
		return number;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	@Override
	public String toString() {
		//�θ�Ŭ������ �����Ҷ��� private���������ڷ�
		//�����Ǿ������Ƿ� ���� ������ �Ұ���. getter�� �̿��� ����
		return super.getName()+super.getAge()+super.getGender()+grade+ban+number;
	}
	
	@Override
	public void action() {
		System.out.println("���� ��!");
	}
	
	//ObjectŬ������ clone������(@Override)
	//���������ڸ� ���� �� ����
//	protected Object clone() { //����
	@Override
	public Object clone() {
		Student s=new Student(getName(), getAge(), getGender(), grade, ban, number, teacher);
		return s;
	}
	//ObjectŬ������ equals ������(@Override)
	@Override
	public boolean equals(Object obj) {
		Student temp=(Student)obj;
		if(getName().equals(temp.getName())
				&&getAge()==temp.getAge()
				&&grade==temp.getGrade()) {
			return true;
		}
		return false;
	}
	
	//ObjectŬ������ hashCode ������(@Override)
//	@Override
//	public int hashCode() {
//		return Objects.hash(getName(), getAge(), getGrade());
//	}
}
