package chapter04_control2;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/*
		 * do while문을 사용해서 사용자로 부터 월의 번호를 입력받는 프로그램을 작성해 보세요. 
		 * 사용자가 올바른 월 번호를 입력할 대까지 반복을
		 * 계속합니다. 사용자가 올바른 월 번호를 입력해야만 다음 문장으로 넘어갑니다.
		 */
		Scanner input = new Scanner(System.in);
		int month;
		do {
			System.out.println("올바른 월을 입력하세요[1~12]");
			month = input.nextInt();
		}while(month < 1 || month > 12);
		System.out.println("사용자가 입력한 월은"+month+"입니다.");
	}

}
