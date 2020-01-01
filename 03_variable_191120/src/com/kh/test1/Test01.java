package com.kh.test1;

public class Test01 {
	public static void main(String[] args) {
		int i = 314;
		long l = 314L;
		float f = 3.1416297f;
		double d = 314314.141629714162915;
		char ch = '3';
		String str = "314";
		boolean b = true;
		
		
		
		System.out.print("안녕하세요"+"\n"+(123)+"\n"+i);
		System.out.println();
		System.out.print("안녕하세요"+"\n"+(123)+"\n"+i);
//		System.out.printf("%.-4d",d);
		System.out.printf("%.0A",d);
		System.out.println();
//		System.out.printf("%d",i);
		System.out.println();
		System.out.printf("%o",i);
		System.out.println();
		System.out.printf("%x",i);
		System.out.println();
		System.out.printf("%c",ch);
		System.out.println();
		System.out.printf("%s",str);
		System.out.println();
		System.out.printf("%f",f);
		System.out.println();
//		System.out.printf("%f",l);
//		System.out.printf("%e",i);
//		System.out.printf("%g",i);
//		System.out.printf("%A",i);
		System.out.printf("%b",b);
	}
}
