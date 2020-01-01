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
	
	//TCP����� ���� ��������
	public static void main(String[] args) throws IOException {
		//1. ��Ʈ�� �����Ѵ�
		int port=8888;
		//2. �������� ��ü�� ����
		ServerSocket server=new ServerSocket(port);
		//3. Ŭ���̾�Ʈ�� �����ϱ� ��ٸ���(��û�� ��ٸ���)
		while(true) {
			//Client��û�� ���� ����
			Socket client=server.accept();//client ��û ����

			//��û�� client�� ���� �����͸� Ȯ���ϰ�(�Է�, input)
			//�����ؾ��ϴ� ������ client���� ������(���, output)
			InputStream input=client.getInputStream();
			OutputStream output=client.getOutputStream();

			//���ϴ� ������Ʈ���� ���� - ���� ����� ����
			//�� ���� ��Ƽ� ������ ����
			//���ڿ��� ó���ϱ� ���� Stream
			BufferedReader br=
					new BufferedReader(
							new InputStreamReader(input));
			

			//����� ����� ����
			//bufferedwriter �ᵵ��
			PrintWriter clientOut=new PrintWriter(output);
			
			//client�� ���� ������ �б�
			while(true) {
				//br���� ���� ���ڿ��� �о���δ�
				String message=br.readLine();
				//exit�޼����� ������ �о���̰�, �� �о����� �����Ѵ�
				if(!message.equals("exit")) {
					System.out.println(
						client.getInetAddress().getHostAddress()
						+"�� ���� �޼��� : "+message);
					clientOut.println("���� : �޼��� ���� ����!");
					clientOut.flush();//���� ���
				} else {
					System.out.println("��������");
					break;
				}
			}
			
			//���� Stream �ݾ��ֱ�
			br.close();
			clientOut.close();
			client.close();
			
			
		}
		
	}
}
