package chapter14_Polymorphism;

class MyAnimal{
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Rabbit extends MyAnimal{

	@Override
	public String toString() {
		return "토끼";
	}
	
}

class Monkey extends MyAnimal{

	@Override
	public String toString() {
		return "원숭이";
	}
	
}

class Lion extends MyAnimal{

	@Override
	public String toString() {
		return "사자";
	}
	
}

class Zookeeper{
	void feed(MyAnimal myanimal) {
		System.out.println(myanimal + "에게 고기 주기");
	}
	
}

public class Ex03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAnimal lion = new Lion();
		MyAnimal rabbit = new Rabbit();
		MyAnimal monkey = new Monkey();
		Zookeeper james = new Zookeeper();
		james.feed(lion);
		james.feed(rabbit); 
		james.feed(monkey); 
	 
	}

}
