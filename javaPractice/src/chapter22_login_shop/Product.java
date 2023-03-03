package chapter22_login_shop;

public class Product {
	
	private final int productID;
	private final String productName;
	private final int price;
	private int count = 0;
	
	Product(int productID, String productName, int price){
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}
	
	int getProductID() {
		return productID;
	}
	
	String getProductName() {
		return productName;
	}
	
	int getPrice() {
		return price;
	}
	
	void plusCount(int num) {
		count += num;
	}
	
	int getCount() {
		return count;
	}
}
