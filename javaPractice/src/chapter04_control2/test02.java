package chapter04_control2;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sum = 0;
		int num;
		do {
			System.out.println("정수를 입력하세요");
			num = input.nextInt();
			if (num >= 0)
				sum += num;                                                                                                                                                                                                                                                                                   
		} while (num >= 0);
		System.out.println("sum: " + sum);

	}

}
