package com.stringtest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		//기본적인 Date클래스를 이용해서 날짜 출력
//		Date d=new Date();
//		
//		System.out.println(d);
//		d=new Date(1111196543578L);
//		System.out.println(d);
//		System.out.println();
		
		
		//Date클래스말고 Calendar객체를 이용하여 날짜출력하기
		//Calendar생성자의 접근제한자가 protected로 되어있음
		System.out.println("Calendar클래스");
		Calendar c=Calendar.getInstance();//현재날짜의 객체를 받아옴.
		System.out.println("시스템 날짜 연도 : "+c.get(Calendar.YEAR));
		//월은 0부터 시작. 0~11범위
		System.out.println("시스템 날짜 월 : "+c.get(Calendar.MONTH)+1);
		c.set(1987, (9-1), 2);
		System.out.println("나의 생일 : "+c.get(Calendar.YEAR)
				+"년 "+(c.get(Calendar.MONTH)+1)
				+"월 "+c.get(Calendar.DATE)+"일");
		System.out.println();
		//GregorianCalendar
		System.out.println("GregorianCalendar클래스");
		GregorianCalendar birth=new GregorianCalendar(1987,(9-1),2);
		System.out.println("나의 생일 : "
				+birth.get(Calendar.YEAR)+"년 "
				+(birth.get(Calendar.MONTH)+1)+"월 "
				+birth.get(Calendar.DATE)+"일");
//		System.out.println(birth);
		
		//GregorianCalendar 객체를 Date객체로 변환
		//getTimeInMillis() : long 자료형으로 반환
		Date birth2=new Date(birth.getTimeInMillis()); 
		System.out.println(birth2);
		
		//날짜를 문자형식으로 formatting해주는 클래스
		//Date를 String으로 formatting해주는 객체
//		SimpleDateFormat sdf=
//				new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf=
				new SimpleDateFormat("yyMMdd");
		//sdf의 매개변수에는 date객체만 들어갈 수 있다. 
		//Calendar와 GregorianCalendar 객체는 넣을 수 없다.
		String rand="";
		char gender='남';
		if(gender=='남') {
			rand+="-1";
		} else if(gender=='여') {
			rand+="-2";
		}
		for(int i=0; i<6; i++) {
			rand+=String.valueOf(((int)(Math.random()*10)));
		}
		String result=sdf.format(birth2)+rand;
		System.out.println("랜덤 주민등록번호 : "+result);
		
		
	}
}
