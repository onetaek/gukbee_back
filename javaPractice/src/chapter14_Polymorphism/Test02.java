package chapter14_Polymorphism;

class Circle{
	protected int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
}

class Pizza extends Circle{
	String type;
	public Pizza(String type,int radius) {
		super(radius);
		this.type = type;
	}
	void print() {
		System.out.println("피자의 종류: "+type+", 피자의 크기: "+radius);
	}
	
}

public class Test02 {
	public static void main(String[] args) {
		Pizza pizza = new Pizza("고르곤졸라",10);
		pizza.print();
	}
}
