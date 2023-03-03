package chapter03;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * 논리 연산자 2항 연산자이고, 항은 boolean 값이고 결과도 boolean
		 */
		int a = 10;
		System.out.println(5 < a && a < 15);//true && true -> true
		System.out.println((5 < a && a < 15) && a % 2 == 0);// true && true -> true

		a = 4;
		System.out.println((5 < a && a < 15) && a % 2 == 0);// false && true -> false
		System.out.println((5 < a && a < 15) || a % 2 == 0);// false || true -> true

	}

}
