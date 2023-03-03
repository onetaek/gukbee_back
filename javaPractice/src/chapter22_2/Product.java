package chapter22_2;

public class Product { // ��ǰ ���� Ŭ����. ��ٱ��� ������� ��ǰ�� ������
	private final int productID; // ��ǰ �ڵ�
	private final String productName; // ��ǰ �̸�
	private final int price; // ����
	
	public Product(int productID, String productName, int price) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}

	public int getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}
	
	
}
