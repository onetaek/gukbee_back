package chapter10_constructer;

public class Ex02 {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("blue");

		System.out.println("c1의 color=" + car1.color + ", gearType=" + 
		car1.gearType + ", door=" + car1.door);

		System.out.println("car2의 color=" + car2.color + ", gearType=" + 
		car2.gearType + ", door=" + car2.door);
	}

}
