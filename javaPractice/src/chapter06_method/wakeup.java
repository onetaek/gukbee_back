package chapter06_method;

import java.util.Random;
import java.util.Scanner;

public class wakeup {

	static Scanner stdIn = new Scanner(System.in);
	
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("다시 한번? <Yes-1/No-0>: ");
			cont = stdIn.nextInt();
			
		}while(cont!=0 && cont !=1);
		return cont == 1;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("암산 트레이닝!!");
		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			
			while(true) {
				System.out.print(x+"+"+y+"+"+z+"=");
				int k = stdIn.nextInt();
				if(k==x+y+z)
					break;
				System.out.println("틀렸습니다.");
			}
		}while(confirmRetry());
	}

}
