package com.variable.function;

public class VariableFunction {
	
	boolean flag2; //메서드 바깥에도 변수 선언 가능
	
	public void basicVariable() {
		// 기본적인 변수를 선언해보자 - 자료형의 크기에 맞는 공간 선점
		// 데이터에 걸맞는 자료형을 개발자가 미리 생각해서 선택
		// true/false 값을 저장하기 위한 변수선언
		boolean flag;
		
		//성별을 남/여로 저장하는 공간을 확보한다
		char gender;
		
		//숫자를 0~126까지 저장하는 공간을 확보(변수선언)
		byte bnum;
		
		//일반적으로 사용하는 숫자를 저장하는 공간 확보		
		int number;
			
		//키나 몸무게 변수 선언
		double height;
		
		//이름 변수 선언
		String name;
		
		//변수명을 정할 때는 명명규칙을 적용해야 함
		//예약어를 변수명으로 사용할 수 없음
//		String class; //예약어 class
//		int public;	//예약어 public
//		byte if;	//예약어 if
		
		//숫자로 변수명을 시작할 수 없음
//		int 1age; //앞에 1 변수선언불가
		//숫자가 처음이 아닌 위치에 오는 것은 가능
		int a1ge;
		int ag2e;
		
		//특수문자는 $, _만 사용이 가능함
		String $harp;
		String name_str;
		double _weight;
		float weight_;		
//		char gen#der; //선언 때 #사용 불가
//		char gender^^@; //^^, @사용불가
		
		//여러단어는 camelCase를 적용하여 사용
		String memberName;
		int memberAge;
		
		//변수는 첫 글자를 소문자로 써야 함. !강제(에러발생)는 아니지만 반드시 지켜야 함!
//		char Gender;	//가능하더라도 쓰지 마시오1
		char geNder;
//		char GenDer;	//가능하더라도 쓰지 마시오2
		char asdfjhasldkjthlakysalhtrka;
		
//		String 한글변수명; //가능하더라도 쓰지 마시오3
//		int 나이;	//가능하더라도 쓰지 마시오4
		
//		int age = name; //String 자료형의 값을  int 자료형에 바로 넣을 수 없음. 형 변환을 하거나 동일한 자료형에 넣어야 함.		
	}
	
	public void variableInput() {
		// 나이를 저장한다
		int age; 
		age = 33;
		
		// 키를 저장한다
		double height;
		double height2 = 175.5;
		
		//본인 통장 잔액
//		String bankAccount1 = "빈털털이 텅장";
		long bankAccount = 98789789789L;
		int i = (int)bankAccount;
		
		//원주율 = 3.14
		float pi = 3.14f;
		double pi2 = 3.14;
		
		//성별
		char gen = 'M';
		String gender = "male";		
		//흔히 실수하는 예
//		char gend = "Male";
//		String gende = 'male';	
		
//		System.out.println(gender);
//		gender = "female";
//		System.out.println(gender);
//		
//		//위에서 선언한 변수 출력하기
//		System.out.println(pi);
		
		
		
		//상수활용하기 - 한번만 값을 대입할 수 있는 저장공간
		final int AGE = 19;
//		System.out.println(AGE);
//		AGE = 20; //AGE 변수는 final로 이미 선언되었으므로 다시 할당이 불가능
		
		
		//String 문자열의 심화 
		//(다른형 + "문자열" = 문자열)
		//("문자열" + 다른형 = 문자열)
		//(문자열 + 문자열 = 문자열)
		//(숫자열 + 숫자열 = 숫자열)
		String str1 = "기차"; //String class 간략하게 선언
		String str2 = new String("기차"); //String class new 생성자로 선언
		String str3 = "여러분"+"파이팅"; //문자를 연이어서 출력
		String str4 = new String("기차"+"칙칙폭폭"); //new 생성자에서 문자열을 연산해 선언
		String str5 = "기차"+123+45+"출발"; //숫자+문자열 = 문자열
		String str6 = 123+45+"기차"+"출발"; //숫자+숫자 연산 후 숫자가 문자로 변환
		String str7 = "기차"+(123+45)+"출발"; //문자열 사이의 숫자를 연산하고 싶을 때, 괄호로 묶으면 우선연산 
		String str8 = ""+123+45+"기차"+"출발"; //앞에 숫자를 모두 문자로 적고 싶을 때 빈 String 문자열 ""을 추가
		
//		System.out.println(str1+"\r"+str2+"\r"+str3+"\r"+str4+"\r"+str5+"\r"+str6+"\r"+str7+"\r"+str8);
		
		
//		String str9 = "저의 키는 " +175.5+" 입니다.";
//		System.out.println(str9);
//		String str10 = 175+0.5+"는 제 키에요!";
//		System.out.println(str10);
//		
//		
//		//변수 출력을 응용하기!
//		//변수에 있는 값을 한번에 출력해보기
//		System.out.println("제 나이는 "+age+"이고, 제 통장의 잔액은 "+bankAccount+"원입니다.");
		
		
		
	}	
	
