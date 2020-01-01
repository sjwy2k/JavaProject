package com.object2.model.vo;

public class Person {

	private String name;
	private int age;
	private String gender;
	
	public Person() {}

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()>1) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//부모의 메서드를 주석처리하면 @Override 어노테이션 처리한
	//메서드들이 모두 오류가 난다. @Override는 부모메서드를 구현했다는
	//사실을 컴파일러에게 알리는역할.
	public void action() {
		System.out.println("나는 사람이다!");	
	}
	
	
	//clone(), equals(), hashCode(), toString()
	//Object객체 중 (오버라이딩해서 사용하는) 자주 쓰는 메서드들
	
}
