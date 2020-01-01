package com.kh.member.run;

import com.kh.member.controller.Member;

public class Main {

	public static void main(String[] args) {
		
		Member[] members=new Member[5];
		Member rc01=new Member("rclass01", "0987", 25, "서울시 강남구", "01011112222", '여');
		Member rc02=new Member("rclass02", "1234", 26, "서울시 서초구", "01022223333", '남');
		Member rc03=new Member("rclass03", "5678", 27, "서울시 구로구", "01033334444", '여');
		Member rc04=new Member("rclass04", "9012", 28, "서울시 광진구", "01044445555", '남');
		Member rc05=new Member("rclass05", "5959", 29, "서울시 서대문구", "01099998888", '여');
		
		Member mb=null;
		for(int i=0; i<members.length; i++) {
			switch(i) {
				case 0:mb=rc01;break;
				case 1:mb=rc02;break;
				case 2:mb=rc03;break;
				case 3:mb=rc04;break;
				case 4:mb=rc05;break;
			}
			members[i]=mb;
		}
		
		System.out.println("회원정보 내역 출력");
		for(int i=0; i<members.length; i++) {
			System.out.println("------------------------------------");
			System.out.println("아이디 : "+members[i].getId());
			System.out.println("비밀번호 : "+members[i].getPw());
			System.out.println("나이 : "+members[i].getAge());
			System.out.println("주소 : "+members[i].getAddress());
			System.out.println("연락처 : "+members[i].getPhone());
			System.out.println("성별 : "+members[i].getGender());
		}
		
	}

}
