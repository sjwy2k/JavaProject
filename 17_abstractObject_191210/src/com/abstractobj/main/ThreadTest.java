package com.abstractobj.main;

public class ThreadTest extends Thread{

	public void run() {
		try {
			for(int i=0; i<10; i++) {
				Thread.sleep(500);
				System.out.println("thread : "+i);
			}
		} catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
