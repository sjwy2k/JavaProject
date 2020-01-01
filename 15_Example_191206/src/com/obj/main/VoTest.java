package com.obj.main;

import com.obj.controller.MemberController;
import com.obj.model.vo.Member;
import com.obj.model.vo.Test;

public class VoTest {

	public static void main(String[] args) {
//		new MemberController().enrollMember();
//		new MemberController().mainMenu();
//		Test t=new Test();
//		System.out.println(t.getAge()); //변수가 heap에 저장되어있음
//		System.out.println(Test.name);  //변수가 static에 저장되어 있음
		//static 변수라서 클래스명에 접근해 바로 호출가능, class변수라고도 함
		
//		Member.memberNo;
		//static변수지만 접근제한자가 private라서 직접 접근이 불가능
		//setter, getter로 접근
		
		//static은 객체를 생성하지 않고 접근이 가능해야하는데
		//객체를 생성하지 않고는 접근이 불가능
		//static 변수에 대한 getter/setter는
		//마찬가지로 static으로 선언해야함.
//		new Member().getMemberNo();//heap영역 접근
//		Member.getMemberNo();//static에 접근
		
		
		Member m1=new Member();
		Member m2=new Member();
		Member m3=new Member();
		
		System.out.println("m1 : "+m1.getMemberNo());
		System.out.println("m2 : "+m2.getMemberNo());
		System.out.println("m3 : "+m3.getMemberNo());
		
		Member m4=new Member();
		System.out.println("m4 : "+m4.getMemberNo());
	}
}
