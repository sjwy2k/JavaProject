package com.collectionlist.controller;

import java.util.Comparator;

public class OrderLogic implements Comparator<Integer> { //generic

	@Override
	public int compare(Integer su1, Integer su2) {
		/**오름차순*/
		//반환되는 정수는 양수, 음수, 0으로 반환
		//1, -1, 0
		//0은 같다! 양수(1)크다! 음수(-1)작다!
//		if(su1>su2) {//su1이 su2보다 크면(앞>뒤) -1
//			return -1;
//		} else if(su1<su2) {//su1이 su2보다 작으면(앞<뒤) 1
//			return 1;
//		} else { //값이 같다
//			return 0;
//		}
		/**사용자 정의 내림차순 - 숫자*/
		if(su1>su2) {//su1이 su2보다 크면(앞>뒤) -1
			return 1; //양수일 때는 바꾼다
		} else if(su1<su2) {//su1이 su2보다 작으면(앞<뒤) 1
			return -1; //음수일 때는 바꾸지 않는다
		} else { //값이 같다
			return 0;
		}
		
		
	}
}
