package chapter05_arr;

public class test01 {

	public static void main(String[] args) {
		int[][]arr= {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total = 0;
		int cnt =0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				cnt++;
				total += arr[i][j];
			}
		}
		
		float average = (float)total/cnt;
		System.out.println("total = "+total);//325
		System.out.println("average = "+average);//16.25
	}

}
