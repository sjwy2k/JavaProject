package com.oop.run;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpTest {

	public static void mainMenu(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		do {
			System.out.println("사원 정보 관리 프로그램");
			System.out.println("1. 새 사원 정보 입력");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 끝내기");
			int input=sc.nextInt();
			switch(input) {
			case 1:e.empInput();
			case 2:e.modifyMenu(e);
			case 3:e.deleteMenu(e);
			case 4:e.empOutput();
			case 9:return;
			}
		}while(true);
		
		
		
	}
}
