package com.buffer.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedTest {

	public static void main(String[] args) {
		
	}
	
	public void bufferedReader() throws IOException{
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print("입력하세요");
		String msg=br.readLine();
		System.out.println(msg);
		br.close();
		
		
	}
}
