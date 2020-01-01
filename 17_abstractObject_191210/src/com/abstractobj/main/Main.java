package com.abstractobj.main;

import com.abstractobj.controller.PrinterTest;
import com.abstractobj.model.printer.vo.CanoPrinter;
import com.abstractobj.model.printer.vo.LZPrinter;
import com.abstractobj.model.printer.vo.Samsong;

public class Main {

	public static void main(String[] args) {
		
//		new AbstractController().abstractTest();
//		
//		//�������̽��� ������ �ڷ������� ����� ����
//		TestInterface inter;
//		//�������̽� �������� �������̽��� implements��
//		//��� ��ü�� �ڽ� ��ü�� ������ �� �ִ�
//		inter=new InterfaceTest();
//		inter.calculator(100, 100);
//		
//		inter=new InterfaceTest2();
//		inter.calculator(100, 100);
		
		//��������, ���յ��� �������̽��� ���� ����Ʈ����
		//���� ������ �� �ֵ��� �Ѵ�
		new PrinterTest(new Samsong()).print();
		new PrinterTest(new LZPrinter()).print();
		new PrinterTest(new CanoPrinter()).print();
	}

}
