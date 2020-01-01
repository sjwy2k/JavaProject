package com.generictest.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.generictest.model.vo.Student;

public class GenericTest {

	public static void main(String[] args) {
		//���׸��� �̿��ϸ� �÷��ǿ� ������ �� �ִ�
		//�����͸� ������ �� ����
		List list=new ArrayList();
		list.add(new Date());
		list.add("������");
		list.add(new Student("������", 19, 3, 3, "010"));
		Student s=(Student)list.get(2);//list.get(index) ���� ����ȯ �ؾ� �ȴ�
		s.getName();
		//���׸��� �����ϸ� ���ϴ� �ڷ������� ���� - Student��ü
		List<Student> genericList=new ArrayList();
//		genericList.add("������");//���ԺҰ�
		//��
		genericList.add(new Student("�����",33,3,3,"010"));
		Student s1=genericList.get(0);//����ȯ ���ص� �ȴ�
		System.out.println(genericList.get(0).getName());
		
		
		
		//map������ generic �����ϱ�
		Map map=new HashMap();
		map.put(1, "������");
		map.put("����", new Student("������",19,3,3,"12314"));
		System.out.println("");
		System.out.println("key�� �´� value �޾ƿ���!generic ������� ����������?");
		Set keys=map.keySet(); //set�� generic�̾����Ƿ� object��ȯ
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			Object obj=map.get(it.next());
			if(obj instanceof Student) {
				Student ss=(Student)obj;
				System.out.println(ss.getName());//�ٷ� ���� ����
				System.out.println(ss.getAge());
				System.out.println(ss.getGrade());
				System.out.println(ss.getBan());
				System.out.println(ss.getPhoneNum());
				System.out.println(ss);
			}
		}
		
		
		//map�� ���׸��� �����Ͽ� �ڷ����� ����/�����ϸ�
		Map<String, Student> gMap=new HashMap();//���׸����� ����� gMap
		//key���� String�̰�, value�� Student�� ���� �� �� �ִ� 
		//gMap.put(1, "������");//���ԺҰ�1 - key��,value��x
		//gMap.put("1", "haha");//���ԺҰ�2 - value��x
		//gMap.put(1,new Student());//���ԺҰ�3 - key��x
		gMap.put("1",new Student("������",19,3,3,"010"));//���԰���
		//set�� generic�� �����Ƿ� String��ȯ
		//Ȯ��Ǿ� �����Ƿ� ��üȭ���Ѽ� �־��(Object �޾���)
		System.out.println("");
		System.out.println("key�� �´� value �޾ƿ���!Set+Generic");
		Set<String> gKeys=gMap.keySet();//Object
		Iterator<String> it2=gKeys.iterator();
		while(it2.hasNext()) {
			String key=it2.next();
			System.out.println(gMap.get(key).getName());//�ٷ� ���� ����
			System.out.println(gMap.get(key).getAge());
			System.out.println(gMap.get(key).getGrade());
			System.out.println(gMap.get(key).getBan());
			System.out.println(gMap.get(key).getPhoneNum());
			System.out.println(gMap.get(key));
		}
		System.out.println("");
		System.out.println("key�� value�� ���ÿ� �޾ƿ��� ��! - Set+Generic+entrySet");
		//key�� value�� ���ÿ� �޾ƿ��� ��!
		Set<Map.Entry<String,Student>> kv=gMap.entrySet();
		Iterator<Map.Entry<String, Student>> itkv=kv.iterator();
		while(itkv.hasNext()) {
			Map.Entry<String, Student> entry=itkv.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName());
			System.out.println(entry.getValue().getAge());
			System.out.println(entry.getValue().getGrade());
			System.out.println(entry.getValue().getBan());
			System.out.println(entry.getValue().getPhoneNum());
			System.out.println(entry.getValue());
			
		}
	}
}
