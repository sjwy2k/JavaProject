package day2.circle.model.controller;

import day2.circle.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c=new Circle();
		System.out.println("반지름 길이 : "+Circle.getRadius()+"cm");
		c.incrementField();
		System.out.println("반지름 길이 : "+Circle.getRadius()+"cm");
		
		Circle.setRadius(7);
		System.out.println("반지름 길이 : "+Circle.getRadius()+"cm");
	}

}
