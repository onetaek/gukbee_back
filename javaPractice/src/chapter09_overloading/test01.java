package chapter09_overloading;

public class test01 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		mm.a = 10;
		mm.b = 3;
		int result1 = mm.add();
		int result2 = mm.subtract();
		int result3 = mm.multiply();
		double result4 = mm.divide();
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		System.out.println("result4: "+result4);
	}

}

class MyMath{
	int a;
	int b;
	int add() {
		return this.a + this.b;
	}
	int subtract() {
		return this.a - this.b;
	}
	int multiply() {
		return this.a * this.b;
	}
	double divide() {
		return this.a / this.b;
	}
	//오버로딩은 static을줘도 매개변수의 타입 또는 매개변수의 갯수로만 판별한다.
	//ex) int add(int a, int b)를 하면 매개면수의 갯수와 타입이 같으므로
	//    오류가 뜬다.
	static int add(int a, int b) {
		return a+b;
	}
	static int subtract(int a, int b) {
		return a+b;
	}
	static int multiply(int a, int b) {
		return a+b;
	}
	static int divide(int a, int b) {
		return a+b;
	}
	
}