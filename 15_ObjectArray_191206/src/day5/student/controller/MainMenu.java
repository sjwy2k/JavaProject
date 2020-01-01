package day5.student.controller;

import day5.student.model.vo.Student;

public class MainMenu {
	public static void mainMenu() {
		Student s=new Student();
		
		Student[] stus=new Student[3];
		
		stus[0]=new Student(3, 1, 1, "홍길동");
		stus[1]=new Student(4, 3, 2, "유관순");
		stus[2]=new Student(2, 7, 5, "윤봉길");
		
		System.out.println(s.infomation(stus));
	}
}
