package com.exception.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExceptionTest {

	public void methodA() throws FileNotFoundException{
		methodB();
	}
	public void methodB() throws FileNotFoundException{
		methodC();
	}
	public void methodC(){
		File f=new File("test.txt");
		//예외발생!
		int[] nums=new int[2];
		FileInputStream fi=null; 
		//try문은 독립된 공간이므로 try안에서 선언하면 try안에서만 사용가능
		try {
			nums[3]=100;//ArrayOutOfBoundException
			fi=new FileInputStream(f); //file inputstream을 열었다.
			fi.read();
			System.out.println("이거실행되니?");
		//}catch(Exception e) { 
			//상속관계에 있는 예외는 부모가 위에 있으면 밑에 코드는 실행하지 않고 넘어간다
		} catch(IOException e) {
			File f1=new File("text.txt");
			try {
				f1.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			int[] test=new int[nums.length+10];
			System.arraycopy(nums,0,test,0,nums.length);
			nums=test;
			System.out.println("실행~~!");
			e.printStackTrace(); //처리경과를 알려주는 메세지 tray
			return;
		} finally { 
			//file입출력에서는 finally 구문에서 
			//반드시 Stream을 닫는 예외처리를 해 주어야 함
			try {
				fi.close();//inputstream close
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("무조건실행하자!");
			System.out.println("try구문 밖에서 실행하는것");
		}
		//checked Exception
		
		
	}
	
	public void tryWithResource() {
		try(FileInputStream fi
				=new FileInputStream("text.txt");
			ObjectInputStream ois
				=new ObjectInputStream(fi);) {
			//닫아주는 것은 자동으로 닫아준다!. 
			fi.read();
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			//fi.close(); 매개변수를 안에 선언하는 것 만으로도 
			//닫는것만 자동으로 닫아준다.
		}
	}
	
}
