package chapter06_method;

public class Ex06_overloading {

	public static void main(String[] args) {
		printGreet();
		printGreet("안녕~!");
		printGreet("원택","해위!");
		printGreet(10);
	}

	public static void printGreet() {
		System.out.println("printGreet()실행");
		System.out.println("원택!");
	}

	public static void printGreet(String greeting) {
		System.out.println("printGreet(String greeting)실행");
		System.out.println("원택! "+greeting);
	}

	public static void printGreet(String name, String greeting) {
		System.out.println("printGreet(String name, String greeting)실행");
		System.out.println(name+greeting);
	}

	public static void printGreet(int greeting) {
		System.out.println("printGreet(int greeting)실행");
		System.out.println(greeting);
	}

}
