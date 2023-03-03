package chapter10_constructer;

public class Car {
	String color;
	String gearType;
	int door;

	Car() {
		this("white", "auto", 4);
	}
	
	Car(String color){
		this(color,"auto",4);
	}
	
	Car(Car c){//값을 복사하기위한 생성자(그냥 =으로 복사하면 주소가 복사됨)
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}
