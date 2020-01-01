package com.emp.view;

import java.util.Scanner;

import com.emp.controller.StudentController;
import com.emp.model.dao.StudentDao;
import com.emp.model.vo.Student;

public class MainView {
	public void mainMenu(StudentController controller) {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("=====학생관리 프로그램 v01====");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 조회");
//			System.out.println("3. 학생 이름으로 조회");
//			System.out.println("4. 학생 수정");
//			System.out.println("5. 성적등록");
//			System.out.println("6. 성적수정");
//			System.out.println("7. 학생 삭제");
			System.out.println("8. 파일저장");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int cho=sc.nextInt();
			switch(cho) {
				case 1 : controller.enrollStudent();break;
				case 2 : controller.searchStudent();break;
				case 8 : controller.saveFile();break;
			}
		}while(true);
	}
	
	//학생을 등록할수 있는 화면을 출력해주는 매소드
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
		Student s=new Student(name,grade,
				ban,age,address,phone);
		return s;		
	}
	public void printMsg(String msg) {
		System.out.println("====알림====\n"+msg);
	}
	
	public void printStudentAll(StudentDao dao) {
		System.out.println("====등록된 학생===");
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
//			System.out.println("등록된 학생이 없습니다.");
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





