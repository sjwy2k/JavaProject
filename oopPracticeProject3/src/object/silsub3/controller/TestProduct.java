package object.silsub3.controller;

import object.silsub3.model.Product;

public class TestProduct {
	public static void main(String[] args) {
		Product pd=new Product("ssgnote6","�����ó�Ʈ6","��⵵����",960000,10.0);
		Product pd2=new Product("igxnote5","LG����Ʈ��5","��⵵����",780000,0.7);
		Product pd3=new Product("ktnorm3","KT�Ϲ���3","����ð���",25000,0.3);
		
		pd.setPrice(1200000);   pd.setTex(0.5);
		pd2.setPrice(1200000);  pd2.setTex(0.5);
		pd3.setPrice(1200000);  pd3.setTex(0.5);
		
		pd.information();
		pd2.information();
		pd3.information();
		
		pd.setTex(0.05);
		pd2.setTex(0.05);
		pd3.setTex(0.05);
		
		System.out.println("��ǰ��: "+pd.getProductName()+"\n"+"�ΰ��� ���԰���: "
								+(pd.getPrice()+pd.getPrice()*pd.getTex()));
		System.out.println("��ǰ��: "+pd2.getProductName()+"\n"+"�ΰ��� ���԰���: "
								+(pd2.getPrice()+pd2.getPrice()*pd2.getTex()));
		System.out.println("��ǰ��: "+pd3.getProductName()+"\n"+"�ΰ��� ���԰���: "
								+(pd3.getPrice()+pd3.getPrice()*pd3.getTex()));
	}
		
}
