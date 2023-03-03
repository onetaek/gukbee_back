package chapter09_overloading;

class Printer2 {
	static void println(int value) {
		System.out.println(value);
	}

	static void println(boolean value) {
		System.out.println(value);
	}

	static void println(double value) {
		System.out.println(value);
	}

	static void println(String value) {
		System.out.println(value);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Printer2.println(10);
		Printer2.println(true);
		Printer2.println(5.7);
		Printer2.println("홍길동");
	}

}