	public void dataOverFlow() {
//		byte bnum = 127;
		int bnum = 127;
		
		//bnum에 있는 값에 300번 1씩 더하는 로직
		for(int i=0; i<300; i++) {
			System.out.println(bnum++);
		}	
		
		
	}
	
	public void autoCasting() {
		int age = 19;
		long bigAge;
		bigAge = age;
		long account = 10000000L;
		
		float fnum = age;
		
		System.out.println(bigAge+"\r"+fnum);
		
//		float는 데이터를 값 자체가 아닌 '계산식'으로 표현하므로, long(8)의 데이터를 float(4)값으로 넣을 수 있다.
		fnum = account;
		System.out.println(fnum);
		
		int num = 10;
		double dnum = 65.5;
		
		int result = (int)(num+dnum); //double은 int로 변환할 수 없다. (int)로 강제 형변환, 손실발생
		
		System.out.println(num+dnum); //자동 형변환(int > double)
		System.out.println(result); // 0.5만큼의 데이터 손실
		
		
		//char형은 숫자 코드값 저장 된다		
		int ch = 65;
		System.out.println(ch);		
		char cha = (char)ch; //int형을 char형으로 형변환(casting)
		System.out.println(cha); // ASCII 코드 A로 출력
		System.out.println((char)(cha+1)); // char로 연산식 적용 가능
		
		
		//int형을 byte형으로 변환했을 때 데이터 손실
		int num2 = 290;
		byte bnum2 = (byte)num2;
		System.out.println(num2+" -> "+bnum2); // 290 수가 34로 변하며 데이터 손실이 일어남
		
	}
	
	
	
	
	public void variableExample() {
		int i = 100;
		long l = 10000L;
		float f = 234.567f;
		double d = 567.12356;
		char c = 'A';
		String str = "Hello world";
		boolean bool = true;
		
//		System.out.println(i);
//		System.out.println(l);
//		System.out.println(f);
//		System.out.println(d);
//		System.out.println(c);
//		System.out.println(str);
//		System.out.println(bool);
		System.out.println("1번 예제");
		System.out.println(i+"\r"+l+"\r"+f+"\r"+d+"\r"+c+"\r"+str+"\r"+bool);
	}
	
	public void variableExample2() {
		
		System.out.println("\r\r\r2번 예제");
		System.out.println("이름	"+"나이	"+"성별	"+"지역	"+"전화번호		"+"이메일	");
		System.out.println("-------------------------------------------------------------------------");
		
		String name = "홍두깨";
		String age = "22";
		String gender = "남자";
		String locale = "서울";
		String phone = "01012345678";
		String email = "myemail@email.com";
				
		System.out.println(name+"	"+age+"	"+gender+"	"+locale+"	"+phone+"	"+email);
		System.out.println("-------------------------------------------------------------------------");
				
		name = "고길동";
		age = "50";
		gender = "남자";
		locale = "경기도";
		phone = "01098765432";
		email = "mrgogo@email.com";
		
		System.out.println(name+"	"+age+"	"+gender+"	"+locale+"	"+phone+"	"+email);
		System.out.println("-------------------------------------------------------------------------");
	}
}