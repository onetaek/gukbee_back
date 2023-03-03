package chapter14_Polymorphism;

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, 부릉부릉");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Car car;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		
		fe.water();
		car = fe;
//		car.water();
		fe2 = (FireEngine)car;
		fe2.water();
		
		
	}

}
