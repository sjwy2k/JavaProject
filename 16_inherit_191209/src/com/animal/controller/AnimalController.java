package com.animal.controller;

import com.animal.model.vo.Cat;
import com.animal.model.vo.Chicken;
import com.animal.model.vo.Lion;

public class AnimalController {

	public void basicAnimalTest() {
		Cat c=new Cat();
		Chicken ck=new Chicken();
		Lion l=new Lion();
		
		System.out.println("이름 : "+c.getName()+"\n"
				+"종류 : "+c.getType()+"\n"
				+"다리수 : "+c.getFootNum());
		System.out.println();
		System.out.println("이름 : "+ck.getName()+"\n"
				+"종류 : "+ck.getType()+"\n"
				+"다리수 : "+ck.getFootNum());
		System.out.println();
		System.out.println("이름 : "+l.getName()+"\n"
				+"종류 : "+l.getType()+"\n"
				+"다리수 : "+l.getFootNum());
		
		System.out.println();
		System.out.print("고양이 울음소리 : ");
		c.action();
		System.out.print("닭 울음소리 : ");
		ck.action();
		System.out.print("사자 울음소리 : ");
		l.action();
		
		System.out.println();
		System.out.println("사자 l의 정보");
		System.out.println(l.hashCode());
		System.out.println("이름 : "+l.getName()+"\n"
				+"종류 : "+l.getType()+"\n"
				+"다리수 : "+l.getFootNum());
		System.out.println();
		//동등비교
		Lion l2=(Lion)l.clone();
		
		
		System.out.println("l을 복사한 사자 l2의 정보");
		System.out.println(l2.hashCode());
		System.out.println("이름 : "+l2.getName()+"\n"
				+"종류 : "+l2.getType()+"\n"
				+"다리수 : "+l2.getFootNum());
		
		System.out.println("동등한가? "+l.equals(l2));
		
	}

}
