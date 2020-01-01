package com.exception.controller;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideTestC extends OverrideTestA{

	//자손 Exception 중복정의
	//IOException포함, 하위 예외는 모두 던지기 가능
	//FileNotFoundException, EOFException, IOException
	@Override
	public void testException() 
			throws FileNotFoundException, EOFException, IOException{
		
	}
}
