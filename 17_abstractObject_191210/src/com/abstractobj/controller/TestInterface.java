package com.abstractobj.controller;

public interface TestInterface extends TestInter2, TestInter3{

	//����� �ڷ���(static final)�� ���𰡴�

	public static final String name="������";
	
	//�߻�޼��常 ������ ������
//	public void printContent(String msg) {
//		System.out.println(msg);
//	}
	//������������ �߻�޼���, ����
	public abstract void test();
	
	public abstract String getName();
	
	//public abstract�� ������ ����(�Է����� �ʾƵ� public abstract�� ����)
	
	/*public abstract*/
	void calculator(int a, int b);
}
