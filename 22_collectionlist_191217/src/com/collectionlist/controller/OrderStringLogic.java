package com.collectionlist.controller;

import java.util.Comparator;

public class OrderStringLogic implements Comparator<String> {

	//Comparator �������̽��� ������ ��� ����� ���� ������ �� �� �ִ�.
	//implement Comparator<String> 
	
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);//������������
		//o2, o1 ����
	}

}
