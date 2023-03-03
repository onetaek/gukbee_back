package myChapter;

import java.util.Scanner;

public class randomMakeTeam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("======랜덤 조원 뽑기=======");
		System.out.print("총 인원수를 입력하시오. ");
		int num = input.nextInt();
		boolean isDuplicated = false;
		String[] arr = new String[num];
		int[] idxArr = new int[num];
		String[] randArr = new String[num];
		
		System.out.print("한 조에 몇명씩 들어갈지 입력하시오. ");
		int divNum = input.nextInt();
		System.out.println("조원의 이름을 한분씩입력하시오.");
		for(int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = input.next();
		}
		for(int i = 0 ; i < idxArr.length ; i++) {
			int rand = (int) Math.ceil(Math.random()*num);
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
			if((i%divNum)==0) {
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
