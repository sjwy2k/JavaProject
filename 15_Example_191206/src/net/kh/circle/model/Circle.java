package net.kh.circle.model;

public class Circle {

	private final static double PI=3.14;
	private int radius=1;
	
	public Circle() {
		
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void incrementField() {
		this.radius++;
	}
	
	public void getAreaOfCircle() {
		System.out.println("원의 둘레 : "+((radius*2)*Circle.PI)+"cm");
	}

	public void getSizeOfCircle() {
		System.out.println("원의  넓이 : "+(radius*radius*Circle.PI)+"cm");
	}
	
}
