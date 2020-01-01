package com.collectionlist.model.vo;

public class GradePoint {

	private int kor;
	private int eng;
	private int math;
	private int coding;
	
	
	public GradePoint() {
		// TODO Auto-generated constructor stub
	}
	
	public GradePoint(int kor, int eng, int math, int coding) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.coding = coding;
	}
	
	
	
	@Override
	public String toString() {
		return "GradePoint [kor=" + kor + ", eng=" + eng + ", math=" + math + ", coding=" + coding + "]";
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
	public int getCoding() {
		return coding;
	}
	public void setCoding(int coding) {
		this.coding = coding;
	}
	
	
	
	
}
