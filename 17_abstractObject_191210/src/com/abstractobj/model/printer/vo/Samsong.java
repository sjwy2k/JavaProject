package com.abstractobj.model.printer.vo;

public class Samsong implements PrintDriver{

	public void samPrint() {
		System.out.println("��������� ���!");
	}

	//�������� print�� �����ߴ�.
	@Override
	public void print() {
		samPrint();
	}
}
