package chapter12_inheritance;

class Student2{
	void learn() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("선생님 안녕하세요!");
	}
}

class Leader extends Student2{
	void lead() {
		
	}

	@Override
	void learn() {
		// TODO Auto-generated method stub
		super.learn();
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override
	void say() {
		// TODO Auto-generated method stub
		System.out.println("선생님께 인사");
		super.say();
	}
	
}

public class Ex06 {

	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.eat();
		leader.say();
	}

}
