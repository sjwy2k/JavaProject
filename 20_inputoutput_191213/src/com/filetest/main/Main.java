package com.filetest.main;

import com.filetest.controller.FileInputOutput;
import com.filetest.controller.ReaderWriterTest;

public class Main {

	public static void main(String[] args) {
		
//		FileTest f=new FileTest();
////		f.fileTest();
//		System.out.print("�������ϸ� : ");
//		Scanner sc=new Scanner(System.in);
//		String file=sc.nextLine();
//		f.deleteFile("C:\\test\\");
//		System.out.println(file+" �����Ϸ�");
		
		
		
		FileInputOutput fio=new FileInputOutput();
//		fio.fileOutput();
//		fio.fileInputStream();
		
		ReaderWriterTest rwt=new ReaderWriterTest();
//		rwt.writerTest();
		rwt.readerTest();
	}
}
