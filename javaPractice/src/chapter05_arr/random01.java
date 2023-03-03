package chapter05_arr;

import java.util.Arrays;

public class random01 {

	public static void main(String[] args) {
		int range = 6;
		int[] numbers = new int[range];//0 1 2 3 4 5
		boolean isDupli = false;
		while(range>0) {
			int rand = (int)(Math.random()*6+1);
			if(range==numbers.length) {
				numbers[range-1] = rand;//끝의 값에 무조건 넣고 인덱스 5
			}
			else {//인덱스 4~0 range 5~1
				for(int j = numbers.length-1 ; j > (range-1) ; j--) { //(5-range)
					if(numbers[j]==rand) {
						isDupli = true;
						break;
					}
				}
				if(isDupli == true) {
					range++;
				}
				else {
					numbers[range-1] = rand;
				}
				isDupli = false;
			}
			range--;
		}
		
//		for(int i = 0 ; i < numbers.length ; i++) {
//			int rand = (int)(Math.random()*45);
//			if(i==0)numbers[i] = rand;
//			else {
//				for(int j = 0 ; j < i ; j++) {
//					if(numbers[j]==rand) {
//						isDupli = true;
//						break;
//					}
//				}
//				if(isDupli == true)i--;
//				else {
//					numbers[i] = rand;
//				}
//				isDupli = false;
//			}
//			
//		}
		
		System.out.println(Arrays.toString(numbers));
	}

}
