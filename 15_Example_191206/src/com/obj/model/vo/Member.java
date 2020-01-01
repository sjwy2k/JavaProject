package com.obj.model.vo;

public class Member {
	private int memberNo; 
	private static int count; //static변수
	
	/*
	 * public static void setMemberNo(int memberNo) {//static변수의 원활한 접근을 위해 //
	 * this.memberNo=memberNo; //static변수는 heap영역 말고 static 영역에서 접근을 권장
	 * Member.memberNo=memberNo;
	 * 
	 * // System.out.println(id);//객체를 생성했는지 아닌지 불분명 // getName();//당장은 접근불가 }
	 */
	
	//초기화블록
	{
		count++;
	}
	
	public int getMemberNo() {//static변수>static메서드
		return memberNo;
	}
	

	
 	//아이디 패스워드 이메일 주소 전화번호 이름 성별
	private String id;
	private String password;
	private String email;
	private String phone;
	private String name;
	private char gender;
	
	
	//생성자
	public Member() {
		memberNo=count;
	}//default 생성자 작성하는게좋음
	//매개변수 있는 생성자
	public Member(String id, String password, String email, String phone, String name, char gender) {
		this.id=id;
		this.password=password;
		this.email=email;
		this.phone=phone;
		this.name=name;
		this.gender=gender;		
	}
	
	//getter, setter
	public void setId(String id) {
		this.id=id;
//		memberNo=10;//넣을 수 있다
//		Member.getMemberNo();//호출할 수 있다
	}
	
	public String getId() {
		return id;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public char getGender() {
		return gender;
	}
	
}
