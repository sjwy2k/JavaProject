package com.emp.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.emp.model.dao.StudentDao;
import com.emp.model.vo.Student;
import com.emp.view.MainView;

public class StudentController {

	private MainView view=new MainView(); //오타
	private StudentDao dao=new StudentDao();
	private ObjectOutputStream oos;
	
	
	public void mainMenu() {
		
		//시작화면 보여주기 전에 데이터 먼저 불러오기
		int result=dao.readFile();//지정된 파일에서 데이터 불러오기
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
	
	public void searchStudent2() {
		//저장된 모든 학생 정보를 출력
		view.printStudentOOS(dao);
	}
	
	public void searchNameStudent() {
		//해당하는 이름의 학생정보를 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("찾을 학생 이름 입력 : ");
		String name=sc.nextLine();
		view.printStudent(dao, name);
	}


	//입력한 학생 파일로 저장하기
	public void saveFile() {
		String msg=dao.saveFile();
		view.printMsg(msg);
	}



}
