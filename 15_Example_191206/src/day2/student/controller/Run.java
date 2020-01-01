package day2.student.controller;

import day2.student.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student s=new Student();
		s.setClassroom(3);
		s.setGender('남');
		s.setHeight(177.7);
		s.setName("이름");
		System.out.println(s.infomation(s));
		
	}

}
