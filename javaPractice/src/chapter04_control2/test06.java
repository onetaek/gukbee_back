package chapter04_control2;

import java.util.Random;
import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rand = (int)(Math.random()* 1000);
		System.out.println(rand);
		int my_num = -1;
		int cnt = 0;
		while(rand != my_num) {
			System.out.println("정답은? ");
			my_num = sc.nextInt();
			if (rand != my_num) {
				cnt++;
				System.out.println("틀렸습니다.");
			}
		}
		System.out.println(cnt+"번만에 정답을 맞췄습니다.");
	}

}
