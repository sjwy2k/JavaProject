package com.thread.controller;

import com.thread.model.vo.Character;

public class CharacterController extends Character implements Runnable{

	public CharacterController() {
		// TODO Auto-generated constructor stub
	}

	public CharacterController(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void run() {
		while(true) {
			int damage=(int)(Math.random()*20);
			if(damage==0) {
				System.out.println("������ ���ߴ�!");
			}else {
				setHp(getHp()-damage);
				System.out.println(getName()+"��/�� ���ݴ��ߴ�!");
				System.out.println(damage+"��ŭ�� ���ظ� �Ծ���!");
				if(getHp()<=0) {
					System.out.println(getName()+"���� ����ϼ̽��ϴ�.");
					break;
				}
			}
			
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
	}
	
	
}
