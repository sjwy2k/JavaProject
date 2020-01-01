package com.object.ex.main;

import com.object.ex.controller.ObjectExample;

public class Main {

	public static void main(String[] args) {
		ObjectExample ob=new ObjectExample();
		System.out.println(ob.joinMsg("여러분"," 힘냅시다"));
		System.out.println(ob.sumInt(2, 7)!=0?ob.sumInt(2, 7):"첫번째 값이 두번째 값보다 작습니다.");
		System.out.println(ob.sumInt(7, 2));
		System.out.println(ob.isUpperCase('A'));
		
		
	}

}
