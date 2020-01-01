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
		//1. ���� ��Ʈ, ����ip �ּҸ� Ȯ��
		int port=8888;
		String ip="192.168.149.1";//ip�ּ�
//		String ip="192.168.20.233";//ip�ּ�
		ip=InetAddress.getLocalHost().getHostAddress();//����ip��ȯ
		BufferedReader br=null;
		PrintWriter pw=null;
//		ObjectOutputStream oos=null;
		Socket socket=null;
		try {
			socket=new Socket(ip,port);
			//Server�� accept()�޼��� �����
			if(socket!=null) { 
				//�������� �������� ��Ʈ��
				InputStream input=socket.getInputStream();
				//������ ������ ��Ʈ��
				OutputStream output=socket.getOutputStream();
				
				//������Ʈ��
				br=new BufferedReader(new InputStreamReader(input));
				pw=new PrintWriter(output);
//				oos=new ObjectOutputStream(output);
//				oos.writeObject(new ArrayList());//������Ʈ�� Object
				
				//������ �޼��� ������
				Scanner sc=new Scanner(System.in);
				
				do {
					System.out.print("��ȭ�Է� : ");
					String message=sc.nextLine();
					pw.println(message);
					pw.flush();
					if(message.equals("exit")) {
						System.out.println("���α׷��� �����մϴ�.");
						break;
					}
					//������ ���� ������ ���
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
