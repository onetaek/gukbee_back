package chapter10_constructer;

class Cellphone{
	String model = "Galaxy 10";
	String color;
	int capacity;
	Cellphone(){}
	Cellphone(String color, int capacity){
		this.color = color;
		this.capacity = capacity;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//Cellphone cp1 = new Cellphone();
		Cellphone cp2 = new Cellphone("Silver",64);
		
		System.out.println(cp2.model);
		System.out.println(cp2.color);
		System.out.println(cp2.capacity);
	}

}
