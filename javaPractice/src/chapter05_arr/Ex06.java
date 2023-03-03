package chapter05_arr;

public class Ex06 {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6}
		};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("행: " + arr.length);
		System.out.println("열: " + arr[0].length);

	}

}
