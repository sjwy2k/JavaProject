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
		//제네릭을 이용하면 컬렉션에 대입할 수 있는
		//데이터를 관리할 수 있음
		List list=new ArrayList();
		list.add(new Date());
		list.add("유병승");
		list.add(new Student("유병승", 19, 3, 3, "010"));
		Student s=(Student)list.get(2);//list.get(index) 사용시 형변환 해야 된다
		s.getName();
		//제네릭을 적용하면 원하는 자료형으로 고정 - Student객체
		List<Student> genericList=new ArrayList();
//		genericList.add("유병승");//삽입불가
		//들어감
		genericList.add(new Student("신재원",33,3,3,"010"));
		Student s1=genericList.get(0);//형변환 안해도 된다
		System.out.println(genericList.get(0).getName());
		
		
		
		//map에서도 generic 적용하기
		Map map=new HashMap();
		map.put(1, "유병승");
		map.put("병승", new Student("유병승",19,3,3,"12314"));
		System.out.println("");
		System.out.println("key에 맞는 value 받아오기!generic 적용없이 가져오려면?");
		Set keys=map.keySet(); //set에 generic이없으므로 object반환
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			Object obj=map.get(it.next());
			if(obj instanceof Student) {
				Student ss=(Student)obj;
				System.out.println(ss.getName());//바로 접근 가능
				System.out.println(ss.getAge());
				System.out.println(ss.getGrade());
				System.out.println(ss.getBan());
				System.out.println(ss.getPhoneNum());
				System.out.println(ss);
			}
		}
		
		
		//map에 제네릭을 선언하여 자료형을 지정/제한하면
		Map<String, Student> gMap=new HashMap();//제네릭으로 선언된 gMap
		//key값이 String이고, value가 Student인 값만 들어갈 수 있다 
		//gMap.put(1, "유병승");//삽입불가1 - key값,value값x
		//gMap.put("1", "haha");//삽입불가2 - value값x
		//gMap.put(1,new Student());//삽입불가3 - key값x
		gMap.put("1",new Student("유병승",19,3,3,"010"));//삽입가능
		//set에 generic이 있으므로 String반환
		//확장되어 있으므로 구체화시켜서 넣어라(Object 받아짐)
		System.out.println("");
		System.out.println("key에 맞는 value 받아오기!Set+Generic");
		Set<String> gKeys=gMap.keySet();//Object
		Iterator<String> it2=gKeys.iterator();
		while(it2.hasNext()) {
			String key=it2.next();
			System.out.println(gMap.get(key).getName());//바로 접근 가능
			System.out.println(gMap.get(key).getAge());
			System.out.println(gMap.get(key).getGrade());
			System.out.println(gMap.get(key).getBan());
			System.out.println(gMap.get(key).getPhoneNum());
			System.out.println(gMap.get(key));
		}
		System.out.println("");
		System.out.println("key와 value를 동시에 받아오는 것! - Set+Generic+entrySet");
		//key와 value를 동시에 받아오는 것!
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
