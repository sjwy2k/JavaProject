package com.filetest.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterTest {

	public void writerTest() {
		FileWriter fw=null;
		try {
			//fw=new FileWriter(new File("textChar.txt"));
			fw=new FileWriter("textChar.txt");
			fw.write("������ ���� �ݿ���!");
			fw.write("���� �������� �� �� �־��..");
			fw.write("������.. ��??? �ư��� ������!");
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	
	public void readerTest() {
		try(FileReader fr
				=new FileReader("textChar.txt")){
			int value=0;
			StringBuffer sb=new StringBuffer();
			while((value=fr.read())!=-1) {
				//191211 stringbuffer append()�޼���
				//append() insert() delete()
				sb.append((char)value);
			}
			System.out.println(sb);
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
