package com.collectionlist.controller;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.collectionlist.model.vo.GradePoint;
import com.collectionlist.model.vo.Student;

public class CollectionController {

	//List�� ���� �˾ƺ���
	//ArrayList, LinkedList, Vector
	//ArrayList�� �迭�� �ſ� ���.
	//index, ����, ����
	public void listTest() {
		//new �����ڷ� ����
		ArrayList list=new ArrayList();
		//��ü�� ������ �� �ִ� ������� 10�� ����!
		//==Object[] obj=new Object[10];
		
		System.out.println(list.size());
		//�⺻ ���������� 10������
		//size() �޼���� ���� ��ü�� ���ԵǾ��ִ� ���� ��Ÿ��.
		//ArrayList�� ��ü�� �߰��غ���. add()�޼��带 �̿�		
		list.add("�̽¿�");//String��ü
		System.out.println(list.size()); //0�� index�� ���� ��
		//ArrayList���� ��ü�� ������ ����!
		//�⺻�ڷ�����??������???
/***/	list.add(1);//��? auto-boxing�� ���� ��üȭ�Ǳ� ������!
		//ArrayList���� �پ��� �ڷ����� ������ ����
		list.add(180.5);//double, autoboxing
		list.add(new Date());//Date��ü
		list.add(new Student("������",19,3,3,null));//Student��ü
		//ArrayList�� �����͸� ����غ���
		//��ü�� ������ ��ü �ִ� �����ʹ� getter�� ���
		//get(index)�޼��带 �̿��� ���
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		//�迭�� �����ϰ� for������ ����� ����
		System.out.println("====for�� �̿��Ͽ� ����ϱ�====");
		//ArrayList�� ���̴� length�� �ƴ� size()
		for(int i=0; i<list.size(); i++) {//**//
			System.out.println(list.get(i));
		}
		
		//�Ϲ������� add(value)�޼��带 �̿��ϸ�
		//list�� �� �ڿ� �߰���.
		//�߰��� �����ϰ� ������ �����ϰ� ���� ��ġ�� index�� ���
		//add(index,value)
		list.add(1,"����");
		System.out.println();
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		System.out.println();
		
		//���� Object�ڷ������� ���Ե�.
		//Object�� ��� ��ü�� ���� �� �ִ�. �ֻ��� ��ü.
		//toString�� Override���� ������ ��ü�� �ּҰ��� ��µ�.
		for(Object obj:list) {
			if(obj instanceof Student) { //�ش� ��ü�� �ڷ��������� 
				Student s=(Student)obj;
				String str=s.getName()+s.getGrade()+s.getAge();
				System.out.println(str);
			} else {
				System.out.println(obj);
			}
		}
		//list�� �ִ� ���� �����Ҷ�..
		//set() �޼��带 �̿�
		//set(index,value)
/***/	list.set(0, "������");
		list.set(1, new Student("����ȣ", 22, 3, 1, null));//Student��ü�� 2������
//		list.set(list.size()-1, new Student("����ȣ", 22, 3, 1, null));
		
		System.out.println();
		System.out.println();
		printList(list);
		System.out.println();
		System.out.println();
		//ArrayList�� �����͸� �����ϰ� �ִ��� Ȯ���ϰ� ������
		//isEmpty()�޼��带 �̿��Ͽ� Ȯ��
		//�����Ͱ� ������ T ������ F
		System.out.println(list.isEmpty());
		//list�� �����Ͱ� ������ �����. ������ ������� ��
/***/	if(!list.isEmpty()) { 
		//������ F�� ����. if�� T�ϰ�� ����
		}
/***/	if(list.size()>0) { 
		//list�� ũ�Ⱑ 0���� ũ�� �����
		}
		System.out.println();
		System.out.println();
		
		//list�� ���� ���ϴ� �����Ͱ� �ִ��� ��ȸ
		//contains() �޼��带 �̿�
		
		list=new ArrayList();//�ʱ�ȭ
		list.add("������");
		list.add("����ȣ");
		list.add("������");
		list.add("������");
		list.add("���Ѹ�");
		System.out.println(list.contains("������"));
		System.out.println(list.contains("�̼���"));
		
		
		list=new ArrayList();
		list.add(new Student("����ȣ", 22, 3, 1, null));
		list.add(new Student("������", 24, 3, 1, null));
		list.add(new Student("������", 26, 3, 1, null));
		list.add(new Student("���Ѹ�", 24, 3, 1, null));
		
		//����� ��-equals(), hashcode() �޼����� overriding�� �ʿ��ϴ�.
		//contains�޼��� �����δ� ������ ����� ���� �� ����.
		//overriding �Ŀ� �� ��������
		
		System.out.println("����ȣ �ִ�? -> "+list.contains(new Student("����ȣ", 22, 3, 1, null)));
		System.out.println("���Ѹ� �ִ�? -> "+list.contains(new Student("���Ѹ�", 24, 3, 1, null)));
		
		
		//list�� �ִ� �����͸� ����
		printList(list);
		//list���� �����͸� ������ ���� 
		//remove(index) �޼��� �̿�
/***/	list.remove(0);//0�� index�� ��ü�� ������.
		System.out.println("====������ ������====");
		printList(list);
/***/	list.remove(new Student("���Ѹ�", 24, 3, 1, null));
		System.out.println("====object ������ ������====");
		printList(list);
		
		
		//list���� ��ü ����� ������
/***/	list.clear();
		printList(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());

	}
	
