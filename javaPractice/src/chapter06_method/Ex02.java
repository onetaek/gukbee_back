package chapter06_method;

import java.util.Scanner;

public class Ex02 {
	static int max(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 a: ");
		int a = sc.nextInt();
		System.out.println("정수 b: ");
		int b = sc.nextInt();
		System.out.println("정수 c: ");
		int c = sc.nextInt();

		System.out.println("최대값은 " + max(a, b, c) + "입니다.");
		sc.close();
	}

}
