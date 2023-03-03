package chapter14_Polymorphism;

class Parent{
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	int x = 200;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("super.x = "+ super.x);
		System.out.println("this.x = "+this.x);
	}
	
}

public class Test07 {
	public static void main(String[] args) {
		Parent parent = new Child();
		Child child = new Child();
		
		//참조 변수 우선
		//System.out.println("p.x = " + parent.x);
		//오버라이딩 우선
		parent.method(); //Child Method
		
		//참조 변수 우선
		//System.out.println("c.x = " + child.x);
		//오버라이딩 우선
		child.method(); //Child Method
	}

}