	public void printList(ArrayList list) {
		for(int i=0; i<list.size(); i++) {
///***/		System.out.print(list.get(i)+" ");
/***/		System.out.println(list.get(i));
		}
	}
	
	public void listOrder() {
		//List�� ������ �ֱ� ������ ������ ����
		ArrayList list=new ArrayList(10);
//		for(int i=0; i<10; i++) {
//			list.add((int)(Math.random()*20));//0~19
//		}
//		System.out.println("��������");
		Collections.sort(list);//�������� ����
//		printList(list);
//		System.out.println();
		//��������
//		System.out.println("����� ���� ����(���������� ����)");
//		Collections.sort(list, new OrderLogic());//�������� ����
//		Collections.sort(list,
//				(i,j)->((Integer)i-(Integer)j));
//		printList(list);
		
		System.out.println("====���ڿ�����====");
		//���ڿ� ����
		System.out.println("====��������====");
		list.clear();
		list.add("������");
		list.add("�����");
		list.add("������");
		list.add("����ȣ");
		list.add("������");
		
		Collections.sort(list);//���ڿ� ����????-��������
		printList(list); //�Էµ� ��� ���
		System.out.println();
		System.out.println("====��������====");
		//���ڿ��� ������������ �Ϸ���??
		//Collections.sort(list, new OrderStringLogic());//���ڿ� ����????
		//���ٽ� Ȱ�� �������� ����
		Collections.sort(list,
				(i,j)->((String)j).compareTo((String)i)); //���ٽ�
		printList(list); //�Էµ� ��� ���
		
		
		
		/**���� �׽�Ʈ */
		//���ٽ� 1ȸ�� Ŭ����(�޼���)
		//lamTest(
//		new LambdaTest() {
//			public void test(int a, int b) {
//				System.out.println("���ٽ���");
//				System.out.print(a+"+"+b+"=");
//				System.out.print(a+b);
//			}
//		});
//		lamTest((a,b)->{
//				System.out.println("���ٽ���");
//				System.out.print(a+"+"+b+"=");
//				System.out.print(a+b);
//				});
//		
	}
//
//	//�����׽�Ʈ�Ѱ�! �𸣸�...���߿� �ٽ��ѹ� ����!	
//	public void lamTest(LambdaTest a) {
//		System.out.println("���� �׽�Ʈ�ϱ�");
//		a.test(100, 200);
//	}

	public void linkedList() {
		//LinkedList
		LinkedList llist=new LinkedList();
		llist.add("������");
		llist.add("����ȣ");
		llist.add("������");
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		
		System.out.println();
		llist.add(1, "���Ѹ�");
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		System.out.println();
		llist.set(0, "������");
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		System.out.println(llist.getFirst());//linkedlist�� ó����
		System.out.println(llist.getLast());//linkedlist�� ����
		
		//LinkedList�� ArrayList�� ��ȯ, �ݴ뵵 ����
		ArrayList list=new ArrayList(llist);
		List l=new ArrayList();//�������� ���� �ڽİ�ü�� �޴°�
		l=new LinkedList();
	}
	
