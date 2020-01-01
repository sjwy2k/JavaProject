package day3.book.model.vo;

public class Book {

	private String title, publisher, author;
	private int price;
	private double discountRate;
	
	public Book() {
		
	}
	
	public Book(String title, String publisher, String author) {
		this.title=title;
		this.publisher=publisher;
		this.author=author;
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title=title;
		this.publisher=publisher;
		this.author=author;
		this.price=price;
		this.discountRate=discountRate;
	}
	
	public String infomation(Book b) {
		String result="";
		result+=b.getTitle()+b.getPublisher()+b.getAuthor()+b.getPrice()+b.getDiscountRate();
		return result;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}
