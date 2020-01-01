package com.filetest.controller;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public void fileTest() {
		//�⺻ File ��ü ����
		//file�� hdd�� ������ ���°� �ƴմϴ�.
		//heap������ File�� ���� ������ ������ �ִ� ����
		
		File dir=new File("C:\\test\\test1\\tt");
		if(!dir.exists()) {
//			dir.mkdir();//�Ѵܰ� �ǳ� ��������
			dir.mkdirs();//��� �� ��� ���� (�� �ܰ� �̻�)
		}
		File f=new File("C:\\test\\test1\\tt\\text.txt");
		System.out.println("fileTest����");
		
		//File��ü�� �̿��ؼ� �������ϻ����غ���
		//createNewFile()�޼ҵ带 �̿��ؼ� ������ ����
		try {
			if(!f.exists()) { //(!�������ִ�?)==�����̾��ٸ�
				f.createNewFile();//�̶� ������ ����
			}
			System.out.println(f.getAbsolutePath());
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	public void deleteFile(String file) {
		File f=new File(file);
		if(f.exists()) {//!������ �ִٸ� ������
			f.delete();
		}
	}
}
