package com.car.main;

import com.car.controller.Car;

public class Main {

	public static void main(String[] args) {
		System.out.println("기본 차");
		Car car=new Car();
		System.out.println(car.carInfo(car));
		
		System.out.println("새로운 차 생성자로");
		Car newCar=new Car("제네시스", 5000, 6, "White");
		System.out.println(newCar.carInfo(newCar));
		
		newCar.setModel("페라리");
		System.out.println(newCar.carInfo(newCar));
		
	}

}
