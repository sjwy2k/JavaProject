package com.stringtest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		//�⺻���� DateŬ������ �̿��ؼ� ��¥ ���
//		Date d=new Date();
//		
//		System.out.println(d);
//		d=new Date(1111196543578L);
//		System.out.println(d);
//		System.out.println();
		
		
		//DateŬ�������� Calendar��ü�� �̿��Ͽ� ��¥����ϱ�
		//Calendar�������� ���������ڰ� protected�� �Ǿ�����
		System.out.println("CalendarŬ����");
		Calendar c=Calendar.getInstance();//���糯¥�� ��ü�� �޾ƿ�.
		System.out.println("�ý��� ��¥ ���� : "+c.get(Calendar.YEAR));
		//���� 0���� ����. 0~11����
		System.out.println("�ý��� ��¥ �� : "+c.get(Calendar.MONTH)+1);
		c.set(1987, (9-1), 2);
		System.out.println("���� ���� : "+c.get(Calendar.YEAR)
				+"�� "+(c.get(Calendar.MONTH)+1)
				+"�� "+c.get(Calendar.DATE)+"��");
		System.out.println();
		//GregorianCalendar
		System.out.println("GregorianCalendarŬ����");
		GregorianCalendar birth=new GregorianCalendar(1987,(9-1),2);
		System.out.println("���� ���� : "
				+birth.get(Calendar.YEAR)+"�� "
				+(birth.get(Calendar.MONTH)+1)+"�� "
				+birth.get(Calendar.DATE)+"��");
//		System.out.println(birth);
		
		//GregorianCalendar ��ü�� Date��ü�� ��ȯ
		//getTimeInMillis() : long �ڷ������� ��ȯ
		Date birth2=new Date(birth.getTimeInMillis()); 
		System.out.println(birth2);
		
		//��¥�� ������������ formatting���ִ� Ŭ����
		//Date�� String���� formatting���ִ� ��ü
//		SimpleDateFormat sdf=
//				new SimpleDateFormat("yyyy�� MM�� dd��");
		SimpleDateFormat sdf=
				new SimpleDateFormat("yyMMdd");
		//sdf�� �Ű��������� date��ü�� �� �� �ִ�. 
		//Calendar�� GregorianCalendar ��ü�� ���� �� ����.
		String rand="";
		char gender='��';
		if(gender=='��') {
			rand+="-1";
		} else if(gender=='��') {
			rand+="-2";
		}
		for(int i=0; i<6; i++) {
			rand+=String.valueOf(((int)(Math.random()*10)));
		}
		String result=sdf.format(birth2)+rand;
		System.out.println("���� �ֹε�Ϲ�ȣ : "+result);
		
		
	}
}
