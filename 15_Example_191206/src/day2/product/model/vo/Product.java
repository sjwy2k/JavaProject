package day2.product.model.vo;

public class Product {

	private String pName, brand;
	private int price;
	
	public Product() {
		
	}
	
	public void information(Product p) {
		System.out.println(p.getpName()+p.getBrand()+p.getpName());
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
