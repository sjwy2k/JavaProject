package com.tcp.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpObjectServer {

	public static void main(String[] args) throws IOException{
		int port=8888;
		ServerSocket server=new ServerSocket(port);
		
		while(true) {
			Socket client=server.accept();
			
			InputStream input=client.getInputStream();
			OutputStream output=client.getOutputStream();
			
			BufferedReader br=
					new BufferedReader(
							new InputStreamReader(input));
			
			PrintWriter clientOut=new PrintWriter(output);
			while(true) {
				String msg=br.readLine();
				if(!msg.equals("exit")) {
					System.out.println(
							client.getInetAddress().getHostAddress()
							+"가 보낸 메세지 : "+msg);
					clientOut.println("서버 : 메세지 전송 성공!");
					clientOut.flush();
				} else {
					System.out.println("접속종료");
					break;
				}
			}
			
			br.close();
			clientOut.close();
			client.close();
		}
	}

}
