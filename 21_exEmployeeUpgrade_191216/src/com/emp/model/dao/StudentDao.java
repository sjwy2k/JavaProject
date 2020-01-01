package com.emp.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.emp.model.vo.Student;

public class StudentDao {
	//��ü�迭�� �������... 
	//��ü�迭�� �����ͺ����غ���
//	private Student s1;
//	private Student s2;
//	private Student s3;
//	private Student s4;
	private Student[] students=new Student[4];
	public StudentDao() {}
	//������ ��ȯ
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
//			msg="�Է¿Ϸ�";
//		}
//		else if(s2==null) {
//			s2=s;
//			msg="�Է¿Ϸ�";
//		}
//		else if(s3==null) {
//			s3=s;
//			msg="�Է¿Ϸ�";
//		}
//		else if(s4==null) {
//			s4=s;
//			msg="�Է¿Ϸ�";
//		}
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				students[i]=s;
				msg="�Է¿Ϸ�";
				break;
			}else {
				msg="�Է½���! ��� �ڷῡ �����Ͱ� �ֽ��ϴ�.";
			}
		}
		//else 
		return msg;
	}
	
	//������ ���Ͽ� �����ϱ�
	public String saveFile() {
		try(ObjectOutputStream oos
				=new ObjectOutputStream(
						new FileOutputStream(
								"studentManager.bs"))){
			//������Ʈ�����ϱ�!!
			oos.writeObject(students);
			
		}catch(IOException e) {
			e.printStackTrace();
			return "����������� �ٽ� �õ��ϼ���!";
		}
		return "studentManager.bs�� ����Ϸ�";
	}
	
	public int readFile() {
		//0:����,1:�����̾���,2:��ü�� �߸���.
		//������ �о����
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
