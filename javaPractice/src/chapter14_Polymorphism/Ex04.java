package chapter14_Polymorphism;

import java.util.ArrayList;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "오디오";
	}
}

//class Buyer{
//	int money = 1000;
//	int bonusPoint = 0;
//	
//	Product[] item = new Product[10];
//	int i = 0;
//	
//	void buy(Product p ) {
//		if(money < p.price) {
//			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
//			return;
//		}
//		
//		money -= p.price;
//		bonusPoint += p.bonusPoint;
//		item[i++] = p;
//		System.out.println(p+" 을/를 구입하셨습니다.");
//	}
//	
//	void summary() {
//		int sum = 0;
//		String itemList ="";
//		
////		for(int i = 0 ; i < item.length ; i++) {
////			if(item[i]!=null) {
////				sum += item[i].price;
////				itemList += item[i]+", ";
////			}
////		}
//		for(Product p : item) {
//			if(p!=null) {
//				sum += p.price;
//				itemList += p+", ";				
//			}
//		}
//		itemList = itemList.substring(0, itemList.length() - 2);
//		
//		System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
//		System.out.println("구입하신 제품은 "+itemList + " 입니다.");
//	}
//}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	ArrayList item = new ArrayList();

	void buy(Product p) {
		
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + " 을/를 구입하셨습니다.");
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"을/를 반품하셨습니다");
		}else {
			System.out.println("구입하신 제품 중 해당 제품이 업습니다.");
		}
	}
	void summary() {
		
		int sum = 0;
		String itemList ="";
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다");
			return;
		}
		for(int i = 0 ; i < item.size();i++) {
			
			Product p = (Product) item.get(i);
			sum+=p.price;
			itemList += (i==0) ? ""+p : ", "+p;
		}
		System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
		System.out.println("구입하신 제품은 "+itemList + " 입니다.");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Product p1 = new Tv();
		Product p2 = new Computer();
		Product p3 = new Audio();

		b.buy(p1);
		b.buy(p2);
		b.buy(p3);

		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다.");
		System.out.println("-----------------------");
		
		b.refund(p2);
		b.summary();
	}

}
