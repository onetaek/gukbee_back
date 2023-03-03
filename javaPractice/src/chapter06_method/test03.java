package chapter06_method;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("좌하변이 직각인 직각삼각형을 표시하니다.");
		System.out.print("몇 단: ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++ ) {
			putStars(i,n);
			System.out.println();
		}
		
	}

	private static void putStars(int i, int n) {
		/* ex) 4단
		   *
 		  **
		 ***
		****
		
		*/
		for(int j = n ; j >= 1 ; j--) {
			if(j > i) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
			
		}
		
	}
	

}
