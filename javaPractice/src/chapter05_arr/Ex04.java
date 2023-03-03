package chapter05_arr;

public class Ex04 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		for (int i = 0; i < 10000; i++) {
			int j = (int) (Math.random() * ball.length);

			int temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}

		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
	}

}
