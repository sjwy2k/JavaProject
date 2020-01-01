package com.emp.view;

import java.util.Scanner;

import com.emp.controller.StudentController;
import com.emp.model.dao.StudentDao;
import com.emp.model.vo.Student;

public class MainView {
	public void mainMenu(StudentController controller) {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("=====�л����� ���α׷� v01====");
			System.out.println("1. �л� ���");
			System.out.println("2. �л� ��ȸ");
//			System.out.println("3. �л� �̸����� ��ȸ");
//			System.out.println("4. �л� ����");
//			System.out.println("5. �������");
//			System.out.println("6. ��������");
//			System.out.println("7. �л� ����");
			System.out.println("8. ��������");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
			int cho=sc.nextInt();
			switch(cho) {
				case 1 : controller.enrollStudent();break;
				case 2 : controller.searchStudent();break;
				case 8 : controller.saveFile();break;
			}
		}while(true);
	}
	
	//�л��� ����Ҽ� �ִ� ȭ���� ������ִ� �żҵ�
	public Student enrollStudentView() {
		Scanner sc=new Scanner(System.in);
		System.out.println("====�л����ȭ��====");
		System.out.print("�л��̸� : ");
		String name=sc.nextLine();
		System.out.print("�г� : ");
		int grade=sc.nextInt();
		System.out.print("�� : ");
		int ban=sc.nextInt();
		System.out.print("���� : ");
		int age=sc.nextInt();
		System.out.print("�ּ� : ");
		sc.nextLine();
		String address=sc.nextLine();
		System.out.print("����ó : ");
		String phone=sc.nextLine();
		Student s=new Student(name,grade,
				ban,age,address,phone);
		return s;		
	}
	public void printMsg(String msg) {
		System.out.println("====�˸�====\n"+msg);
	}
	
	public void printStudentAll(StudentDao dao) {
		System.out.println("====��ϵ� �л�===");
//		String students="";
//		if(dao.getS1()!=null) {
//			students+=dao.getS1().printStudent()+"\n";
//		}
//		if(dao.getS2()!=null) {
//			students+=dao.getS2().printStudent()+"\n";
//		}
//		if(dao.getS3()!=null) {
//			students+=dao.getS3().printStudent()+"\n";
//		}
//		if(dao.getS4()!=null) {
//			students+=dao.getS4().printStudent()+"\n";
//		}
//		if(students.equals("")) {
//			System.out.println("��ϵ� �л��� �����ϴ�.");
//		}else {
//			System.out.println(students);
//		}
		for(Student s : dao.getStudents()) {
			if(s!=null) {
				System.out.println(s.getName()+" "
					+s.getAge()+" "
					+s.getGrade()+" "
					+s.getBan()+" "
					+s.getAddress()+" "
					+s.getPhone()+" "
					+s.getKor()+" "
					+s.getEng()+" "
					+s.getMath()+" "
					+s.getCoding());
			}
		}
		
		
	}
}





