package com.emp.model.vo;

public class Member {
	//���̵�, �н�����, �̸���, �ּ�, ��ȭ��ȣ, �̸�, ����
	private String id;
	private String password;
	private String email;
	private String phone;
	private String name;
	private char gender;
	
	//������
	public Member() {}//����Ʈ������
	//�Ű������� �ִ� ������
	public Member(String id,String password,
			String email, String phone, String name,
			char gender)
	{
		this.id=id;
		this.password=password;
		this.email=email;
		this.phone=phone;
		this.name=name;
		this.gender=gender;
	}
	
	public void setId(String id) {
		this.id=id;
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
