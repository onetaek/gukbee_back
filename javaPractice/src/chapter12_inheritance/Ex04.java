package chapter12_inheritance;

class Parent{
	int x = 10;
	
}

class Child extends Parent{
	void method() {
		System.out.println("x = "+x);
		System.out.println("this.x = "+this.x);
		System.out.println("super.x = "+super.x);
	}
}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
		
	}

}
