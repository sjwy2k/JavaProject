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
		//���ܹ߻�!
		int[] nums=new int[2];
		FileInputStream fi=null; 
		//try���� ������ �����̹Ƿ� try�ȿ��� �����ϸ� try�ȿ����� ��밡��
		try {
			nums[3]=100;//ArrayOutOfBoundException
			fi=new FileInputStream(f); //file inputstream�� ������.
			fi.read();
			System.out.println("�̰Ž���Ǵ�?");
		//}catch(Exception e) { 
			//��Ӱ��迡 �ִ� ���ܴ� �θ� ���� ������ �ؿ� �ڵ�� �������� �ʰ� �Ѿ��
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
			System.out.println("����~~!");
			e.printStackTrace(); //ó������� �˷��ִ� �޼��� tray
			return;
		} finally { 
			//file����¿����� finally �������� 
			//�ݵ�� Stream�� �ݴ� ����ó���� �� �־�� ��
			try {
				fi.close();//inputstream close
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("�����ǽ�������!");
			System.out.println("try���� �ۿ��� �����ϴ°�");
		}
		//checked Exception
		
		
	}
	
	public void tryWithResource() {
		try(FileInputStream fi
				=new FileInputStream("text.txt");
			ObjectInputStream ois
				=new ObjectInputStream(fi);) {
			//�ݾ��ִ� ���� �ڵ����� �ݾ��ش�!. 
			fi.read();
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			//fi.close(); �Ű������� �ȿ� �����ϴ� �� �����ε� 
			//�ݴ°͸� �ڵ����� �ݾ��ش�.
		}
	}
	
}
