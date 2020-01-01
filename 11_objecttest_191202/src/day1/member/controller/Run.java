package day1.member.controller;

import day1.member.model.vo.*;

public class Run extends Member {

	public static void main(String[] args) {
		
		Member mb=new Member();
		
		String id="sjw", pw="0987", name="신재원", phone="01011112222", email="sjw@abc.com";
		int age=33;
		char gender='남';
		
		mb.setMemberId(id);
		mb.setMemberPwd(pw);
		mb.setMemberName(name);
		mb.setPhone(phone);
		mb.setEmail(email);
		mb.setAge(age);
		mb.setGender(gender);
		
		System.out.println(mb.getMemberId());
		System.out.println(mb.getMemberPwd());
		System.out.println(mb.getMemberName());
		System.out.println(mb.getPhone());
		System.out.println(mb.getEmail());
		System.out.println(mb.getAge());
		System.out.println(mb.getGender());
		
	}
}
