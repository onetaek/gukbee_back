package chapter07_class;

class Car{
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;
	
	void power() {
		powerOn = !powerOn;
	}
	void speedUp() {
		speed++;
	}
	void speedDown() {
		speed--;
	}
	void wiper() {
		wiperOn = !wiperOn;
	}
}


public class Ex01 {

	public static void main(String[] args) {
		Car car = new Car();
		

	}

}
