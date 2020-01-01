package com.filetest.main;

import com.filetest.controller.FileIOExam;
import com.filetest.controller.TestFileRW;

public class Main {

	public static void main(String[] args) {
		
//		FileTest f=new FileTest();
////		f.fileTest();
//		System.out.print("지울파일명 : ");
//		Scanner sc=new Scanner(System.in);
//		String file=sc.nextLine();
//		f.deleteFile("C:\\test\\");
//		System.out.println(file+" 삭제완료");
		
//		FileInputOutput fio=new FileInputOutput();
//		fio.fileOutput();
//		fio.fileInputStream();
		
//		ReaderWriterTest rwt=new ReaderWriterTest();
//		rwt.writerTest();
//		rwt.readerTest();
		
//		FileIOExam fie=new FileIOExam();
//		fie.fileIOWriter();
//		fie.fileIOReader();
		
		TestFileRW tfrw=new TestFileRW();
		tfrw.saveFile();//파일 생성
		tfrw.readFile();//파일 읽기
		
		
		
	}
}
