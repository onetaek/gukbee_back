package chapter04_control2;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 10;
		int sum = 0;
		while(num > 0) {
			System.out.println("숫자를 입력하시오. 종료하고싶으면 음수를 입력하시오.");
			num = sc.nextInt();
			if(num >= 0) {
				sum += num;
			}
		}
		System.out.println("합계: "+sum);
	}

}
