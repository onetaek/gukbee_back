package chapter05_arr;

public class test02 {

	public static void main(String[] args) {
		int[][]array= {
				{ 95, 86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int total = 0;
		int cnt =0;
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < array[i].length ; j++) {
				cnt++;
				total += array[i][j];
			}
		}
		
		float average = (float)total/cnt;
		System.out.println("total = "+total);//881
		System.out.println("average = "+average);//88.1
		
	}

}
