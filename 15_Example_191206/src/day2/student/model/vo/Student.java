package day2.student.model.vo;

public class Student {

	private static final int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	static {
		grade=(int)Math.random()*6+1;
	}
	public Student() {
		
	}
	
	public String infomation(Student s) {
		String result="";
		result+=Student.grade+s.getName()+s.getHeight()+s.getGender();
		return result;
	}
	
	
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
}
