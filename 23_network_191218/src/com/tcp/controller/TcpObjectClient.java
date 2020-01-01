package com.tcp.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;

public class TcpObjectClient {

	public void fileUpload() throws IOException{
		int port=8888;
		String ip="";
		ip=InetAddress.getLocalHost().getHostAddress();
		//소켓
		Socket socket=new Socket(ip,port);
		if(socket!=null) {
			//서버스트림 가져오기
			InputStream input=socket.getInputStream();
			OutputStream output=socket.getOutputStream();
			ObjectOutputStream oos=new ObjectOutputStream(output);
			
			//a.txt 파일내 데이터가 저장되어있는데 업로드하고 싶다
			ObjectInputStream ois=
					new ObjectInputStream(
							new FileInputStream("a.txt"));
			
			try {
				ArrayList list=(ArrayList)ois.readObject();				
				oos.writeObject(list);
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

	}

}
