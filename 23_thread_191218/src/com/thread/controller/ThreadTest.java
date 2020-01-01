package com.thread.controller;

//Thread��ü�� ��ӹ޾� Thread�� ����
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
				sleep(1000);//1�� ��ٷȴٰ� ����
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println("Thread "+name+" ����");
	}

}
