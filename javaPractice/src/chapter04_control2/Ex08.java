package chapter04_control2;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num;
		while (true) {
			System.out.println("더할 숫자를 입력하세요:(종료하려면 0입력)");
			num = sc.nextInt();
			if (num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println("현재까지의 총합:  " + sum);
	}

}
