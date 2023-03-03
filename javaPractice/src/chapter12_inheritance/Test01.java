package chapter12_inheritance;

class Car{
	String maker;
	String model;
	String color;
	
	Car(){
		
	}
	
	public Car(String maker, String model, String color, int curSpeed) {
		super();
		this.maker = maker;
		this.model = model;
		this.color = color;
		this.curSpeed = curSpeed;
	}

	int curSpeed;
	
	void speedUp() {
		curSpeed += 10;
	}
	
	void speedDown() {
		curSpeed -= 10;
	}	
}

class SportCar extends Car{
	public SportCar(String maker, String model, String color, int curSpeed) {
		super(maker, model, color, curSpeed);
		// TODO Auto-generated constructor stub
	}

	@Override
	void speedUp() {
		// TODO Auto-generated method stub
		curSpeed += 20;
	}

	@Override
	void speedDown() {
		// TODO Auto-generated method stub
		curSpeed -= 20;
	}
	
}

public class Test01 {

	public static void main(String[] args) {
		Car c1 = new Car("메이커1", "모델1", "색상1", 0);
		Car c2 = new Car("메이커2", "모델2", "색상2", 0);
		Car c3 = new Car("메이커3", "모델3", "색상3", 0);
	}

}
