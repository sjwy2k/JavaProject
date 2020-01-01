package com.filetest.controller;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public void fileTest() {
		//기본 File 객체 생성
		//file이 hdd에 생성된 상태가 아닙니다.
		//heap영역에 File에 대한 정보만 가지고 있는 상태
		
		File dir=new File("C:\\test\\test1\\tt");
		if(!dir.exists()) {
//			dir.mkdir();//한단계 건너 단일폴더
			dir.mkdirs();//경로 내 모든 폴더 (한 단계 이상)
		}
		File f=new File("C:\\test\\test1\\tt\\text.txt");
		System.out.println("fileTest실행");
		
		//File객체를 이용해서 실제파일생성해보기
		//createNewFile()메소드를 이용해서 파일을 생성
		try {
			if(!f.exists()) { //(!파일이있니?)==파일이없다면
				f.createNewFile();//이때 파일이 생김
			}
			System.out.println(f.getAbsolutePath());
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	public void deleteFile(String file) {
		File f=new File(file);
		if(f.exists()) {//!파일이 있다면 지워라
			f.delete();
		}
	}
}
