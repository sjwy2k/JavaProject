package com.abstractobj.controller;

import com.abstractobj.model.vo.Animal;
import com.abstractobj.model.vo.Cat;
import com.abstractobj.model.vo.Dog;

public class AbstractController {

	public void abstractTest() {
		//��ü �����Ұ���
//		Animal a=new Animal();
		Animal animal; //������ �ڷ������� ����� ����
		
		animal=new Dog();
		if(animal instanceof Dog) {
			((Dog)animal).bark();
		}
		printAnimal(animal);
		printAnimal(new Dog());
		animal.howl();
		//animal�� �߻�޼��� howl�� ������ ���� �ƴϴ�
		//�������ε�(�������� ����)�Ǿ� 
		//�� �ڼ� Ŭ�������� ���ǵ� �޼��尡 ȣ��
		
		
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
			System.out.println("��������!");
		} else if(a instanceof Cat) {
			System.out.println("����̾�!");
		}
	}

}
