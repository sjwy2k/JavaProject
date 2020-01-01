package com.substream.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.substream.model.vo.Person;

public class ObjectIO {

	private Person[] persons=new Person[3];
	public void saveObject() {
		//Object������Ʈ�� �̿��Ͽ� ó���ϱ�!
		try(FileOutputStream fos=new FileOutputStream("person.bs");
				ObjectOutputStream oos=new ObjectOutputStream(fos)) {
			Scanner sc=new Scanner(System.in);
			
			for(int i=0; i<persons.length; i++) {
				Person p=new Person();
				System.out.println((i+1)+"��° ��� ������ �Է�");
				System.out.print("�̸� : ");
				p.setName(sc.nextLine());
				System.out.print("���� : ");
				p.setAge(sc.nextInt());
				System.out.print("���� : ");
				p.setGender(sc.next().charAt(0));
				System.out.print("Ű : ");
				p.setHeight(sc.nextDouble());
				sc.nextLine();
				persons[i]=p;
			}
			//���Ͽ� ����!
			oos.writeObject(persons);
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	
	
	public void readObject() {
		try(ObjectInputStream ois=
				new ObjectInputStream(new FileInputStream("person.bs"))) {
			persons=(Person[])ois.readObject();
			
			for(Person p:persons) {
				System.out.println("�̸� : "+p.getName());
				System.out.println("���� : "+p.getAge());
				System.out.println("���� : "+p.getGender());
				System.out.println("Ű : "+p.getHeight());
			}
			
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}catch(IOException ios) {
			ios.printStackTrace();
		}
	}
}

