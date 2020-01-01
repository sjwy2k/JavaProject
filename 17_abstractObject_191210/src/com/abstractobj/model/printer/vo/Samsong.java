package com.abstractobj.model.printer.vo;

public class Samsong implements PrintDriver{

	public void samPrint() {
		System.out.println("삼송프린터 출력!");
	}

	//공통기능인 print를 구현했다.
	@Override
	public void print() {
		samPrint();
	}
}
