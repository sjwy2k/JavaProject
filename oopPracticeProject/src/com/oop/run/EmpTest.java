package com.oop.run;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpTest {
	
	public static void mainMenu() {
		Scanner sc=new Scanner(System.in);
		Employee em=new Employee();
		do {
			System.out.println("******** 사원 정보 관리 프로그램 ********");
			System.out.println("1,새 사원 정보 입력");
			System.out.println("2.사원 정보 수정");
			System.out.println("3.사원 정보 삭제");
			System.out.println("4.사원정보 출력");
			System.out.println("9.끝내기");
			System.out.print("메뉴 입력:");
			int num=sc.nextInt();
			switch(num) {
			case 1:em.empInput();break;
			case 2:modifyMenu(em);break;
			case 3:em=null;System.out.println("회원정보를 삭제하였습니다.");break;
			case 4: em.empOutput(em);break;
			case 9: return;
			}
			
		}while(true);		
		}
	public static void modifyMenu(Employee e) {
		Scanner sc2=new Scanner(System.in);
		System.out.println("*****사원 정보 수정 메뉴");
		System.out.println("1.이름변경");
		System.out.println("2.급여변경");
		System.out.println("3.부서변경");
		System.out.println("4.직급 변경");
		System.out.println("5.이전 메뉴로 이동");
		System.out.print("메뉴 선택");
		int num=sc2.nextInt();
		switch(num){
		case 1: System.out.println("수정할 이름입력:");
				  sc2.nextLine();	e.setEmpName(sc2.nextLine());break;
		case 2: System.out.println("수정할 연봉입력:");
				sc2.nextLine();	e.setSalary(sc2.nextInt());break;
		case 3: System.out.println("수정할 부서입력:");
		  			sc2.nextLine(); e.setDept(sc2.nextLine());break;
		case 4: System.out.println("수정할 직책입력:");
		  			sc2.nextLine();	e.setJob(sc2.nextLine());break;
		case 5: return;
		}
	}
}
