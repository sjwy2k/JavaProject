package com.abstractobj.main;

import com.abstractobj.controller.PrinterTest;
import com.abstractobj.model.printer.vo.CanoPrinter;
import com.abstractobj.model.printer.vo.LZPrinter;
import com.abstractobj.model.printer.vo.Samsong;

public class Main {

	public static void main(String[] args) {
		
//		new AbstractController().abstractTest();
//		
//		//인터페이스는 참조형 자료형으로 사용이 가능
//		TestInterface inter;
//		//인터페이스 참조형은 인터페이스를 implements한
//		//모든 객체를 자식 객체로 저장할 수 있다
//		inter=new InterfaceTest();
//		inter.calculator(100, 100);
//		
//		inter=new InterfaceTest2();
//		inter.calculator(100, 100);
		
		//연관도를, 결합도를 인터페이스를 통해 떨어트린다
		//적게 수정할 수 있도록 한다
		new PrinterTest(new Samsong()).print();
		new PrinterTest(new LZPrinter()).print();
		new PrinterTest(new CanoPrinter()).print();
	}

}
