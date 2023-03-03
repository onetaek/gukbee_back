package chapter22_login_shop;

import java.util.Scanner;

public class ShopCart{
	
	Scanner sc = new Scanner(System.in);
	ShopProduct sp = new ShopProduct();
	Product[] product = sp.getProduct();
	
	
	/*
	void selectProduct(){
		
		boolean isYes = true;
		while(isYes) {
			System.out.print("구매할 상품의 번호를 입력해 주십시요.>>");
			int num = sc.nextInt();
			
			System.out.print("상품의 구매 갯수를 입력해 주십시요.>>");
			int cnt = sc.nextInt();
			for(int i = 0 ; i < product.length ; i++) {
				if(num == product[i].getProductID()) {
					product[i].plusCount(cnt);
				}
			}
			System.out.print("더 구매를 원하시면Y, 그만 쇼핑하실려면 N을 입력해 주십시요.>>>");
			String sel = sc.next();
			if(sel.equals("Y")) {
				isYes = true;
			}else {
				isYes = false;
			}
			System.out.println();
		}
	}
	*/
	Cart[] cart = new Cart[10];
	int idx= 0;
	void selectProduct(){
		
		boolean isYes = true;
		while(isYes) {
			System.out.print("구매할 상품의 번호를 입력해 주십시요.>>");
			int num = sc.nextInt();
			
			System.out.print("상품의 구매 갯수를 입력해 주십시요.>>");
			int cnt = sc.nextInt();
			for(int i = 0 ; i < product.length ; i++) {
				if(num == product[i].getProductID()) {
					cart[idx++] = new Cart(product[i].getCount(),cnt);
				}
			}
			System.out.print("더 구매를 원하시면Y, 그만 쇼핑하실려면 N을 입력해 주십시요.>>>");
			String sel = sc.next();
			if(sel.equals("Y")) {
				isYes = true;
			}else {
				isYes = false;
			}
			System.out.println();
		}
	}
	
	
	void printCart() {
//		for(int i = 0 ; i < product.length; i++) {
//			System.out.println("상품 번호: "+product[i].getProductID()+
//					", 갯수:" +product[i].getCount());
//		}
		System.out.println(cart);
	}
}
