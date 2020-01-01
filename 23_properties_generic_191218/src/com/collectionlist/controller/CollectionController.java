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

	//List에 대해 알아보자
	//ArrayList, LinkedList, Vector
	//ArrayList는 배열과 매우 흡사.
	//index, 길이, 순서
	public void listTest() {
		//new 연산자로 생성
		ArrayList list=new ArrayList();
		//객체를 보관할 수 있는 저장공간 10개 생성!
		//==Object[] obj=new Object[10];
		
		System.out.println(list.size());
		//기본 여유공간은 10개지만
		//size() 메서드는 실제 객체가 대입되어있는 수를 나타냄.
		//ArrayList에 객체를 추가해보자. add()메서드를 이용		
		list.add("이승원");//String객체
		System.out.println(list.size()); //0번 index에 값이 들어감
		//ArrayList에는 객체만 보관이 가능!
		//기본자료형은??저장이???
/***/	list.add(1);//왜? auto-boxing에 의해 객체화되기 때문에!
		//ArrayList에는 다양한 자료형이 저장이 가능
		list.add(180.5);//double, autoboxing
		list.add(new Date());//Date객체
		list.add(new Student("유병승",19,3,3,null));//Student객체
		//ArrayList의 데이터를 출력해보자
		//객체기 때문에 객체 있는 데이터는 getter로 출력
		//get(index)메서드를 이용해 출력
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		//배열과 동일하게 for문으로 출력이 가능
		System.out.println("====for문 이용하여 출력하기====");
		//ArrayList의 길이는 length가 아닌 size()
		for(int i=0; i<list.size(); i++) {//**//
			System.out.println(list.get(i));
		}
		
		//일반적으로 add(value)메서드를 이용하면
		//list의 맨 뒤에 추가됨.
		//중간에 삽입하고 싶으면 삽입하고 싶은 위치의 index를 명기
		//add(index,value)
		list.add(1,"지각");
		System.out.println();
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		System.out.println();
		
		//전부 Object자료형으로 대입됨.
		//Object는 모든 객체를 담을 수 있다. 최상위 객체.
		//toString을 Override하지 않으면 객체의 주소값이 출력됨.
		for(Object obj:list) {
			if(obj instanceof Student) { //해당 객체의 자료형인지만 
				Student s=(Student)obj;
				String str=s.getName()+s.getGrade()+s.getAge();
				System.out.println(str);
			} else {
				System.out.println(obj);
			}
		}
		//list에 있는 값을 수정할땐..
		//set() 메서드를 이용
		//set(index,value)
/***/	list.set(0, "유병승");
		list.set(1, new Student("마경호", 22, 3, 1, null));//Student객체가 2개나옴
//		list.set(list.size()-1, new Student("마경호", 22, 3, 1, null));
		
		System.out.println();
		System.out.println();
		printList(list);
		System.out.println();
		System.out.println();
		//ArrayList가 데이터를 보관하고 있는지 확인하고 싶을때
		//isEmpty()메서드를 이용하여 확인
		//데이터가 없으면 T 있으면 F
		System.out.println(list.isEmpty());
		//list에 데이터가 있으면 출력해. 없으면 출력하지 마
/***/	if(!list.isEmpty()) { 
		//있으면 F가 나옴. if는 T일경우 실행
		}
/***/	if(list.size()>0) { 
		//list의 크기가 0보다 크면 들었다
		}
		System.out.println();
		System.out.println();
		
		//list에 내가 원하는 데이터가 있는지 조회
		//contains() 메서드를 이용
		
		list=new ArrayList();//초기화
		list.add("유병승");
		list.add("마경호");
		list.add("한지현");
		list.add("정재훈");
		list.add("정총명");
		System.out.println(list.contains("한지현"));
		System.out.println(list.contains("이순신"));
		
		
		list=new ArrayList();
		list.add(new Student("마경호", 22, 3, 1, null));
		list.add(new Student("한지현", 24, 3, 1, null));
		list.add(new Student("정재훈", 26, 3, 1, null));
		list.add(new Student("정총명", 24, 3, 1, null));
		
		//동등성을 비교-equals(), hashcode() 메서드의 overriding이 필요하다.
		//contains메서드 만으로는 내용의 동등성을 비교할 수 없다.
		//overriding 후에 비교 가능해짐
		
		System.out.println("마경호 있니? -> "+list.contains(new Student("마경호", 22, 3, 1, null)));
		System.out.println("정총명 있니? -> "+list.contains(new Student("정총명", 24, 3, 1, null)));
		
		
		//list에 있는 데이터를 삭제
		printList(list);
		//list에서 데이터를 삭제할 때는 
		//remove(index) 메서드 이용
/***/	list.remove(0);//0번 index의 객체를 지워라.
		System.out.println("====삭제후 데이터====");
		printList(list);
/***/	list.remove(new Student("정총명", 24, 3, 1, null));
		System.out.println("====object 삭제후 데이터====");
		printList(list);
		
		
		//list내용 전체 지우고 싶을때
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
		//List는 순서가 있기 때문에 정렬이 가능
		ArrayList list=new ArrayList(10);
//		for(int i=0; i<10; i++) {
//			list.add((int)(Math.random()*20));//0~19
//		}
//		System.out.println("오름차순");
		Collections.sort(list);//오름차순 정렬
//		printList(list);
//		System.out.println();
		//내림차순
//		System.out.println("사용자 정의 정렬(내림차순도 가능)");
//		Collections.sort(list, new OrderLogic());//오름차순 정렬
//		Collections.sort(list,
//				(i,j)->((Integer)i-(Integer)j));
//		printList(list);
		
		System.out.println("====문자열정렬====");
		//문자열 정렬
		System.out.println("====오름차순====");
		list.clear();
		list.add("유병승");
		list.add("김희규");
		list.add("한지현");
		list.add("마경호");
		list.add("곽혜진");
		
		Collections.sort(list);//문자열 정렬????-오름차순
		printList(list); //입력된 대로 출력
		System.out.println();
		System.out.println("====내림차순====");
		//문자열을 내림차순으로 하려면??
		//Collections.sort(list, new OrderStringLogic());//문자열 정렬????
		//람다식 활용 내림차순 정렬
		Collections.sort(list,
				(i,j)->((String)j).compareTo((String)i)); //람다식
		printList(list); //입력된 대로 출력
		
		
		
		/**람다 테스트 */
		//람다식 1회용 클래스(메서드)
		//lamTest(
//		new LambdaTest() {
//			public void test(int a, int b) {
//				System.out.println("람다실행");
//				System.out.print(a+"+"+b+"=");
//				System.out.print(a+b);
//			}
//		});
//		lamTest((a,b)->{
//				System.out.println("람다실행");
//				System.out.print(a+"+"+b+"=");
//				System.out.print(a+b);
//				});
//		
	}
