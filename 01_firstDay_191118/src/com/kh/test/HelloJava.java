package com.kh.test;

//현재클래스와 다른 패키지에 있는 클래스를 사용할 때 import를 사용
import java.util.Date;

//java.lang 패키지의 클래스들은 import하지 않아도 사용이 가능함.
import java.text.SimpleDateFormat;
import com.kh.test2.TestFunction;


public class HelloJava {
	public static void main(String[] args) {
		System.out.println("Hello world"); // System.out.println("");는 콘솔에 출력해주는 기능을 하는 메서드
		System.out.println(new Date());
		/*
		 * 다른 패키지에 있는 클래스를 호출할 때는 new 클래스명();을 사용할 수 있다.
		 * 내부에 메서드를 호출하려면 .을 사용하고 메서드 명을 작성하면 사용 가능
		 */		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss"); //SimpleDateFormat에서 월은 MM으로 표현
		System.out.println(sd.format(new Date()));		
		
		System.out.println(new String()); //java.lang 클래스는 선언 하지 않아도 에러 나지 않음. 기본 로딩.
		new TestFunction().printContent(); /* 부분 주석  */ //한줄 주석
	}
}
