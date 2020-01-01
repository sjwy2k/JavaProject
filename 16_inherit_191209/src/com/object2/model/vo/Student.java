package com.object2.model.vo;

import java.util.Objects;

public class Student extends Person{
	//이름, 나이, 성별, 학년, 반, 번호

	private int grade;
	private int ban;
	private int number;
	private Teacher teacher;//담임선생님, hasA 관계, 부분-수속관계
	//isA 관계 : A는 같은 또래이다. hasA 관계 : A을 구성요소로 가졌다
	
	//default constructor
	public Student() {}
	
	public Student(String name, int age, String gender, int grade, int ban, int number, Teacher teacher) {
		//부모 클래스의 생성자를 자식 클래스가 호출할 수 있다
		//super - 부모 클래스, extends한 Person클래스
//		super();
		super(name, age, gender);//부모 Person의 default생성자;
		//부모 매개변수가 있는 생성자 호출
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
		//부모클래스에 접근할때는 private접근제한자로
		//설정되어있으므로 직접 접근이 불가능. getter를 이용해 접근
		return super.getName()+super.getAge()+super.getGender()+grade+ban+number;
	}
	
	@Override
	public void action() {
		System.out.println("공부 중!");
	}
	
	//Object클래스의 clone재정의(@Override)
	//접근제한자를 좁힐 수 없다
//	protected Object clone() { //에러
	@Override
	public Object clone() {
		Student s=new Student(getName(), getAge(), getGender(), grade, ban, number, teacher);
		return s;
	}
	//Object클래스의 equals 재정의(@Override)
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
	
	//Object클래스의 hashCode 재정의(@Override)
//	@Override
//	public int hashCode() {
//		return Objects.hash(getName(), getAge(), getGrade());
//	}
}
