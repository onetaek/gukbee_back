package chapter04_control;

import java.util.Scanner;

public class Etc07 {

	public static void main(String[] args) {
		// 세 정수의 최대값구하기
		Scanner input = new Scanner(System.in);

		System.out.print("정수 a: ");
		int a = input.nextInt();
		System.out.print("정수 b: ");
		int b = input.nextInt();
		System.out.print("정수 c: ");
		int c = input.nextInt();

		int max = a;
		int min = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
