package chapter06_method;

public class Ex07 {
	
	static void test(int...v) {
		System.out.println(v.length + " : ");
		for(int x : v) {
			System                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           .out.println(x+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		test(1);
		test(1,2);
		test(1,2,3);
	}

}
