package myChapter;

import java.util.Scanner;

public class myTry {

	public static void main(String[] args) {
		System.out.println((double)26/36*100);
		
		int a;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("숫자를 입력하시오.");
			a = Integer.parseInt(sc.next());
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
			System.out.println("숫자를 입력하시오.");
			a = Integer.parseInt(sc.next());
		}
		

	}

}
