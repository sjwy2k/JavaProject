package com.exception.controller;

import java.io.FileNotFoundException;
import java.util.Date;

public class UncheckedException {

	public static void main(String[] args) throws FileNotFoundException{
		
		int a=0;
		int b=10;
//		System.out.println(b/a);//UncheckedException
		
//		String name=null;
//		System.out.println(name.charAt(0));//nullpointer
//		int[] nums=new int[-10];//negativearrayindex
//		int[] nums=new int[2];
//		System.out.println(nums[2]);//arrayoutofbounds
		
		Object obj=new Date();
		try {
			String str=(String)obj;
		} catch(ClassCastException e) {
			System.out.println("����ȯ ����!!");
		}
		
		
		
		//����ó����� 2����
		//Exception���� ���� �ǵ����ֱ� - ȣ���� �޼��忡�� ����ó��
		//Exception���� �߻��� ������ ó��
				
		new ExceptionTest().methodA();
		
		
		try {
			throw new FileNotFoundException();
			//checked Exception
		} catch(FileNotFoundException e) {
			System.out.println("����ó��");
		}
		
		int i=0;
//		while(b==10) {
//			System.out.println(i++);
//		}
	}
}
