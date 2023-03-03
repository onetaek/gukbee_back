package chapter04_control2;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while (num >= 0) {
			sum += num;
			System.out.println("정수를 입력하세요");
			num = input.nextInt();
		}
		System.out.println("sum: " + sum);
	}
}