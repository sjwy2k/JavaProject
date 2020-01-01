package com.emp.controller;

import java.util.Scanner;

import com.emp.model.dao.StudentDao;
import com.emp.model.vo.Student;
import com.emp.view.MainView;

public class StudentController {

	private MainView view=new MainView(); //오타
	private StudentDao dao=new StudentDao();
	
	
	public void mainMenu() {
		//시작화면을 출력
		view.mainMenu(this);
		//view클래스의 화면을 실행
		
		
	}

	public void enrollStudent() {
		Student s=view.enrollStudentView();
		String msg=dao.enrollStudent(s);//데이터저장
		view.printMsg(msg);
	}
	
	public void searchStudent() {
		//저장된 모든 학생 정보를 출력
		view.printStudentAll(dao);
	}
	
	public void searchNameStudent() {
		//해당하는 이름의 학생정보를 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("찾을 학생 이름 입력 : ");
		String name=sc.nextLine();
		view.printStudent(dao, name);
	}
}
