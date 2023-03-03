package chapter12_inheritance;

class Car2{
	int wheel;
	int speed;
	String color;
	
	public Car2(String color) {
		this.color = color;
	}
}

class SportsCar extends Car2{
	int speedLimit;
	
	public SportsCar(String color , int speedLimit) {
		super(color);
		this.speedLimit = speedLimit;
		// TODO Auto-generated constructor stub
	}
	
}

public class Test02 {

	public static void main(String[] args) {
		SportsCar sc = new SportsCar("red",330);
		
		System.out.println(sc.color);
		System.out.println(sc. speedLimit);
	}

}
