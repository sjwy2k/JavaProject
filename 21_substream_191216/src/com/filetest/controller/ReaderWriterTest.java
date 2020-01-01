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
			fw.write("여러분 오늘 금요일!");
			fw.write("이제 여러분은 쉴 수 있어요..");
			fw.write("하지만.. 전??? 아가야 울지마!");
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
				//191211 stringbuffer append()메서드
				//append() insert() delete()
				sb.append((char)value);
			}
			System.out.println(sb);
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
