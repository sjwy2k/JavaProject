package com.abstractobj.model.printer.vo;

public class LZPrinter implements PrintDriver{

	public void lzPrint() {
		System.out.println("LZ���������!");
	}

	@Override
	public void print() {
		lzPrint();
		
	}
}
