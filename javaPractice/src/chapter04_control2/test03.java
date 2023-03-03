package chapter04_control2;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		while(true) {
			System.out.println("정수를 입력하시오.종료하려면 음수를 입력하시오.");
			int num = sc.nextInt();
			if(num < 0) break;
			cnt++;
			sum += num;
		}
		System.out.println("지금껏 입력한 정수의 평균: "+(float)sum/cnt);
	}

}
