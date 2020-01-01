package com.car.controller;

import java.util.Scanner;

public class Car {

	private String model;
	private int cc;
	private int doors;
	private String color;
	
	public Car() {
		this.setModel("기본 모델");
		this.setCc(3000);
		this.setDoors(4);
		this.setColor("Black");
	}
	
	public Car(String model, int cc, int doors, String color) {
		this.setModel(model);
		this.setCc(cc);
		this.setDoors(doors);
		this.setColor(color);
	}
	
	public Car inputCar() {
		Scanner sc=new Scanner(System.in);
		Car car=new Car();
		System.out.print("모델명 : ");
		car.setModel(sc.nextLine());
		System.out.print("배기량 : ");
		car.setCc(sc.nextInt());
		System.out.print("도어수 : ");
		car.setDoors(sc.nextInt());
		System.out.print("색상 : ");
		car.setColor(sc.nextLine());
		
		return car;
	}
	
	public String carInfo(Car car) {
		String result="";
		result+="차 모델 : "+car.getModel()+"\n";
		result+="차 배기량 : "+car.getCc()+"cc\n";
		result+="차 창문 수 : "+car.getDoors()+"\n";
		result+="차 색 : "+car.getColor();
		return result;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
