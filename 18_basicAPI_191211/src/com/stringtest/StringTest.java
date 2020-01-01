package com.stringtest;

public class StringTest {

	public static void main(String[] args) {
		String name="유병승";
//		System.out.println("name의 hashCode() : "+name.hashCode());
//		int input1=name.hashCode();
//		
		String name2="마경호";
//		
//		//불변의 String
//		name="정재훈";
//		System.out.println("name의 hashCode() : "+name.hashCode());
//		int input2=name.hashCode();
//		
//		boolean flag;
//		flag=input1==input2;
//		System.out.println("저장공간이 같니? : "+flag);
//		
//		name+="한지현";
//		System.out.println("name의 hashCode() : "+name.hashCode());
//		int input3=name.hashCode();
//		flag=input2==input3;
//		System.out.println("저장공간이 같니? : "+flag);
//		
//		StringBuffer namee=new StringBuffer("유병");
//		System.out.println("namee의 hashCode() : "+namee.hashCode());
//		StringBuilder nameee=new StringBuilder("신재원");
		
		//String의 유용한 메서드
		//1. 문자열을 합치는 메서드 : concat();
//		String sumName=name.concat(name2);
//		System.out.println(sumName);
		
		
		//2. 문자열에 있는 문자 찾기 : contains()
//		name="가나다라마바사아자";
//		System.out.println("\'다\'가 있니? : "+name.contains("다"));
//		name="운동, 독서, 게임, 수다, 볼링";
//		System.out.println("취미중 \'볼링\'이 있니? : "+name.contains("볼링"));
//		System.out.println("취미중 \'등산\'이 있니? : "+name.contains("등산"));
		
		//3. replace() : 해당 문자열을 *바꾸어*준다.
//		name="경기도 시흥시 정왕대로";
//		name=name.replace(/*찾을값*/"시흥",/*변경할 값*/"서울");
//		System.out.println(name);
		
		//4. substring() : 문자열을 잘라내는 기능
//		name="유병승 19 경기도 시흥시";
//		System.out.println(name.substring(3));//유병승 이후만을 잘라냄
//		System.out.println(name.substring(3, 6)); //나이 부분만을 잘라냄
		
		//5. indexOf() : 특정문자의 위치를 나타내주는 기능
//		String file="D:\\workspace";
//		System.out.println(file.indexOf("\\"));
//		System.out.println(file.substring(file.indexOf("\\")+1));
//		String file="java.class.txt";
//		System.out.println(file.indexOf("."));
//		System.out.println(file.substring(file.indexOf(".")+1));
		
		//6. lastIndexOf() : 뒤에서부터 특정문자에 위치 알려주는기능
//		System.out.println(file.substring(file.lastIndexOf(".")+1));
		
		//7. split()
//		name="유병승,마경호,정총명,박덕현,박지수,이승원";
//		String[] names=name.split(",");
//		for(String n:names) {
//			System.out.println(n);
//		}
		
		
		//StringBuffer : 동일한 저장공간을 사용하기 때문에
		//변경이 가능하고 수정, 삭제가 가능
		System.out.println("====StringBufferClass====");
		System.out.println("String");
		String test="김희규";
		System.out.println("test : "+test.hashCode());
		test+="이민정";
		System.out.println(test);
		System.out.println("test후 : "+test.hashCode());
		
		//StringBuffer는 메서드를 이용해서 문자열을 관리
		System.out.println("\nStringBuffer");
		StringBuffer sb=new StringBuffer("김희규");
		System.out.println(sb);
		System.out.println("sb : "+sb.hashCode());
		sb.append("김용진");//추가
		System.out.println(sb);
		System.out.println("sb후 : "+sb.hashCode());
		
		sb.insert(3, "박지수 홍홍!");//삽입(index위치, 삽입내용)
		System.out.println(sb);
		System.out.println("sb후후 : "+sb.hashCode());
		
		//String으로 받아놓은걸 StringBuffer로 전환도 가능
		StringBuffer sb2=new StringBuffer(sb);
		sb.delete(3, 10);//삭제
		System.out.println(sb);
		
		//전반적으로 StringBuffer와 비슷한 StringBuilder
		//StringBuilder는 threadsafety 기능이 없다.
		System.out.println("\nStringBuilder");
		StringBuilder sbb=new StringBuilder("마경호");
		sbb.append("왕따");
		System.out.println(sbb);
		
		
	}
}
