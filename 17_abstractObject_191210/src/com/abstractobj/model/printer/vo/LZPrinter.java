package com.abstractobj.model.printer.vo;

public class LZPrinter implements PrintDriver{

	public void lzPrint() {
		System.out.println("LZ프린터출력!");
	}

	@Override
	public void print() {
		lzPrint();
		
	}
}
