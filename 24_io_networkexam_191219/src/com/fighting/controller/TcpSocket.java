package com.fighting.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.fighting.model.vo.Book;

public class TcpSocket {

	public void fileUpload() {
		//1. ��Ʈ, ip�� �˾ƾ�
		int port=3000;
		String ip="192.168.20.34";
		try {
			//������������Ѽ��ϻ���
			Socket socket=new Socket(ip,port);
			if(socket!=null) {//s�� null�� �ƴϸ�:���, null�̸�: ��žȵȰ�
				//������ �Է�,����� ���� ��Ʈ���� ����
				BufferedReader br=new BufferedReader(//��ƺ�����
						new InputStreamReader(//����Ʈ������ �Ѿ�� �����͸� ���ڿ��� �ٲپ���
								socket.getInputStream()));//����->�������� �� �����Ͱ�����
				
				//Book��ü��ü�� ������ ���� Object������ ���� stream ����
				ObjectOutputStream oos=
						new ObjectOutputStream(socket.getOutputStream()/*����->�������� ������ ��Ʈ��*/);
				//������ stream���� ����
				//���� �����͸� �����;���
				ObjectInputStream ois=
						new ObjectInputStream(
								new FileInputStream("books.dat"));
				
				oos.writeObject((ArrayList<Book>)ois.readObject());
				oos.flush();
				
//				while(true) {
//					Book b=(Book)ois.readObject();
//					oos.writeObject(b);
//				}
				//������ ���� �޼��� �о����
				String message=br.readLine();
				
				
			}
		} catch(Exception e) {
//			oos.flush();
			e.printStackTrace();
		}
	}
	
	
	public void saveFile() {
		List<Book> bookList=new ArrayList<Book>();
		bookList.add(new Book("�ڹٸ� ��ƶ�",30000));
		bookList.add(new Book("�ڹٸ� ��ƶ�",30000));
		bookList.add(new Book("�ڹٸ� ��ƶ�",30000));
		bookList.add(new Book("�ڹٸ� ��ƶ�",30000));
		bookList.add(new Book("�ڹٸ� ��ƶ�",30000));
		//bookList�� books.dat���Ͽ� �����϶�
		try(ObjectOutputStream os=
				new ObjectOutputStream(
						new FileOutputStream("books.dat"));) {
			os.writeObject(bookList);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void loadList() {
		List<Book> list=new ArrayList<Book>();
		try(ObjectInputStream ois=
				new ObjectInputStream(
						new FileInputStream("books.dat"));) {
			list=(List<Book>)ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		for(Book b:list) {
			System.out.println(b);
		}
	}
}
