package chapter22_2;

import java.util.ArrayList;
import java.util.Scanner;

// ��ٱ��Ͽ� ��ǰ�� �����ϰ� ����ϴ� ���
public class ShopCart extends ShopProduct {
	Scanner sc = new Scanner(System.in);
	ArrayList<Cart> mycart = new ArrayList<Cart>();
	
	// ��ǰ ����
	void selectProduct() {
		while(true) {
			System.out.print("������ ��ǰ�� ��ȣ�� �Է��� �ֽʽÿ�.>> ");
			int proID = sc.nextInt();
			if(proID < 1 || proID > 3) {
				System.out.println("��ǰ�� ��ȣ�� 1���� 3���� �Է� �����մϴ�.");
				selectProduct();
				break;
			}
			System.out.print("��ǰ�� ���� ������ �Է��� �ֽʽÿ�.>> ");
			int proNum = sc.nextInt();
			if(proNum > 10) {
				System.out.println("��ٱ��Ͽ� ���� ������ �ִ� ������ 10���Դϴ�. ");
				continue;
			}
			Cart cart = new Cart(proID, proNum);
			
			boolean sameID = false; // ������ ��ǰ ��ȣ �ִ� ��� -> true
			for(Cart c : mycart) {
				if(proID == c.productID) {
					sameID = true;
					if((c.cnt + proNum) > 10) {
						System.out.println("��ٱ��Ͽ� ���� ������ �ִ� ������ 10���Դϴ�.");
						System.out.println("�ش� ��ǰ�� ������ 10���� �ʰ������Ƿ� �ִ� ������ 10���� ����˴ϴ�.");
						c.cnt = 10;
					}
					else {
						c.cnt += proNum; // ������ ��ǰ ��ȣ ������ ��ǰ ������ �߰�
					}
				}
			}
			if(!sameID) { // ������ ��ǰ ��ȣ�� ������ mycart ����Ʈ�� ���� �߰�
				mycart.add(cart);
			}
			
			System.out.println("�������� ��ǰ�� �� ���� �Ͻðڽ��ϱ�?");
			System.out.print("�� ���Ÿ� ���Ͻø� Y, �׸� �����ϽǷ��� N�� �Է��� �ֽʽÿ�.>>> ");
			String state = sc.next();
			if(state.equals("N") || state.equals("n")) {
				break;
			}
			else if(state.equals("Y") || state.equals("y")) {
				continue;
			}
		}
	}
	// ��ٱ��Ͽ� ���� ��ǰ ���
	void printCart() {
		int sumPrice = 0;
		for(Cart c : mycart) {
			for(Product p : product) { // in ShopProduct
				if(c.productID == p.getProductID()) { // productID ���� ��ǰ
					int itemPrice = c.cnt * p.getPrice();
					System.out.println(c.toString() + 
							", ��ǰ�̸�: " + p.getProductName() + 
							", �հ�ݾ�: " + itemPrice);
					sumPrice += itemPrice;
				}
			}
		}
		System.out.println("��ü ���� �ݾ�: " + sumPrice);
	}
}
