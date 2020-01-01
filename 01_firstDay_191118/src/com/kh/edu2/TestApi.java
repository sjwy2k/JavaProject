package com.kh.edu2;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestApi {
	public static void main(String[] args) {
		System.out.println("3번 과제");
		System.out.println(new Date());		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss"); //SimpleDateFormat에서 월은 MM으로 표현
		System.out.println(sd.format(new Date()));
	}
}
