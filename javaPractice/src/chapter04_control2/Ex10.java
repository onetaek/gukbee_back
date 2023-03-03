package chapter04_control2;

public class Ex10 {

	public static void main(String[] args) {
		int[] student = new int[5];
		System.out.println("현재 자동으로 초기화된 값:" + student[0]);

		student[0] = 30;
		student[1] = 20;
		student[2] = 10;

		System.out.println("현재 첫 번째 요소의 값:" + student[0]);
	}

}
