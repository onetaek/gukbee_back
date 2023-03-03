package chapter04_control2;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[4];
		int sum = 0;
		for(int i = 0 ; i < numArr.length ; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요: ");
			numArr[i] = sc.nextInt();
			sum += numArr[i];
		}
		System.out.println("합계: "+sum);
	}
}
