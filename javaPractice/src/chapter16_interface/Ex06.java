package chapter16_interface;

interface Buy {
	void buy();

	void info();
}

interface Sell {
	void sell();

	void info();
}

class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("구매하기");
	}

	@Override
	public void buy() {
		System.out.println("판매하기");
	}

	// 두 인터페이스에 이름이 같은 메서드가 선언되었다고 해도 구현은 클래스에서 이루어 지므로,
	// 어떤 메서드를 호출해야 하는지 모호하지 않음
	@Override
	public void info() {
		// TODO Auto-generated method stub
	}
	/**
	 * 7이하에서는 default 메소드가 지원되이 않기때문에 문제가 없었다. c++의 경우에는 다중상속을 지웠했는데 자바에서는 지원안한다.
	 * 인터페이스는 지원이 되는데 인터페이스에는 변수가 메소드에 아무것도 구현되지 않았기 때문에 상관이없다.
	 */
}

public class Ex06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		Buy buyer = customer;
		buyer.buy();
//		 buyer.sell();

//				Customer 클래스형인 customer를 Sell 인터페이스인 seller에 대입하여 형 변환.
		// seller는 Sell인터페이스의 메서드만 호출 가능.
		Sell seller = (Sell) customer;// (Sell)생략가능
		seller.sell();
		// seller.buy();

		if (seller instanceof Customer) {
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell();
		}
	}
}
