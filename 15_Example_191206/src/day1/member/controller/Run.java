package day1.member.controller;

import day1.member.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member m=new Member();
		m.setMemberId("user00");
		m.setMemberPwd("user00");
		m.setMemberName("유병승");
		m.setAge(19);
		m.setGender('남');
		m.setPhone("01011112222");
		m.setEmail("abc@abc.com");
		
		System.out.println(m.getMemberId()+m.getMemberPwd()+m.getMemberName()+m.getAge()+m.getGender()+m.getPhone()+m.getEmail());
	}
}