	public void setTest() {
		//Set��ü�� �����ϴ� collection�� �ϳ���
		//������ ����, �ߺ������� ���� �ʴ´�
		//������ ����, ��ü�� �����ϴ� ���� ���� ������
		//Set�� ���� ����� �� Iterator��ü�� �̿�
		//�� ���� �����Ͽ� ���
		//Set���� hashSet, treeSet�� �̿�		
		HashSet hset=new HashSet();
		//���� �������� list�� ������ add()�޼���
		hset.add("������");
		hset.add("������");
		hset.add("������");
		hset.add("������");
		hset.add("������");
		hset.add("�����");
		hset.add("�ڴ���");
		hset.add("�ڴ���");
		hset.add("�ڴ���");
		hset.add("�ڴ���");
		hset.add("�ڴ���");
		hset.add("�ڴ���");
		//Set�� �ִ� ���� �̿� - Iterator
		hset.add(new Student("������",19,3,2,null));
		hset.add(new Student("�̽¿�",29,3,2,null));
		hset.add(new Student("������",30,3,2,null));
		hset.add(new Student("������",19,3,2,null));
		Iterator it=hset.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//ArrayList�ִ� �ߺ��� �����ϱ�
		System.out.println();
		System.out.println("�ߺ��� ���� ��");
		ArrayList list=new ArrayList();
		list.add(new Student("������",19,3,2,null));
		list.add(new Student("�̽¿�",29,3,2,null));
		list.add(new Student("������",30,3,2,null));
		list.add(new Student("������",19,3,2,null));
		printList(list);
		
		//�ߺ����� �����غ���
		System.out.println();
		hset=new HashSet(list);
		list=new ArrayList(hset);
		System.out.println("�ߺ��� ���� ��");
		printList(list);
		
		
		System.out.println();
		System.out.println("����ϴ� �� �ٸ� ���");
		System.out.println("set�� for-each�� ���");
		//��ü��� - obj
		for(Object obj:hset) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("Set Collection���� ���� �޼��� remove()");
		System.out.println(hset.size()); //����
		hset.remove(new Student("������",19,3,2,null));//���ü����
		for(Object obj:hset) {
			System.out.println(obj);
		}
		
		hset.clear();//��ü��ü����
	}
	
