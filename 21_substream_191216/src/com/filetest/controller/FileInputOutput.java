package com.filetest.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {

	//FileOutputStream객체를 이용하여
	//변수에 저장되어있는 데이터를 저장
	public void fileOutput() {
		//1. 파일을 저장할때는 먼저 저장대상 파일을 생성하고
		//2. 파일과 연결되는 스트림을 생성
		//3. 스트림이 생성되면 스트림을 통해 데이터전송
		//파일입출력은 항상 Exception처리를 해줘야함.		
		//Stream객체는 항상 close() 메서드로 객체를 닫아줘야함
		
		File f=new File("test.txt");
		//스트림연결
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(f);
			//왜 String을 bytes로 바꾸면 깨지는가? 4byte를 2byte로 넣기 때문.
			byte[] data= "여러분 힘냅시다 할 수 있어요".getBytes();
//			for(int i=0; i<10; i++) {
//				fos.write(i);//출력!!
//			}
			fos.write(data);//출력!!
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				fos.close();//닫는 데에도 에러가 날 수 있다. 예외처리
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		} 
	}
	
	
	//저장된 file inputStream으로 읽어오기
	public void fileInputStream() {
		//1. file을 연결
		//2. inputStream 생성
		//3. read로 불러옴(int단위)
		//4. Exception처리, stream닫아줘야됨
		
		File f=new File("test.txt");
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
			int value=0; 
			//-1은 read()메서드의 리턴값.
			//끝까지 다 읽으면 -1을 리턴
			
			//read()메서드이 -1 리턴값이 아니라면, 
			//파일 읽을 거리가 남아있다면
			while((value=fis.read())!=-1) { 
				System.out.print((char)value);
			}
			//-1이 되면 while문을 벗어남
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
