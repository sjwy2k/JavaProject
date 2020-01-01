package day5.student.model.vo;

public class Student {

	private int grade, classroom, number;
	private String name;
	
	public Student() {
		
	}
	
	public Student(int grade, int classroom, int number, String name) {
		this.setGrade(grade);
		this.setClassroom(classroom);
		this.setNumber(number);
		this.setName(name);
	}

	public String infomation(Student[] s) {
		String result="";
		for(int i=0; i<s.length; i++) {
			result+=s[i].getGrade()+"학년 "
					+s[i].getClassroom()+"반 "
					+s[i].getNumber()+"번 "
					+s[i].getName()+"\n";
		}
		
		return result;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
