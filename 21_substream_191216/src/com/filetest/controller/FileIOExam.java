package com.filetest.controller;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExam {

	public void fileIOWriter() {
		File dir=new File("c:\\test\\");
		FileWriter fw=null;
		if(dir.exists()) {
			dir.mkdirs();
		}
		try {
			fw=new FileWriter("today.r");
			fw.write("오늘은 월요일이라 힘드네요");
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
	
	public void fileIOReader() {
		try(FileReader fr=new FileReader("today.r")) {
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
