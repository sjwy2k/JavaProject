package com.thread.main;

import com.thread.controller.CharacterController;
import com.thread.controller.ThreadTest;

public class Main {

	public static void main(String[] args) {
		//Thread �����ϱ�
		ThreadTest tt=new ThreadTest("�Ѹ�");
		ThreadTest tt2=new ThreadTest("���");
		tt.setPriority(3);
		tt2.setPriority(2);
		
		tt.start();
		tt2.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main : "+i);
		}
		System.out.println("Main ����");
		
		
		
		//Runnable �������̽��� �����ϱ�
		CharacterController cc=new CharacterController("�Ѹ�",500);
		CharacterController cc2=new CharacterController("���",1000);
		Thread tt3=new Thread(cc);
		Thread tt4=new Thread(cc2);
		tt3.setPriority(10);
		tt4.setPriority(4);
		tt3.start();
		tt4.start();
		
		
	}
}
