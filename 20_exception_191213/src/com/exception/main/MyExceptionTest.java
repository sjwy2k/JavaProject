package com.exception.main;

public class MyExceptionTest {

	public void checkAge(int age) {
		try {
			if(age<19) {
				throw new MyException("����Ұ�");
			} else {
				System.out.println("��");
			}
		} catch(MyException me) {
			System.out.println(me);
		}
		
	}

}
