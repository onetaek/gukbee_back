package chapter04_control2;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "Y";
		int count = 0;
		while(answer.equals("Y")) {
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer = input.nextLine();
			if(answer.equals("Y")) {
				System.out.println("음악을 "+(++count)+"번 재생했습니다.");
			}
		}
		System.out.println("재생종료");
		input.close();
	}

}
