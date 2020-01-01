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
		//Object보조스트림 이용하여 처리하기!
		try(FileOutputStream fos=new FileOutputStream("person.bs");
				ObjectOutputStream oos=new ObjectOutputStream(fos)) {
			Scanner sc=new Scanner(System.in);
			
			for(int i=0; i<persons.length; i++) {
				Person p=new Person();
				System.out.println((i+1)+"번째 사람 정보를 입력");
				System.out.print("이름 : ");
				p.setName(sc.nextLine());
				System.out.print("나이 : ");
				p.setAge(sc.nextInt());
				System.out.print("성별 : ");
				p.setGender(sc.next().charAt(0));
				System.out.print("키 : ");
				p.setHeight(sc.nextDouble());
				sc.nextLine();
				persons[i]=p;
			}
			//파일에 쓰기!
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
				System.out.println("이름 : "+p.getName());
				System.out.println("나이 : "+p.getAge());
				System.out.println("성별 : "+p.getGender());
				System.out.println("키 : "+p.getHeight());
			}
			
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}catch(IOException ios) {
			ios.printStackTrace();
		}
	}
}

