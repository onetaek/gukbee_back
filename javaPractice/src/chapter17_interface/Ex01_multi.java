package chapter17_interface;

interface Buy {
	void buy();

	default void order() {
		System.out.println("구매 주문");
	};
}

interface Sell {
	void sell();

	default void order() {
		System.out.println("판매 주문");
	};
}

class Customer implements Buy,Sell{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		
	}

	//인터페이스에있는 같은 이름의 default메소드가있을때 해결하는 방법이 두가지있다.
	//1. 오버라이딩
	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("고객 판매 주문");
	}
	//2. 
	
}

public class Ex01_multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		buyer.order();
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell(); 
		}
		customer.order();
	}

}
