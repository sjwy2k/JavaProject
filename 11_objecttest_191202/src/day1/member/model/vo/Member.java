package day1.member.model.vo;

public class Member {
	
//	public Member(String memberId, 
//			String memberPwd, 
//			String memberName, 
//			String phone, 
//			String email, 
//			int age, 
//			char gender) {
//		this.memberId=memberId;
//		this.memberPwd=memberPwd;
//		this.memberName=memberName;
//		this.phone=phone;
//		this.email=email;
//		this.gender=gender;
//	}
	

	private String memberId, memberPwd, memberName, phone, email;
	private int age;
	private char gender;
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
