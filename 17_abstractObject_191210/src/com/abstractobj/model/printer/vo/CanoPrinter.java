package com.abstractobj.model.printer.vo;

public class CanoPrinter implements PrintDriver{

	public void cPrint() {
		System.out.println("ī������Ʈ!");
	}

	@Override
	public void print() {
		cPrint();
		
	}
}
