package chapter24_collection.Stack;

import java.util.Stack;

class Coin{
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}


public class MyStack_02 {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : "+coin.getValue()+"원");
		}
	}
}
