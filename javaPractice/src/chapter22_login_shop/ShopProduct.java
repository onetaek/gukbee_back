package chapter22_login_shop;

public class ShopProduct {
	Product[] product = new Product[3];
	
	ShopProduct(){
		Product p = new Product(1, "상품1", 1111);
		product[0] = p;
		p = new Product(2, "상품2", 2222);
		product[1] = p;
		p = new Product(3, "상품3", 3333);
		product[2] = p;
	}
	
	void printProduct() {
		for(int i = 0 ; i < product.length;i++) {
			System.out.println("상품 코드: "+product[i].getProductID()
					+", 상품이름: " +product[i].getProductName()
					+", 가격: "+product[i].getPrice()
			);
		}
	}
	
	Product[] getProduct() {
		return product;
	}
	
}
