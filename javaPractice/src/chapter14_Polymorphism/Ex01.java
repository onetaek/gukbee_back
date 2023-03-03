package chapter14_Polymorphism;

class A{
	A(){
		System.out.println("A 생성자 실행");
	}
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A{
	B(){
		System.out.println("B 생성자 실행");
	}
	void methodB() {
		System.out.println("methodB");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		A obj = new B();
		obj.methodA();
//		obj.methodB();
		
		B obj1 = new B();
		obj1.methodB();
		
		A obj2 = obj1;
//		obj2.methodB();
		
		System.out.println("---------------------------------");
		
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("fe는 FireEngine의 instance가 맞다.");
		}
		if(fe instanceof Car) {
			System.out.println("fe는 Car의 instance가 맞다.");
		}
		if(fe instanceof Object) {
			System.out.println("fe는 Object의 instance가 맞다.");
		}
		System.out.println("---------------------------------");
		
		Car ployfe = new FireEngine();
		
		if(ployfe instanceof FireEngine) {
			System.out.println("ployfe는 FireEngine의 instance가 맞다.");
		}
		if(ployfe instanceof Car) {
			System.out.println("ployfe는 Car의 instance가 맞다.");
		}
		if(ployfe instanceof Object) {
			System.out.println("ployfe는 Object의 instance가 맞다.");
		}
		System.out.println("---------------------------------");
		
		Car car = new Car();
		
		if(car instanceof FireEngine) {
			System.out.println("car는 FireEngine의 instance가 맞다.");
		}
		if(car instanceof Car) {
			System.out.println("car는 Car의 instance가 맞다.");
		}
		if(car instanceof Object) {
			System.out.println("car는 Object의 instance가 맞다.");
		}
		System.out.println("---------------------------------");
	}

}
