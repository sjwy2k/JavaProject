package com.emp.controller;

import com.emp.model.dao.StudentDao;
import com.emp.model.vo.Student;
import com.emp.view.MainView;

public class StudentController {
	private MainView view=new MainView();
	private StudentDao dao=new StudentDao();
	
	public void mainMenu() {
		//데이터먼저 불러오기
		int result=dao.readFile();//저장된 파일에서 데이터 불러오기
		switch(result) {
			case 1 : 
			case 2 : view.printMsg("프로그램 심각한 오류 관리자에게 문의하세요!");
					return; 
		}
		//시작화면을 출력
		view.mainMenu(this);
		//view클래스의 화면을 실행		
	}
	
	public void enrollStudent() {
		Student s=view.enrollStudentView();
		String msg=dao.enrollStduent(s);//데이터저장
		view.printMsg(msg);
	}
	public void searchStudent() {
		//저장된 모든 학생 정보를 출력
		view.printStudentAll(dao);
	}
	//입력한 학생 파일로 저장하기
	public void saveFile() {
		String msg=dao.saveFile();
		view.printMsg(msg);
	}
}





