package com.filetest.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {

	//FileOutputStream��ü�� �̿��Ͽ�
	//������ ����Ǿ��ִ� �����͸� ����
	public void fileOutput() {
		//1. ������ �����Ҷ��� ���� ������ ������ �����ϰ�
		//2. ���ϰ� ����Ǵ� ��Ʈ���� ����
		//3. ��Ʈ���� �����Ǹ� ��Ʈ���� ���� ����������
		//����������� �׻� Exceptionó���� �������.		
		//Stream��ü�� �׻� close() �޼���� ��ü�� �ݾ������
		
		File f=new File("test.txt");
		//��Ʈ������
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(f);
			//�� String�� bytes�� �ٲٸ� �����°�? 4byte�� 2byte�� �ֱ� ����.
			byte[] data= "������ �����ô� �� �� �־��".getBytes();
//			for(int i=0; i<10; i++) {
//				fos.write(i);//���!!
//			}
			fos.write(data);//���!!
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				fos.close();//�ݴ� ������ ������ �� �� �ִ�. ����ó��
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		} 
	}
	
	
	//����� file inputStream���� �о����
	public void fileInputStream() {
		//1. file�� ����
		//2. inputStream ����
		//3. read�� �ҷ���(int����)
		//4. Exceptionó��, stream�ݾ���ߵ�
		
		File f=new File("test.txt");
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
			int value=0; 
			//-1�� read()�޼����� ���ϰ�.
			//������ �� ������ -1�� ����
			
			//read()�޼����� -1 ���ϰ��� �ƴ϶��, 
			//���� ���� �Ÿ��� �����ִٸ�
			while((value=fis.read())!=-1) { 
				System.out.print((char)value);
			}
			//-1�� �Ǹ� while���� ���
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
