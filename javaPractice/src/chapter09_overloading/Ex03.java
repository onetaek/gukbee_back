package chapter09_overloading;

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}

public class Ex03 {

	public static void main(String[] args) {
		//width, height를 공통값이여서 static으로 줄 수 있다.
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
	}

}
