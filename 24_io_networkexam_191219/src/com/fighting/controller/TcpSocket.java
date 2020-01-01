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
		//1. 포트, ip를 알아야
		int port=3000;
		String ip="192.168.20.34";
		try {
			//서버통신을위한소켓생성
			Socket socket=new Socket(ip,port);
			if(socket!=null) {//s가 null이 아니면:통신, null이면: 통신안된것
				//서버와 입력,출력을 위한 스트림을 생성
				BufferedReader br=new BufferedReader(//모아보내기
						new InputStreamReader(//바이트단위로 넘어온 데이터를 문자열로 바꾸어줌
								socket.getInputStream()));//서버->소켓으로 온 데이터가담긴다
				
				//Book객체자체를 보내기 위해 Object전송을 위한 stream 생성
				ObjectOutputStream oos=
						new ObjectOutputStream(socket.getOutputStream()/*소켓->서버에게 보내는 스트림*/);
				//서버와 stream연결 종료
				//보낼 데이터를 가져와야함
				ObjectInputStream ois=
						new ObjectInputStream(
								new FileInputStream("books.dat"));
				
				oos.writeObject((ArrayList<Book>)ois.readObject());
				oos.flush();
				
//				while(true) {
//					Book b=(Book)ois.readObject();
//					oos.writeObject(b);
//				}
				//서버가 보낸 메세지 읽어오기
				String message=br.readLine();
				
				
			}
		} catch(Exception e) {
//			oos.flush();
			e.printStackTrace();
		}
	}
	
	
	public void saveFile() {
		List<Book> bookList=new ArrayList<Book>();
		bookList.add(new Book("자바를 잡아라",30000));
		bookList.add(new Book("자바를 잡아라",30000));
		bookList.add(new Book("자바를 잡아라",30000));
		bookList.add(new Book("자바를 잡아라",30000));
		bookList.add(new Book("자바를 잡아라",30000));
		//bookList를 books.dat파일에 저장하라
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