	//Map�� ���ؼ� �˾ƺ���
	public void mapTest() {
		//map�� ��ü�� �����ϴ� �ڷ�������
		//K,V�������� ��ü�� ����(key,value)
		//key:Object,value:Object
		//Map��ü ����
		//HashMap, TreeMap, LinkedHashMap
		//Map��ü �����ϱ�
		HashMap map=new HashMap();
		//map�� ���� ������ ����
		//put(key,value)�޼��� �̿� (���ÿ� �Է�)
		map.put(1, "������");
		map.put(2, "�ڹα�");
		map.put(3, "�����");
		//map���� ���� ȣ��(key�� �Է�) index�� ����
		System.out.println(map.get(1));
		System.out.println(map.get(5));
		
		//key���� ��� ��ü�� ������ �� ����
		map.put("����", new Student("������",19,3,2,new GradePoint(100,100,100,100)));
		System.out.println(map.get("����"));
		//map.put(new Student("������",19,3,2,null),10);//�̷��Դ� �� ������� �ʴ´�
		
		//key���� �ִ�? Ȯ�����ش�
		System.out.println(map.containsKey("����"));//T
		System.out.println(map.containsKey("����"));//F
		//value���� �ִ�? Ȯ�����ش�
		if(map.containsKey("����")) {
			map.get("����");
		}
		System.out.println(map.containsValue("�����"));//T
		
		//map���� ������ü�� �����ϴ� ��
		//map�� �ִ� ��ü�� �ѹ��� ��ȸ�ϴ°�
		//1. key���� �˾ƾ� �Ѵ�
		//2. Ȯ���� key�� �ش��ϴ� value�� �����´�
		//map�� key���� Ȯ���ϴ� ���
		//keySet():key������ set���·� ��ȯ���ִ� �޼���
//		System.out.println("=====������ key�� ����ϱ�:keySet()=====");
		Set keys=map.keySet();
		
		
//		for(Object obj:keys) {
//			System.out.print(obj+" ");
//		}
		//iterator�� Set�� �ִ� ���� ������
		System.out.println("=====key�� �������� value ����ϱ� : keys�� Iterator�� ������ �״´�=====");
		Iterator it=keys.iterator();//it��� Iterator tray�� keys ������ �״´�
		//it.next()���� Ű���� ������. �� Ű�� ������ map���� �ڷḦ �����´�
		while(it.hasNext()) {
			Object obj=it.next();//�⺻������ �޴� ���� Object
			System.out.println(obj);
			//�� ���� �ϳ��� �޾ƾ� �Ѵ�. ������ �� ������ �޾ƾ� �Ѵ�. �������� �ʵ���
			if(map.get(obj) instanceof Student) {
				Student s=(Student)map.get(obj);
				System.out.println(s);
			}
			//�߸��� ����
			//���� �������� ���� it.next()�� �ι� ����ϰ� �ǹǷ� �ùٸ� ��Ī�� ���� �ʴ´� 
//			if(map.get(it.next()) instanceof Student) {
//				Student s=(Student)(map.get(it.next()));
//			}
//			System.out.println(map.get(it.next()));
			
		}
		
		//map��½� key�� value�� ���ÿ� �������� ���
		//entrySet();
		System.out.println();
		System.out.println("=====������ key��, value ���� ����ϱ� map.entrySet()=====");
		Set entry=map.entrySet();
		Iterator it2=entry.iterator();
		while(it2.hasNext()) {//it2 ���� ���� �ִ���
			//next() �ѹ��� key�� value�� ���ÿ� ������
			Map.Entry o=(Map.Entry)it2.next();
			System.out.println(o.getKey()
					+" : "+o.getValue());
		}
		System.out.println();
		System.out.println("=====Student ��ü ����� map.remove()=====");
		map.remove("����");
		Set entry2=map.entrySet();
		it2=entry2.iterator();
		while(it2.hasNext()) {
			Map.Entry o=(Map.Entry)it2.next();
			System.out.println(o.getKey()
					+" : "+o.getValue());
		}
		
		System.out.println();
		System.out.println("=====��� ��ü ����� : map.clear()=====");
		//map.clear();
		Set entry3=map.entrySet();
		it2=entry3.iterator();
		while(it2.hasNext()) {
			Map.Entry o=(Map.Entry)it2.next();
			System.out.println(o.getKey()
					+" : "+o.getValue());
		}
		System.out.println("====����� ����====");
		
		//value�� ��ü�� �޾ƿ��� �� : values()
		//Collection c=map.values();
		System.out.println("�� ��ü�� �޾ƿ���");
		for(Object c:map.values()) {
			System.out.println(c);
		}
		
	}
	
	
	public void propertiesTest() {
		//������Ƽ���� ���ϰ� ����Ǿ� key, value��������
		//����� �����͸� �ҷ����ų� �����ϴ� ��ü�� ����
		//��������!
		Properties prop=new Properties();
		//Properties������ �ҷ�����
		try {
			prop.load(new FileInputStream("test.properties"));
			//������ �ε��� ���Ŀ� key������ value�� �ҷ��� �� ����
			String name=(String)prop.get("name");
			String age=(String)prop.get("age");
			String address=(String)prop.get("address");
			String driver=(String)prop.get("driver");
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(address);
			System.out.println(driver);
			//���α׷����� ������ ���� �����ϱ� - ������
			prop.setProperty("exam", "properties ���� �� ����! ������!");
			//�ܺ� ���Ͽ� ������ ���� store�޼��带 �̿��ؼ� ó��
			prop.store(new FileWriter("test1.properties"), "hahaha");
			//properties���� ������ �����ݷ��� ������� �ʴ´�
			//����ϸ� ���ڿ��� �߸� �о���δ�
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		
	}
}
