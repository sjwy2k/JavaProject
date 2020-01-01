package com.obj.main;

import com.obj.controller.MemberController;
import com.obj.model.vo.Test;

public class VoTest {

	public static void main(String[] args) {
//		new MemberController().enrollMember();
//		new MemberController().mainMenu();
		Test t=new Test();
		System.out.println(t.getAge()); //변수가 heap에 저장되어있음
		System.out.println(Test.name);  //변수가 static에 저장되어 있음
		//static 변수라서 클래스명에 접근해 바로 호출가능, class변수라고도 함
		
		
	}
}
