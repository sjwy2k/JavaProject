package com.emp.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.emp.model.vo.Student;

public class StudentDao {
	private Student s1, s2, s3, s4;
	private Student[] stus=new Student[4];
	
	
	public StudentDao() {
		
	}
	
	public StudentDao(Student s1, Student s2, Student s3, Student s4, Student[] stus) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.stus = stus;
	}



	public Student getS1() {
		return s1;
	}

	public void setS1(Student s1) {
		this.s1 = s1;
	}

	public Student getS2() {
		return s2;
	}

	public void setS2(Student s2) {
		this.s2 = s2;
	}

	public Student getS3() {
		return s3;
	}

	public void setS3(Student s3) {
		this.s3 = s3;
	}

	public Student getS4() {
		return s4;
	}

	public void setS4(Student s4) {
		this.s4 = s4;
	}

	public Student[] getStus() {
		return stus;
	}

	public void setStus(Student[] stus) {
		this.stus = stus;
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
	
	public String saveFile() {
		try(ObjectOutputStream oos=
				new ObjectOutputStream(new FileOutputStream("studentManager.bs"))) {
			oos.writeObject(stus);
		} catch(IOException ios) {
			ios.printStackTrace();
			return "파일저장실패 다시 시도하세요!";
		}
		return "studentManager.bs에 저장완료";
	}
	
	public int readFile() {
		
		//0:정상로딩,1:파일이없음,2:객체가 잘못됨.
		//데이터 읽어오기
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("studentManager.bs"))) {
			stus=(Student[])ois.readObject();
		} catch(IOException ios) {
			return 1;
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			return 2;
		}
		return 0;
	}
}
