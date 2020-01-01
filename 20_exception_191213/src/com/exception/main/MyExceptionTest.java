package com.exception.main;

public class MyExceptionTest {

	public void checkAge(int age) {
		try {
			if(age<19) {
				throw new MyException("입장불가");
			} else {
				System.out.println("즐감");
			}
		} catch(MyException me) {
			System.out.println(me);
		}
		
	}

}
