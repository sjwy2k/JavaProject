package com.oop.run;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpTest {
	
	public static void mainMenu() {
		Scanner sc=new Scanner(System.in);
		Employee em=new Employee();
		do {
			System.out.println("******** ��� ���� ���� ���α׷� ********");
			System.out.println("1,�� ��� ���� �Է�");
			System.out.println("2.��� ���� ����");
			System.out.println("3.��� ���� ����");
			System.out.println("4.������� ���");
			System.out.println("9.������");
			System.out.print("�޴� �Է�:");
			int num=sc.nextInt();
			switch(num) {
			case 1:em.empInput();break;
			case 2:modifyMenu(em);break;
			case 3:em=null;System.out.println("ȸ�������� �����Ͽ����ϴ�.");break;
			case 4: em.empOutput(em);break;
			case 9: return;
			}
			
		}while(true);		
		}
	public static void modifyMenu(Employee e) {
		Scanner sc2=new Scanner(System.in);
		System.out.println("*****��� ���� ���� �޴�");
		System.out.println("1.�̸�����");
		System.out.println("2.�޿�����");
		System.out.println("3.�μ�����");
		System.out.println("4.���� ����");
		System.out.println("5.���� �޴��� �̵�");
		System.out.print("�޴� ����");
		int num=sc2.nextInt();
		switch(num){
		case 1: System.out.println("������ �̸��Է�:");
				  sc2.nextLine();	e.setEmpName(sc2.nextLine());break;
		case 2: System.out.println("������ �����Է�:");
				sc2.nextLine();	e.setSalary(sc2.nextInt());break;
		case 3: System.out.println("������ �μ��Է�:");
		  			sc2.nextLine(); e.setDept(sc2.nextLine());break;
		case 4: System.out.println("������ ��å�Է�:");
		  			sc2.nextLine();	e.setJob(sc2.nextLine());break;
		case 5: return;
		}
	}
}
