package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideTestC extends OverrideTestA{

	//�ڼ� Exception �ߺ�����
	//IOException����, ���� ���ܴ� ��� ������ ����
	//FileNotFoundException, EOFException, IOException
	@Override
	public void testException() 
			throws FileNotFoundException, EOFException, IOException{
		
	}
}
