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
				System.out.println("공격을 피했다!");
			}else {
				setHp(getHp()-damage);
				System.out.println(getName()+"이/가 공격당했다!");
				System.out.println(damage+"만큼의 피해를 입었다!");
				if(getHp()<=0) {
					System.out.println(getName()+"님이 사망하셨습니다.");
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
