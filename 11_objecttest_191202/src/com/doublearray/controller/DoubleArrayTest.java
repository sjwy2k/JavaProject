package com.doublearray.controller;

import java.util.Scanner;

public class DoubleArrayTest {

	//하루식단 가변배열
	public void ex06() {
		 Scanner sc=new Scanner(System.in);
		 String breakfast="", lunch="", dinner="";
		 
		 System.out.print("아침 메뉴 : ");
		 breakfast=sc.nextLine();
		 System.out.print("점심 메뉴 : ");
		 lunch=sc.nextLine();
		 System.out.print("저녁 메뉴 : ");
		 dinner=sc.nextLine();
		 
		 
		 
		 //입력
		 String[][] menu=new String[3][];
		 String[] menu1=breakfast.split("\\n");
		 String[] menu2=lunch.split("\\n");
		 String[] menu3=dinner.split("\\n");
		 
		 for(int i=0; i<menu1.length; i++) {
			 System.out.println(menu[i]);
		 }
//		 int count=0;
//		 for(int i=0; i<menu.length; i++) {
//			 for(int j=0; j<menu[i].length; j++) {
//				 menu[i][j]=menu1[j];
//			 }
//		 }
		 

	}
	//좋아하는색깔 가변배열
	public void ex07() {
		// TODO Auto-generated method stub
		
	}

}
