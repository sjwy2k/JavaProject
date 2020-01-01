package day2.circle.model.vo;

public class Circle {

	private final static double PI=3.14;
	private static int radius=1;
	private int number;
	
	public Circle() {
		
	}

	public void incrementField() {
		Circle.radius++;
	}
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static int getRadius() {
		return radius;
	}

	public static void setRadius(int radius) {
		Circle.radius = radius;
	}
}
