package day2.product.controller;

import day2.product.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p=new Product();
		p.setpName("만두");
		p.setBrand("비비고왕교자");
		p.setPrice(8000);
		p.information(p);
	}

}
