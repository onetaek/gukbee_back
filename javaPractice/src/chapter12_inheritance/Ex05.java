package chapter12_inheritance;

class Parent2{
	Parent2(){
		System.out.println("Parent2 생성자");
	}
	int x= 10;
}

class Child2 extends Parent2{
	Child2(){
		System.out.println("Child2 생성자");
	}
	int x = 20;
	void method() {
		int x= 30;
		System.out.println("x = " + x);
		System.out.println("this.x = "+ this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Child2 c2 = new Child2();
		c2.method();
	}

}
