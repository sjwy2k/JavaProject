package com.stringtest;

import java.util.StringTokenizer;

public class StringTokenClass {

	public static void main(String[] args) {
		//name.split(",")
		String name="java,c_c++_oracle,jdbc,html,css,javascript";
		
		//구분자 ,로 구분되는 트레이를 만든다
		StringTokenizer st=
				new StringTokenizer
				(/*문구name*/name, /*구분자 ','*/",_");
		//구분자를 여러개 넣을 수도 있다. 한꺼번에 구분자 선언.
		
		//메서드를 이용해서만 접근할 수 있다.
		//hasMoreToken(), nextToken()
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
			System.out.println(temp +" : 난 "+temp+"를 정복");
		}
		
		//Token을 찍으면 그 자료는 날아감. 활용하려면 변수선언해서 받아야한다.
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());//7번째, 자료가 없다
		
		
		//배열을 문자열로 변경해주는 기능 String join() 메서드
		String[] hobby= {"운동","독서","방탈출"};
		String strHobby=String.join(", ", hobby); //hobby배열을 문자열로
		//join(구분자, 불러들일 배열)
		System.out.println(strHobby);
		
		//StringTokenizer로 문자열을 배열로 변경
		//혹은 배열을 String문자열로 바꿀 수 있다
		
	}
}
