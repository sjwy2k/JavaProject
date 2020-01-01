package com.abstractobj.model.vo;

import com.abstractobj.controller.TestInterface;

public class InterfaceTest2 implements TestInterface {

	@Override
	public void test() {
		System.out.println("나야나");

	}

	@Override
	public String getName() {
		
		return "나야나";
	}

	@Override
	public void calculator(int a, int b) {
		System.out.println(a*b);

	}

	@Override
	public void printA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printCG() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test33() {
		// TODO Auto-generated method stub
		
	}

}
