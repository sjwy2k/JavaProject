package com.abstractobj.controller;

import com.abstractobj.model.printer.vo.CanoPrinter;
import com.abstractobj.model.printer.vo.LZPrinter;
import com.abstractobj.model.printer.vo.PrintDriver;

public class PrinterTest {

	//�����ͱ⸦ �̿��ϴ� ��ü
//	Samsong sam=new Samsong();
//	LZPrinter lz=new LZPrinter();
//	CanoPrinter ca=new CanoPrinter();
	
	//������, ��ü�� �ٲ� ������ ���� �ٲ㼭 �������ְ� 
	//��ü�� �´� �޼��带 �ٽ� ���� �ؾ� �Ѵ�. ��ȿ��
	PrintDriver pd; //�������̽�
	
	public PrinterTest(PrintDriver pd) {
		this.pd=pd;
	}
	
	public void print() {
//		sam.samPrint();
//		lz.lzPrint();
//		ca.cPrint();
		
		pd.print();
	}
}
