package chapter04_control;

public class Etc13 {

	public static void main(String[] args) {
		for(int dan = 2;dan<=9;dan++) {
			System.out.println("------<"+dan+"단>------");
			for(int times = 1 ; times <= 9 ; times++) {
				System.out.println(dan+"X"+times+"="+(dan*times));
				
			}
			System.out.println();
		}
	}

}
