package com.tcp.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class TcpClient {

	public static void main(String[] args) throws IOException {
		//1. 서버 포트, 서버ip 주소를 확인
		int port=8888;
		String ip="192.168.149.1";//ip주소
//		String ip="192.168.20.233";//ip주소
		ip=InetAddress.getLocalHost().getHostAddress();//로컬ip반환
		BufferedReader br=null;
		PrintWriter pw=null;
//		ObjectOutputStream oos=null;
		Socket socket=null;
		try {
			socket=new Socket(ip,port);
			//Server가 accept()메서드 실행시
			if(socket!=null) { 
				//서버에서 가져오는 스트림
				InputStream input=socket.getInputStream();
				//서버로 보내는 스트림
				OutputStream output=socket.getOutputStream();
				
				//보조스트림
				br=new BufferedReader(new InputStreamReader(input));
				pw=new PrintWriter(output);
//				oos=new ObjectOutputStream(output);
//				oos.writeObject(new ArrayList());//보조스트림 Object
				
				//서버에 메세지 보내기
				Scanner sc=new Scanner(System.in);
				
				do {
					System.out.print("대화입력 : ");
					String message=sc.nextLine();
					pw.println(message);
					pw.flush();
					if(message.equals("exit")) {
						System.out.println("프로그램을 종료합니다.");
						break;
					}
					//서버가 보낸 데이터 출력
					System.out.println(br.readLine());
				}while(true);
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			socket.close();
		}
	}
}
