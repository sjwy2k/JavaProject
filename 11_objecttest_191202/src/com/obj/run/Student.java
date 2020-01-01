package com.obj.run;

public class Student {

//	protected String name; //같은 패키지, 후손 클래스
//	String jumin;
//	private char gender; //private제한자
//	//메서드 내부에서 접근하거나
//	public Student() {
//		gender='여';
//	}
//	//생성자 내부에서 접근
//	public void accessTest() {
//		gender='여';
//	}
	
	private String name;
	private int grade, classNum, kor, eng, math;
	
	public Student() {
		
	}
	
	public Student(String name, int grade, int classNum, int kor, int eng, int math) {
		this.setName(name);
		this.setGrade(grade);
		this.setClassNum(classNum);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}
	
	public void print() {
		System.out.println(this.name+"\t"+this.grade+"\t"+this.classNum+"\t"+this.kor+"\t"+this.eng+"\t"+this.math);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
}
