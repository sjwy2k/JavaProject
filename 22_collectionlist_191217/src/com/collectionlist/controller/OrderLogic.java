package com.collectionlist.controller;

import java.util.Comparator;

public class OrderLogic implements Comparator<Integer> { //generic

	@Override
	public int compare(Integer su1, Integer su2) {
		/**��������*/
		//��ȯ�Ǵ� ������ ���, ����, 0���� ��ȯ
		//1, -1, 0
		//0�� ����! ���(1)ũ��! ����(-1)�۴�!
//		if(su1>su2) {//su1�� su2���� ũ��(��>��) -1
//			return -1;
//		} else if(su1<su2) {//su1�� su2���� ������(��<��) 1
//			return 1;
//		} else { //���� ����
//			return 0;
//		}
		/**����� ���� �������� - ����*/
		if(su1>su2) {//su1�� su2���� ũ��(��>��) -1
			return 1; //����� ���� �ٲ۴�
		} else if(su1<su2) {//su1�� su2���� ������(��<��) 1
			return -1; //������ ���� �ٲ��� �ʴ´�
		} else { //���� ����
			return 0;
		}
		
		
	}
}
