package com.stringtest;

import java.util.StringTokenizer;

public class StringTokenClass {

	public static void main(String[] args) {
		//name.split(",")
		String name="java,c_c++_oracle,jdbc,html,css,javascript";
		
		//������ ,�� ���еǴ� Ʈ���̸� �����
		StringTokenizer st=
				new StringTokenizer
				(/*����name*/name, /*������ ','*/",_");
		//�����ڸ� ������ ���� ���� �ִ�. �Ѳ����� ������ ����.
		
		//�޼��带 �̿��ؼ��� ������ �� �ִ�.
		//hasMoreToken(), nextToken()
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
			System.out.println(temp +" : �� "+temp+"�� ����");
		}
		
		//Token�� ������ �� �ڷ�� ���ư�. Ȱ���Ϸ��� ���������ؼ� �޾ƾ��Ѵ�.
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());//7��°, �ڷᰡ ����
		
		
		//�迭�� ���ڿ��� �������ִ� ��� String join() �޼���
		String[] hobby= {"�","����","��Ż��"};
		String strHobby=String.join(", ", hobby); //hobby�迭�� ���ڿ���
		//join(������, �ҷ����� �迭)
		System.out.println(strHobby);
		
		//StringTokenizer�� ���ڿ��� �迭�� ����
		//Ȥ�� �迭�� String���ڿ��� �ٲ� �� �ִ�
		
	}
}
