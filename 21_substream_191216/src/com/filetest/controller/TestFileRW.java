package com.filetest.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileRW {

	
	//파일 입출력을 하면
	//단방향 통신
	public void saveFile() {
		FileWriter fw=null;
		try {
			fw=new FileWriter("today.r");
			fw.write("오늘은 월요일 참 힘드네요");
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
	
	public void readFile() {
		try(FileReader fr
				=new FileReader("today.r")) {
			int value=0;
			StringBuffer sb=new StringBuffer();
			while((value=fr.read())!=-1) {
				sb.append((char)value);
			}
			System.out.println(sb);
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
