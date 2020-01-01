package com.array.controller;

import java.util.Scanner;

//import java.util.Scanner;

public class ArrayController {


	public void arrayTest() {
//		int[] nums= {5,4,76,8,10,11,24,56};
//		//nums에 10 이하 값은 저장하지 못하게 하고 싶을때
//		for(int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//			if(nums[i]<=10) {
//				boolean flag=false;
//				do {
//					Scanner sc = new Scanner(System.in);
//					System.out.println("10보다 큰 수를 입력하세요");
//					System.out.print("입력 : ");
//					nums[i]=sc.nextInt();
//					if(nums[i]>9) flag=true;
//				}while(!flag);
//			}
//		}
//		for(int i=0; i<nums.length; i++) {
//			System.out.print(nums[i]+" ");
//		}
		
		
	}
	
	public void arrayCopy() {
		//얕은 복사하기
		//얕은복사는 heap영역에 생성된 주소만복사를해주는것
		//즉heap영역에 생성된 배열 공간을 공유한다고 보면 됨
		char[] ch= {'a', 'b', 'c', 'd'};
		char[] ch2=ch;
		System.out.print("ch배열 출력 : ");
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println("ch주소값 : "+ch.hashCode());
		System.out.println();
		
		System.out.println("ch2배열 생성(참조 주소 복사, 동일데이터 공유)");
		System.out.print("ch2배열 출력 : ");
		for(int i=0; i<ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		System.out.println();
		System.out.println("ch2주소값 : "+ch2.hashCode());
		
		System.out.println();
		System.out.println("ch3배열 생성(ch을 System.arraycopy)");
		System.out.print("ch3배열 출력 : ");		
		char[] ch3=new char[ch.length];
		System.arraycopy(ch, 0, ch3, 0, ch.length);
		for(int i=0; i<ch3.length; i++) {
			System.out.print(ch3[i]);
		}
		System.out.println();
		System.out.println("ch3주소값 : "+ch3.hashCode());
		System.out.println();
		System.out.println("ch3 0번인덱스 값 수정 ch3[0]='A'");
		ch3[0]='A';

		System.out.print("ch배열 출력 : ");
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		System.out.print("ch3배열 출력 : ");
		for(int i=0; i<ch3.length; i++) {
			System.out.print(ch3[i]);
		}
		System.out.println();
		System.out.println();		
		System.out.println("ch4배열 생성 ch.clone()");
		char[] ch4 = ch.clone();
		
		System.out.print("ch4배열 출력 : ");
		for(int i=0; i<ch4.length; i++) {
			System.out.print(ch4[i]);
		}
		System.out.println();
		System.out.println("ch4주소값 : "+ch4.hashCode());
		System.out.println();
		
		System.out.println("ch4 0번인덱스 값 수정 ch4[0]='A'");
		ch4[0]='A';
		
		System.out.print("ch배열 출력 : ");
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		System.out.print("ch4배열 출력 : ");
		for(int i=0; i<ch4.length; i++) {
			System.out.print(ch4[i]);
		}
		System.out.println();
	}
	
	public void deepCopy() {
		//깊은 복사는 heap영역에 있는 배열을 공유하지 않고
		//별도의 배열을 생성하여 데이터를 복사하는 것
		
		String[] names= {"박덕현", "이규민", "박민규"};
		String[] copyName=new String[3]; //null로 초기화
		//1. for문을 이용한 복사
		for(int i=0; i<names.length; i++) {
			copyName[i]=names[i];
		}
		System.out.print("names 배열	: ");		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		System.out.print("copyName 배열	: ");
		for(int i=0; i<copyName.length; i++) {
			System.out.print(copyName[i]+" ");
		}
		System.out.println();
		System.out.print("names주소값	: "+names.hashCode()+"\n");
		System.out.print("copyName주소값	: "+copyName.hashCode()+"\n");
		System.out.println();
		System.out.println("copyName[2] 값 변경");
		copyName[2]="유병승";
		System.out.print("names 배열	: ");
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		System.out.print("copyName 배열	: ");
		for(int i=0; i<copyName.length; i++) {
			System.out.print(copyName[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		//System.arraycopy()
		//arraycopy 메서드 이용(a,b,c,d,e)
		//매개변수 ? () 안에 들어가는 값을 의미
		//a는 복사가 될 배열(원본)
		//b 복사가 될 배열의 복사시작위치
		//c 복사될 위치배열
		//d 복사될 위치배열의 시작위치
		//e 복사할 데이터갯수
		String[] copyName2 = new String[names.length];
		System.out.println("System.arraycopy() 사용");
		System.arraycopy(names, 1, copyName2, 0, 2);
		System.out.print("names 배열	: ");
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		System.out.print("copyName2 배열	: ");
		for(int i=0; i<copyName2.length; i++) {
			System.out.print(copyName2[i]+" ");
		}
		
		
		
	}

	public void searchChar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String text=sc.nextLine();
		
		char[] chars=new char[text.length()];
		System.out.print("찾을 문자 입력 : ");
		char searchChar=sc.next().charAt(0);
		
		for(int i=0; i<text.length(); i++) {
			chars[i]=text.charAt(i);
		}
		
		int count=0;
		for(int i=0; i<chars.length; i++) {
			if(searchChar==chars[i]) {
				count++;
			}
		}
		System.out.println(searchChar+"의 개수="+count);
		
//		for(int i=0; i>text.length(); i++) {
//			if(text.charAt(0)==searchChar) {
//				count++;
//			}
//		}
		
		
	}
	
	
}
