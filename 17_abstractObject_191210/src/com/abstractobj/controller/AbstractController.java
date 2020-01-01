package com.abstractobj.controller;

import com.abstractobj.model.vo.Animal;
import com.abstractobj.model.vo.Cat;
import com.abstractobj.model.vo.Dog;

public class AbstractController {

	public void abstractTest() {
		//자체 생성불가능
//		Animal a=new Animal();
		Animal animal; //참조형 자료형으로 사용이 가능
		
		animal=new Dog();
		if(animal instanceof Dog) {
			((Dog)animal).bark();
		}
		printAnimal(animal);
		printAnimal(new Dog());
		animal.howl();
		//animal의 추상메서드 howl을 실행한 것이 아니다
		//동적바인딩(동적으로 연결)되어 
		//각 자손 클래스에서 정의된 메서드가 호출
		
		
		animal=new Cat();
		if(animal instanceof Cat) {
			((Cat)animal).meow();
		}
		printAnimal(animal);
		printAnimal(new Cat());
		animal.howl();
		
	}
	
	public void printAnimal(Animal a) {
		if(a instanceof Dog) {
			System.out.println("강아지야!");
		} else if(a instanceof Cat) {
			System.out.println("고양이야!");
		}
	}

}
