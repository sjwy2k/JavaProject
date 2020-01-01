package com.emp.controller;

import com.emp.model.dao.StudentDao;
import com.emp.model.vo.Student;
import com.emp.view.MainView;

public class StudentController {
	private MainView view=new MainView();
	private StudentDao dao=new StudentDao();
	
	public void mainMenu() {
		//�����͸��� �ҷ�����
		int result=dao.readFile();//����� ���Ͽ��� ������ �ҷ�����
		switch(result) {
			case 1 : 
			case 2 : view.printMsg("���α׷� �ɰ��� ���� �����ڿ��� �����ϼ���!");
					return; 
		}
		//����ȭ���� ���
		view.mainMenu(this);
		//viewŬ������ ȭ���� ����		
	}
	
	public void enrollStudent() {
		Student s=view.enrollStudentView();
		String msg=dao.enrollStduent(s);//����������
		view.printMsg(msg);
	}
	public void searchStudent() {
		//����� ��� �л� ������ ���
		view.printStudentAll(dao);
	}
	//�Է��� �л� ���Ϸ� �����ϱ�
	public void saveFile() {
		String msg=dao.saveFile();
		view.printMsg(msg);
	}
}





