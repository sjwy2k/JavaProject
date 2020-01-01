package net.kh.circle;

import net.kh.circle.model.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c=new Circle();
		System.out.println("반지름 길이 : "+c.getRadius()+"cm");
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		
		c.incrementField();
		c.incrementField();
		c.incrementField();
		System.out.println("반지름 길이 : "+c.getRadius()+"cm");
		c.getAreaOfCircle();
		c.getSizeOfCircle();
	}

}
