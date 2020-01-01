package com.animal.model.vo;

import com.object2.model.vo.Student;

public class Lion extends Animal{

	public Lion() {
		this.setName("사자");
		this.setType("사자과");
		this.setFootNum(4);
	}
	
	public Lion(String name, String type, int footNum) {
		super(name, type, footNum);
	}
	
	@Override
	public void action() {
		System.out.println("크아앙~ 사자~");
	}
	
	@Override
	public Object clone() {
		Lion l=new Lion(this.getName(), this.getType(), this.getFootNum());
		return l;
	}
	
	@Override
	public boolean equals(Object obj) {
		Lion temp=(Lion)obj;
		if(getName().equals(temp.getName())
				&&getType()==temp.getType()
				&&getFootNum()==temp.getFootNum()) {
			return true;
		}
		return false;
	}
}
