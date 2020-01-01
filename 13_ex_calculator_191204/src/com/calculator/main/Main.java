package com.calculator.main;

import com.calculator.controller.Calculator;
import com.calculator.controller.CalculatorController;
import com.calculator.controller.ParameterTest;

public class Main {

	public static void main(String[] args) {
//		Calculator cc=new Calculator();
//		int plus=cc.plus();
//		System.out.println(plus);
				
//		CalculatorController cc=new CalculatorController();
//		cc.mainMenu();
		
//		new ParameterTest().printMsg("매개변수 출력", 1);
		ParameterTest pt=new ParameterTest();
//		pt.printMsg("여러분 힘내세요!", 2);
////		pt.printMsg(1, "화이팅 R클래스!");//매개변수 위치를 맞춰줘야됨!
//		String msg="안녕하세요";
		
		
		int[] n={1,2,3,4,5,6,7,8,9};
		for(int v:n) {
			System.out.print(v+" ");
		}
		System.out.println();
		System.out.println("main n - "+n.hashCode());
		System.out.println("메서드로 변경후");
		pt.arrayUpdate(n);
		
//		for(int i=0; i<n.length; i++) {}
		for(int v:n) {
			System.out.print(v+" ");
		}
		System.out.println();
		int num=10;
		System.out.println(num);
		System.out.println("메서드호출후");
		num=pt.change(num);
		System.out.println(num);
		
		
	}
}

