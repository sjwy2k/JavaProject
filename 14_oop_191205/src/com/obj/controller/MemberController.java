package com.obj.controller;

import java.util.Scanner;
import com.obj.model.vo.Test;
import com.obj.model.vo.Member;

public class MemberController {
	private Member m1;
	private Member m2;
	private Member m3;
	private Member m4;
	
	
	//사용자가 회원을 관리하기 위한 메뉴출력
	public void mainMenu() {
		String name=Test.name; //model.vo.Test의 static변수 호출, 대입
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1. 회원등록");
			System.out.println("2. 전체회원조회");
			System.out.println("3. ID로 회원조회");
			System.out.println("4. 회원정보 수정");
			System.out.println("0. 프로그램종료");
			System.out.print("입력 : ");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:m1=this.enrollMember("pp","pp","pp@pp.com","010","하하",'남');break;
				case 2:this.searchMember();break;
				case 3:this.searchId();break;
				case 4:this.updateMember();break;
				case 0:System.out.println("프로그램을 종료");return;
			}
		}
		
	}
	
	public Member enrollMember(String id, String password, 
			String email, String name, String phone, char gender) {
		return new Member(id, password, email, phone, name, gender);
	}
	
	//회원가입
//	public void enrollMember2() {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("id : ");
//		String id=sc.nextLine();
//		System.out.print("password : ");
//		String password=sc.nextLine();
//		System.out.print("이름 : ");
//		String name=sc.nextLine();
//		System.out.print("이메일 : ");
//		String email=sc.nextLine();
//		System.out.print("전화번호 : ");
//		String phone=sc.nextLine();
//		System.out.print("성별(남/여) : ");
//		char gender=sc.next().charAt(0);
//		
//		//m1은 객체, 기본값은 주소값이므로 null
//		if(m1==null) { //객체가 비어있다면 입력
//			m1=new Member(id, password, email, phone, name, gender);
//		} else if(m2==null) {
//			m2=new Member(id, password, email, phone, name, gender);
//		} else if(m3==null) {
//			m3=new Member(id, password, email, phone, name, gender);
//		} else if(m4==null) {
//			m4=new Member(id, password, email, phone, name, gender);
//		} else {
//			System.out.println("회원을 더 등록할 수 없습니다.");
//		}
//	}
		
	//전체회원검색
	public void searchMember() {
		String members="";
		if(m1!=null) { //객체가 비어있지 않다면, 들어 있다면
			members+=m1.getId()+m1.getName()+m1.getEmail()+m1.getPhone()+m1.getGender()+"\n";
		}if(m2!=null) {
			members+=m2.getId()+m2.getName()+m2.getEmail()+m2.getPhone()+m2.getGender()+"\n";
		}if(m3!=null) {
			members+=m3.getId()+m3.getName()+m3.getEmail()+m3.getPhone()+m3.getGender()+"\n";
		}if(m4!=null) {
			members+=m4.getId()+m4.getName()+m4.getEmail()+m4.getPhone()+m4.getGender()+"\n";
		} 
		if(!members.equals("")) {
			System.out.println(members);
		} else {
			System.out.println("등록된 회원이 없습니다");
			
		}
	}
	
	//회원아이디로 조회하기
	public void searchId() {
		Scanner sc=new Scanner(System.in);
		System.out.print("검색할 아이디 : ");
		String searchId=sc.nextLine();
		if(m1!=null&&m1.getId().equals(searchId)) {
			//m1아이디 찾았으므로 출력
			System.out.println(m1.getId()+m1.getName()+m1.getEmail()+m1.getPhone()+m1.getGender());
		}else if(m2!=null&&m2.getId().equals(searchId)) {
			System.out.println(m2.getId()+m2.getName()+m2.getEmail()+m2.getPhone()+m2.getGender());
		}else if(m3!=null&&m3.getId().equals(searchId)) {
			System.out.println(m3.getId()+m3.getName()+m3.getEmail()+m3.getPhone()+m3.getGender());
		}else if(m4!=null&&m4.getId().equals(searchId)) {
			System.out.println(m4.getId()+m4.getName()+m4.getEmail()+m4.getPhone()+m4.getGender());
		}else {
			System.out.println("찾을 수 없습니다.");
		}
	}

	//회원정보수정하기
	public void updateMember() {
		Scanner sc=new Scanner(System.in);
		System.out.print("수정할 회원아이디 : ");
		String updateId=sc.nextLine();
		System.out.print("수정할 이름 : ");
		String updateName=sc.nextLine();
		
		if(m1!=null&&m1.getId().equals(updateId)) {
			//m1아이디 찾았으므로 출력
			m1.setName(updateName);
		}else if(m2!=null&&m2.getId().equals(updateId)) {
			m2.setName(updateName);
		}else if(m3!=null&&m3.getId().equals(updateId)) {
			m3.setName(updateName);
		}else if(m4!=null&&m4.getId().equals(updateId)) {
			m4.setName(updateName);
		}else {
			System.out.println("찾을 수 없습니다.");
		}
		
	}
	
//	public void enrollMember() {
//		//회원 3명을 등록하기 - Member class
//		Member m1, m2, m3;
//		m1=new Member();//디폴트로 생성
//		//유병승이라는 데이터 등록
//		m1.setId("user01");
//		m1.setPassword("user01");
//		m1.setName("유병승");
//		m1.setEmail("prince0324@naver.com");
//		m1.setGender('남');
//		m1.setPhone("01036446259");
//		
//		m2=new Member("user02", "user02", "abcd@naver.com", "010123123", "김말똥", '여');
//		
//		//등록된 회원은 2명
//		//등록된 전체 회원조회(데이터가져옴)
//		
//		System.out.println(m1.getId()+m1.getName()+m1.getEmail()+m1.getPhone()+m1.getPhone());
//		System.out.println(m2.getId()+m2.getName()+m2.getEmail()+m2.getPhone()+m2.getPhone());
//		
//		//조건조회 회원중 id=user01만 조회
//		if(m1.getId().equals("user01")) {
//			System.out.println(m1.getId()+m1.getName()+m1.getEmail()+m1.getPhone()+m1.getPhone()+m1.getGender());
//		}
//		if(m2.getId().equals("user01")) {
//			System.out.println(m2.getId()+m2.getName()+m2.getEmail()+m2.getPhone()+m2.getPhone()+m2.getGender());
//		}
//		
//		
//		
//		m1.setName("김병승");
//		System.out.println(m1.getId()+m1.getName()+m1.getEmail()+m1.getPhone()+m1.getPhone()+m1.getGender());
//	}

	
}

