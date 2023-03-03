package chapter22_2;

public class Cart {
	int productID, cnt;

	public Cart(int productID, int cnt) {
		this.productID = productID; // ��ǰ �ڵ�
		this.cnt = cnt; // ���� ����
	}

	@Override
	public String toString() {
		return "��ǰ��ȣ: " + productID + ", ����: " + cnt;
	}
	
}
