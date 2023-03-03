package chapter22_2;
 
// �����ڷ� ��ǰ�� �����ϰ� �����ϴ� ���
public class ShopProduct {
	Product[] product = new Product[3];
	
	public ShopProduct() {
		product[0] = new Product(1, "���� Ŀ��", 5000);
		product[1] = new Product(2, "�ĳ��� ���̻�", 15000);
		product[2] = new Product(3, "�̵����ī Ŀ��", 10000);
	}

	// ��ǰ ����
	void printProduct() {
		for(Product p : product) {
			System.out.println("��ǰ�ڵ�: " + p.getProductID() + 
					", ��ǰ�̸�: " + p.getProductName() + 
					", ����: " + p.getPrice());
		}
	}
	
}
