package com.collectionlist.controller;

import java.util.Comparator;

public class OrderStringLogic implements Comparator<String> {

	//Comparator 인터페이스를 구현할 경우 사용자 정의 정렬을 할 수 있다.
	//implement Comparator<String> 
	
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);//내림차순정렬
		//o2, o1 순서
	}

}
