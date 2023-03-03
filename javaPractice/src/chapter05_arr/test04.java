package chapter05_arr;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("======랜덤 조원 뽑기=======");
		
		
		boolean isDuplicated = false;
		String[] arr = {"김대환","김정원","김준혁","김지혜","김혜현","박기훈","박성민","박소희","박정혜","박준휘","배규","손하늘","신용환",
				"오범수","오원택","오해준","유수현","육승민","이기행","이성호","이승재","이영주","장명규","장윤영","주민석","최현지","황희윤"
		};
		int[] idxArr = new int[arr.length];
		String[] randArr = new String[arr.length];
		
		for(int i = 0 ; i < idxArr.length ; i++) {
			int rand = (int) Math.ceil(Math.random()*arr.length);
			if(i==0)idxArr[i] = rand;
			else {
				for(int j = 0 ; j < i ; j++) {
					if(idxArr[j]==rand) {
						isDuplicated = true;
						break;
					}
				}
				if(isDuplicated == true)i--;
				else {
					idxArr[i] = rand;
				}
				isDuplicated = false;
			}
			
		}
		for(int i = 0 ; i < randArr.length ; i++) {
			randArr[i] = arr[idxArr[i]-1];
		}
		System.out.print("<랜덤 조원>");
		int n = 1;
		for(int i = 0 ; i < randArr.length; i++) {
			if((i%3)==0) {
				System.out.println("");
				System.out.println("-------------------");
				System.out.print(n+"조: ");
				n++;
			}
			System.out.print(randArr[i]+"님 ");
		}
		input.close();

	}

}
