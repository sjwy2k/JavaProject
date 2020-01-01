package com.tcp.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	
	//TCP통신을 위한 서버구축
	public static void main(String[] args) throws IOException {
		//1. 포트를 설정한다
		int port=8888;
		//2. 서버소켓 객체를 생성
		ServerSocket server=new ServerSocket(port);
		//3. 클라이언트가 접속하길 기다린다(요청을 기다린다)
		while(true) {
			//Client요청이 오면 받음
			Socket client=server.accept();//client 요청 수락

			//요청시 client가 보낸 데이터를 확인하고(입력, input)
			//서비스해야하는 정보를 client에서 보내줌(출력, output)
			InputStream input=client.getInputStream();
			OutputStream output=client.getOutputStream();

			//원하는 보조스트림을 연결 - 성능 향상을 위해
			//한 번에 모아서 보내기 위해
			//문자열을 처리하기 위한 Stream
			BufferedReader br=
					new BufferedReader(
							new InputStreamReader(input));
			

			//모니터 출력을 위해
			//bufferedwriter 써도됨
			PrintWriter clientOut=new PrintWriter(output);
			
			//client가 보낸 내용을 읽기
			while(true) {
				//br에서 보낸 문자열을 읽어들인다
				String message=br.readLine();
				//exit메세지가 없으면 읽어들이고, 다 읽었으면 종료한다
				if(!message.equals("exit")) {
					System.out.println(
						client.getInetAddress().getHostAddress()
						+"가 보낸 메세지 : "+message);
					clientOut.println("서버 : 메세지 전송 성공!");
					clientOut.flush();//버퍼 비움
				} else {
					System.out.println("접속종료");
					break;
				}
			}
			
			//열린 Stream 닫아주기
			br.close();
			clientOut.close();
			client.close();
			
			
		}
		
	}
}
