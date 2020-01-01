package com.substream.main;

import com.substream.controller.ObjectIO;

public class Main {

	public static void main(String[] args) {
		
//		DataInOut dio=new DataInOut();
//		dio.savePerson();
//		dio.readPerson();
		
		ObjectIO oio=new ObjectIO();
		oio.saveObject();
		oio.readObject();
		
	}

}
