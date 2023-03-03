package chapter04_control2;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		for(String answer = "Y"; answer.equals("Y") || answer.equals("y"); ) {
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer = input.nextLine();
			if(answer.equals("Y") || answer.equals("y")) {
				System.out.println("음악을 "+(++count)+"번 재생했습니다.");
			}
		}
		System.out.println("재생종료");
	}

}
