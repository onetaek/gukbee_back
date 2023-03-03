package chapter22_login_shop;

public class Cart {
	int productID, cnt;
	Cart(int productID, int cnt){
		this.productID = productID;
		this.cnt = cnt;
	}
	
	public String toString() {
		return "상품번호: "+productID + ", 갯수: "+cnt;
	}
}
