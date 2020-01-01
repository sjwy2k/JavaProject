package com.thread.controller;

//Thread객체를 상속받아 Thread를 구현
public class ThreadTest extends Thread{
	private String name;
	
	public ThreadTest() {
		// TODO Auto-generated constructor stub
	}
	
	public ThreadTest(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Thread "+name+" : "+i);
			try {
				sleep(1000);//1초 기다렸다가 실행
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println("Thread "+name+" 종료");
	}

}
