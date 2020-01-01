package com.abstractobj.model.printer.vo;

public class CanoPrinter implements PrintDriver{

	public void cPrint() {
		System.out.println("카노프린트!");
	}

	@Override
	public void print() {
		cPrint();
		
	}
}
