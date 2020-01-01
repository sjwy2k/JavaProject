package com.emp.model.dao;

import com.emp.model.vo.Student;

public class StudentDao {
	private Student s1, s2, s3, s4;
	
	public StudentDao() {}
	
	public Student getS1() {
		return s1;
	}

	public Student getS2() {
		return s2;
	}
	
	public Student getS3() {
		return s3;
	}
	
	public Student getS4() {
		return s4;
	}
	
	public String enrollStudent(Student s) {
		String msg="";
		if(s1==null) { s1=s; msg="입력완료"; }
		else if(s2==null) { s2=s; msg="입력완료"; }
		else if(s3==null) { s3=s; msg="입력완료"; }
		else if(s4==null) { s4=s; msg="입력완료"; }
		else {
			System.out.println("학생 입력공간이 가득 찼습니다");
		}
		return msg;
	}
}
