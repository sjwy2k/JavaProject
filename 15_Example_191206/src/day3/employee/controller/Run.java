package day3.employee.controller;

import day3.employee.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee e=new Employee();
		
		e=e.inputInfo();
		e.printEmployee(e);
		
	}

}
