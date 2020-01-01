package object.silsub3.controller;

import object.silsub3.model.Product;

public class TestProduct {
	public static void main(String[] args) {
		Product pd=new Product("ssgnote6","갤럭시노트6","경기도수원",960000,10.0);
		Product pd2=new Product("igxnote5","LG스마트폰5","경기도평택",780000,0.7);
		Product pd3=new Product("ktnorm3","KT일반폰3","서울시강남",25000,0.3);
		
		pd.setPrice(1200000);   pd.setTex(0.5);
		pd2.setPrice(1200000);  pd2.setTex(0.5);
		pd3.setPrice(1200000);  pd3.setTex(0.5);
		
		pd.information();
		pd2.information();
		pd3.information();
		
		pd.setTex(0.05);
		pd2.setTex(0.05);
		pd3.setTex(0.05);
		
		System.out.println("상품명: "+pd.getProductName()+"\n"+"부가세 포함가격: "
								+(pd.getPrice()+pd.getPrice()*pd.getTex()));
		System.out.println("상품명: "+pd2.getProductName()+"\n"+"부가세 포함가격: "
								+(pd2.getPrice()+pd2.getPrice()*pd2.getTex()));
		System.out.println("상품명: "+pd3.getProductName()+"\n"+"부가세 포함가격: "
								+(pd3.getPrice()+pd3.getPrice()*pd3.getTex()));
	}
		
}
