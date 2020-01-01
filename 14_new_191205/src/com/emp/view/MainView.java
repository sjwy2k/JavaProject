package com.emp.view;

import java.util.Scanner;

import com.emp.controller.StudentController;
import com.emp.model.dao.StudentDao;
import com.emp.model.vo.Student;

public class MainView {
	public void mainMenu(StudentController controller) {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("=====학생관리 프로그램 v01=====");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생조회");
			System.out.println("3. 학생 이름조회");
			System.out.println("4. 학생수정");
			System.out.println("5. 학생성적등록");
			System.out.println("6. 학생성적수정");
			System.out.println("7. 학생삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");			
			int input=sc.nextInt();
			switch(input) {
				case 1: controller.enrollStudent();break;
				case 2: controller.searchStudent();break;
				case 3: controller.searchNameStudent();break;
//				case 4: 
//				case 5: 
//				case 6: 
//				case 7: 
				case 0: System.out.println("프로그램종료");return;
			}		
		}while(true);
	}
	
	//학생을 등록할수있는 화면을 출력해주는 메소드
	public Student enrollStudentView() {
		Scanner sc=new Scanner(System.in);
		System.out.println("====학생등록화면====");
		System.out.print("학생이름 : ");
		String name=sc.nextLine();
		System.out.print("학년 : ");
		int grade=sc.nextInt();
		System.out.print("반 : ");
		int ban=sc.nextInt();
		System.out.print("나이 : ");
		int age=sc.nextInt();
		System.out.print("주소 : ");
		sc.nextLine();
		String address=sc.nextLine();
		System.out.print("연락처 : ");
		String phone=sc.nextLine();
		
		Student s=new Student(name, grade, ban, age, address, phone);
		return s;
		
	}
	
	public void printMsg(String msg) {
		System.out.println("====알림====\n"+msg);
	}
	
	public void printStudentAll(StudentDao dao) {
		System.out.println("====등록된 학생====");
		String students="";
		if(dao.getS1()!=null) {
			students+=dao.getS1().printStudent()+"\n";
		}
		if(dao.getS2()!=null) {
			students+=dao.getS2().printStudent()+"\n";
		}
		if(dao.getS3()!=null) {
			students+=dao.getS3().printStudent()+"\n";
		}
		if(dao.getS4()!=null) {
			students+=dao.getS4().printStudent()+"\n";
		}
		if(students.equals("")) {
			System.out.println("등록된 학생이 없습니다.");
		} else {
			System.out.println(students);
		}
		
	}

	public void printStudent(StudentDao dao, String name) {
		String students="";
		System.out.println("찾으신 학생 "+name+"의 정보");
		if(dao.getS1().getName().equals(name)) {
			students+=dao.getS1().printStudent()+"\n";
		} else if(dao.getS2().getName().equals(name)) {
			students+=dao.getS2().printStudent()+"\n";
		} else if(dao.getS3().getName().equals(name)) {
			students+=dao.getS3().printStudent()+"\n";
		} else if(dao.getS3().getName().equals(name)) {
			students+=dao.getS3().printStudent()+"\n";
		} else if(dao.getS4().getName().equals(name)) {
			students+=dao.getS4().printStudent()+"\n";
		}
		if(students.equals("")) {
			System.out.println("등록된 학생이 없습니다.");
		} else {
			System.out.println(students);
		}
	}
}
