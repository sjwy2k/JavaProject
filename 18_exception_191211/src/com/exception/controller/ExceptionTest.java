package com.exception.controller;

import java.io.FileNotFoundException;

public class ExceptionTest {

	public void methodA() throws FileNotFoundException{
		methodB();
	}
	public void methodB() throws FileNotFoundException{
		methodC();
	}
	public void methodC() throws FileNotFoundException{
		//예외발생
		
		
		
	}
	
}
