package chapter04_control;

import java.util.Scanner;

public class Etc06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("계절을 표시합니다. \n몇월 입니까?: ");
		int month = input.nextInt();
		if(month >= 3&& month <= 5) {
			System.out.println(month+"월은 봄입니다.");
		}else if(month >= 6&& month <= 8) {
			System.out.println(month+"월은 여름입니다.");
		}else if(month >= 9&& month <= 11) {
			System.out.println(month+"월은 가을입니다.");
		}else if(month == 12 ||month == 1 ||month == 2 ) {
			System.out.println(month+"월은 겨울입니다.");
		}else {
			System.out.println("잘못된 입력 값입니다.");
		}
	}

}