//
//	//람다테스트한것! 모르면...나중에 다시한번 보기!	
//	public void lamTest(LambdaTest a) {
//		System.out.println("람다 테스트하기");
//		a.test(100, 200);
//	}

	public void linkedList() {
		//LinkedList
		LinkedList llist=new LinkedList();
		llist.add("유병승");
		llist.add("마경호");
		llist.add("한지현");
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		
		System.out.println();
		llist.add(1, "정총명");
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		System.out.println();
		llist.set(0, "정재훈");
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		System.out.println(llist.getFirst());//linkedlist의 처음값
		System.out.println(llist.getLast());//linkedlist의 끝값
		
		//LinkedList를 ArrayList로 전환, 반대도 가능
		ArrayList list=new ArrayList(llist);
		List l=new ArrayList();//다형성에 의해 자식객체를 받는것
		l=new LinkedList();
	}
	
	public void setTest() {
		//Set객체를 보관하는 collection중 하나로
		//순서가 없고, 중복저장을 하지 않는다
		//순서가 없고, 객체를 지정하는 값이 없기 때문에
		//Set의 값을 출력할 때 Iterator객체를 이용
		//각 값에 접근하여 출력
		//Set에는 hashSet, treeSet을 이용		
		HashSet hset=new HashSet();
		//값을 넣을때는 list와 동일한 add()메서드
		hset.add("유병승");
		hset.add("유병승");
		hset.add("유병승");
		hset.add("유병승");
		hset.add("박지수");
		hset.add("김신현");
		hset.add("박덕현");
		hset.add("박덕현");
		hset.add("박덕현");
		hset.add("박덕현");
		hset.add("박덕현");
		hset.add("박덕현");
		//Set에 있는 값을 이용 - Iterator
		hset.add(new Student("유병승",19,3,2,null));
		hset.add(new Student("이승원",29,3,2,null));
		hset.add(new Student("박지수",30,3,2,null));
		hset.add(new Student("유병승",19,3,2,null));
		Iterator it=hset.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//ArrayList있는 중복값 제거하기
		System.out.println();
		System.out.println("중복값 제거 전");
		ArrayList list=new ArrayList();
		list.add(new Student("유병승",19,3,2,null));
		list.add(new Student("이승원",29,3,2,null));
		list.add(new Student("박지수",30,3,2,null));
		list.add(new Student("유병승",19,3,2,null));
		printList(list);
		
		//중복값을 제거해보자
		System.out.println();
		hset=new HashSet(list);
		list=new ArrayList(hset);
		System.out.println("중복값 제거 후");
		printList(list);
		
		
		System.out.println();
		System.out.println("출력하는 또 다른 방법");
		System.out.println("set을 for-each로 출력");
		//전체출력 - obj
		for(Object obj:hset) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("Set Collection에서 삭제 메서드 remove()");
		System.out.println(hset.size()); //길이
		hset.remove(new Student("유병승",19,3,2,null));//동등객체삭제
		for(Object obj:hset) {
			System.out.println(obj);
		}
		
		hset.clear();//객체전체삭제
	}
	
	//Map에 대해서 알아보자
	public void mapTest() {
		//map은 객체를 보관하는 자료형으로
		//K,V형식으로 객체를 보관(key,value)
		//key:Object,value:Object
		//Map객체 종류
		//HashMap, TreeMap, LinkedHashMap
		//Map객체 생성하기
		HashMap map=new HashMap();
		//map에 값을 대입할 때는
		//put(key,value)메서드 이용 (동시에 입력)
		map.put(1, "유병승");
		map.put(2, "박민규");
		map.put(3, "김신현");
		//map안의 값을 호출(key값 입력) index의 역할
		System.out.println(map.get(1));
		System.out.println(map.get(5));
		
		//key값은 어떠한 객체라도 설정할 수 있음
		map.put("병승", new Student("유병승",19,3,2,new GradePoint(100,100,100,100)));
		System.out.println(map.get("병승"));
		//map.put(new Student("유병승",19,3,2,null),10);//이렇게는 잘 사용하지 않는다
		
		//key값이 있니? 확인해준다
		System.out.println(map.containsKey("병승"));//T
		System.out.println(map.containsKey("유뱅"));//F
		//value값이 있니? 확인해준다
		if(map.containsKey("유뱅")) {
			map.get("유뱅");
		}
		System.out.println(map.containsValue("김신현"));//T
		
		//map에는 여러객체를 보관하는 곳
		//map에 있는 객체를 한번에 조회하는것
		//1. key값을 알아야 한다
		//2. 확인한 key에 해당하는 value를 가져온다
		//map의 key값을 확인하는 방법
		//keySet():key값들을 set형태로 반환해주는 메서드
//		System.out.println("=====가져온 key값 출력하기:keySet()=====");
		Set keys=map.keySet();
		
		
//		for(Object obj:keys) {
//			System.out.print(obj+" ");
//		}
		//iterator로 Set에 있는 값을 가져옴
		System.out.println("=====key값 바탕으로 value 출력하기 : keys를 Iterator로 꺼내어 쌓는다=====");
		Iterator it=keys.iterator();//it라는 Iterator tray에 keys 값들을 쌓는다
		//it.next()에는 키값이 찍힌다. 그 키를 가지고 map에서 자료를 가져온다
		while(it.hasNext()) {
			Object obj=it.next();//기본적으로 받는 값은 Object
			System.out.println(obj);
			//한 번에 하나씩 받아야 한다. 가져올 때 조심히 받아야 한다. 에러나지 않도록
			if(map.get(obj) instanceof Student) {
				Student s=(Student)map.get(obj);
				System.out.println(s);
			}
			//잘못된 예제
			//값을 가져오기 위해 it.next()를 두번 사용하게 되므로 올바른 매칭이 되지 않는다 
//			if(map.get(it.next()) instanceof Student) {
//				Student s=(Student)(map.get(it.next()));
//			}
//			System.out.println(map.get(it.next()));
			
		}
		
		//map출력시 key와 value를 동시에 가져오는 방법
		//entrySet();
		System.out.println();
		System.out.println("=====가져온 key값, value 동시 출력하기 map.entrySet()=====");
		Set entry=map.entrySet();
		Iterator it2=entry.iterator();
		while(it2.hasNext()) {//it2 다음 값이 있는지
			//next() 한번에 key와 value값 동시에 가져옴
			Map.Entry o=(Map.Entry)it2.next();
			System.out.println(o.getKey()
					+" : "+o.getValue());
		}
		System.out.println();
		System.out.println("=====Student 객체 지우기 map.remove()=====");
		map.remove("병승");
		Set entry2=map.entrySet();
		it2=entry2.iterator();
		while(it2.hasNext()) {
			Map.Entry o=(Map.Entry)it2.next();
			System.out.println(o.getKey()
					+" : "+o.getValue());
		}
		
		System.out.println();
		System.out.println("=====모든 객체 지우기 : map.clear()=====");
		//map.clear();
		Set entry3=map.entrySet();
		it2=entry3.iterator();
		while(it2.hasNext()) {
			Map.Entry o=(Map.Entry)it2.next();
			System.out.println(o.getKey()
					+" : "+o.getValue());
		}
		System.out.println("====결과값 없음====");
		
		//value값 전체를 받아오는 것 : values()
		//Collection c=map.values();
		System.out.println("값 전체를 받아오기");
		for(Object c:map.values()) {
			System.out.println(c);
		}
		
	}
	
	
	public void propertiesTest() {
		//프로퍼티스는 파일과 연결되어 key, value형식으로
		//저장된 데이터를 불러오거나 저장하는 객체를 말함
		//문자전용!
		Properties prop=new Properties();
		//Properties파일을 불러오기
		try {
			prop.load(new FileInputStream("test.properties"));
			//파일을 로드한 이후에 key값으로 value를 불러올 수 있음
			String name=(String)prop.get("name");
			String age=(String)prop.get("age");
			String address=(String)prop.get("address");
			String driver=(String)prop.get("driver");
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(address);
			System.out.println(driver);
			//프로그램에서 생성된 값을 저장하기 - 변수에
			prop.setProperty("exam", "properties 내용 잘 봐야! 모르지만!");
			//외부 파일에 저장할 때는 store메서드를 이용해서 처리
			prop.store(new FileWriter("test1.properties"), "hahaha");
			//properties파일 내에는 세미콜론을 사용하지 않는다
			//사용하면 문자열을 잘못 읽어들인다
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		
	}
}
