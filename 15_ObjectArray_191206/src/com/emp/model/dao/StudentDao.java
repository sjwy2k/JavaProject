package com.emp.model.dao;

import com.emp.model.vo.Student;

public class StudentDao {
//	private Student s1, s2, s3, s4;
	private Student[] students=new Student[4];
	
	public StudentDao() {}
	
	
	public Student[] getStudents() {
		return students;
	}
	
//	public Student getS1() {
//		return s1;
//	}
//
//	public Student getS2() {
//		return s2;
//	}
//	
//	public Student getS3() {
//		return s3;
//	}
//	
//	public Student getS4() {
//		return s4;
//	}
	
	public String enrollStudent(Student s) {
		String msg="";
		
		
//		if(s1==null) { s1=s; msg="입력완료"; }
//		else if(s2==null) { s2=s; msg="입력완료"; }
//		else if(s3==null) { s3=s; msg="입력완료"; }
//		else if(s4==null) { s4=s; msg="입력완료"; }
//		else {
//			msg="학생 입력공간이 가득 찼습니다";
//		}
		
		for(int i=0; i<students.length; i++) {
			if(students[i]==null) {
				students[i]=s; 
				msg="입력완료";
				break; //하나씩 입력해야 하므로 입력완료후 for문을 벗어남
			} else {
				msg="입력실패! 모든 자료에 데이터가 있습니다.";
//				break;
			}
		}
		return msg;
	}



}
