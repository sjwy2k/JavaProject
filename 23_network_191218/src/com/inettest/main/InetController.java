package com.inettest.main;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetController {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet=InetAddress.getLocalHost();
		System.out.println(inet);
		InetAddress naver=InetAddress.getByName("www.naver.com");
		System.out.println(naver);
		System.out.println(naver.getHostAddress());
		InetAddress goo=InetAddress.getByName("www.google.com");
		System.out.println(goo);
		System.out.println(goo.getHostAddress());
	}
	
	
	
}
