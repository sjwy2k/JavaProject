package com.substream.controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.substream.model.vo.Person;

public class DataInOut {

	private Person[] ps=new Person[4];
	//DataStream�� �̿��Ͽ� ���Ϸ� �����ϱ�
	public void savePerson() {
		Person[] ps=new Person[4];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<ps.length; i++) {
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
			ps[i]=p;
		}
		
		//ps�� �ִ� Person��ü 4���� ���Ͽ� �����ϱ�
		
//		try(FileWriter fw=new FileWriter("person.bs")) {
		try(FileOutputStream fos=new FileOutputStream("person.bs");
				DataOutputStream dos=new DataOutputStream(fos)) {
			//4�� Person��ü ���������� fw�� �ֱ�
			for(Person p:ps) {
//				fw.write(p.getName()+",");
//				fw.write(p.getAge()+",");
//				fw.write(p.getGender()+",");
//				fw.write(String.valueOf(p.getHeight())+"#");
				dos.writeUTF(p.getName()); //String�� UTF�� �޴´�
				//******write�� ������ ���� ���� ������ ����.
				dos.writeInt(p.getAge());//****
				dos.writeChar(p.getGender());
				dos.writeDouble(p.getHeight());
			}
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	public void readPerson() {
//		try(FileReader fr=new FileReader("person.bs")) {
		try(FileInputStream fis =new FileInputStream("person.bs");
				DataInputStream dis=new DataInputStream(fis)) {
			
			int count=0;
			Person[] ps=new Person[4];
			for(Person p:ps) {
				String name=dis.readUTF();
				int age=dis.readInt();
				char gender=dis.readChar();
				double height=dis.readDouble();
				ps[count++]=new Person(name, age, gender, height);
			}
			
			
//			int value=0;
//			StringBuffer sb=new StringBuffer();
//			while((value=fr.read())!=-1) {
//				sb.append((char)value);
//			}
//			
//			Person[] ps=new Person[4];
//			int count=0;
//			for(String s:new String(sb).split("#")) {
//				Person p=new Person();
//				for(int i=0; i<s.length(); i++) {
//					String[] temp=s.split(",");
//					p.setName(temp[0]);
//					p.setAge(Integer.parseInt(temp[1]));
//					p.setGender(temp[2].charAt(0));
//					p.setHeight(Double.parseDouble(temp[3]));
//				}
//				ps[count++]=p;
//			}
			
			//Person �迭�� �ִ� �����
			for(Person p:ps) {
				System.out.println(p);
			}
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
