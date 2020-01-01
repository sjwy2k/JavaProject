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
		//����
		Socket socket=new Socket(ip,port);
		if(socket!=null) {
			//������Ʈ�� ��������
			InputStream input=socket.getInputStream();
			OutputStream output=socket.getOutputStream();
			ObjectOutputStream oos=new ObjectOutputStream(output);
			
			//a.txt ���ϳ� �����Ͱ� ����Ǿ��ִµ� ���ε��ϰ� �ʹ�
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
