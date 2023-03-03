package chapter06_method;

public class Ex08 {

	public static void main(String[] args) {
		System.out.println("main시작");
		firstMethod();
		System.out.println("main끝");
	}

	private static void firstMethod() {
		System.out.println("firstMethod시작");
		secondMethod();
		System.out.println("firstMethod끝");
		
	}

	private static void secondMethod() {
		System.out.println("secondMethod시작");
		System.out.println("secondMethod끝");
		
	}

}
