package com.abstractobj.controller;

import com.abstractobj.model.printer.vo.CanoPrinter;
import com.abstractobj.model.printer.vo.LZPrinter;
import com.abstractobj.model.printer.vo.PrintDriver;

public class PrinterTest {

	//프린터기를 이용하는 객체
//	Samsong sam=new Samsong();
//	LZPrinter lz=new LZPrinter();
//	CanoPrinter ca=new CanoPrinter();
	
	//문제점, 객체가 바뀔 때마다 새로 바꿔서 생성해주고 
	//객체에 맞는 메서드를 다시 연결 해야 한다. 비효율
	PrintDriver pd; //인터페이스
	
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
