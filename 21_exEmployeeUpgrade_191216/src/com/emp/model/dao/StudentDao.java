package com.emp.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.emp.model.vo.Student;

public class StudentDao {
	//객체배열을 배웠으니... 
	//객체배열로 데이터보관해보자
//	private Student s1;
//	private Student s2;
//	private Student s3;
//	private Student s4;
	private Student[] students=new Student[4];
	public StudentDao() {}
	//데이터 반환
	public Student[] getStudents() {
		return students;
	}
//	public Student getS1() {
//		return s1;
//	}
//	public Student getS2() {
//		return s2;
//	}
//	public Student getS3() {
//		return s3;
//	}
//	public Student getS4() {
//		return s4;
//	}
	
	
	public String enrollStduent(Student s) {
		String msg="";
//		if(s1==null) {
//			s1=s;
//			msg="입력완료";
//		}
//		else if(s2==null) {
//			s2=s;
//			msg="입력완료";
//		}
//		else if(s3==null) {
//			s3=s;
//			msg="입력완료";
//		}
//		else if(s4==null) {
//			s4=s;
//			msg="입력완료";
//		}
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				students[i]=s;
				msg="입력완료";
				break;
			}else {
				msg="입력실패! 모든 자료에 데이터가 있습니다.";
			}
		}
		//else 
		return msg;
	}
	
	//데이터 파일에 저장하기
	public String saveFile() {
		try(ObjectOutputStream oos
				=new ObjectOutputStream(
						new FileOutputStream(
								"studentManager.bs"))){
			//오브젝트저장하기!!
			oos.writeObject(students);
			
		}catch(IOException e) {
			e.printStackTrace();
			return "파일저장실패 다시 시도하세요!";
		}
		return "studentManager.bs에 저장완료";
	}
	
	public int readFile() {
		//0:정상,1:파일이없음,2:객체가 잘못됨.
		//데이터 읽어오기
		try(ObjectInputStream ois=
				new ObjectInputStream(
						new FileInputStream(
						"studentManager.bs"))){
			students=(Student[])ois.readObject();
		}catch(IOException e) {
			return 1;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			return 2;
		}
		return 0;
	}
	
}
