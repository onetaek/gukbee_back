package chapter04_control2;

public class Ex09 {

	public static void main(String[] args) {
		// 0~100까지의 홀수만 더함
		int total = 0;
//		for (int num = 0; num <= 100; num++) {
//			if (num % 2 == 0)
//				continue;
//			total += num;
//		}
		for (int num = 1; num <= 100; num += 2 ) {
			total += num;
		}
		System.out.println("total: " + total);
	}

}
