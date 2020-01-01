package com.obj.main;

public class Factorial {
	public static void main(String[] args) {
		int result=factor(5);
		System.out.print("result : "+result);
	}
	
	public static int factor(int a) {
		System.out.println("a : "+a);
		int temp;
		if(a==1) {
			temp=1;
			System.out.println("temp : "+temp);
		} else {
			temp=a*factor(a-1);
			System.out.println("temp : "+temp);
		}
		return temp;
	}

}
