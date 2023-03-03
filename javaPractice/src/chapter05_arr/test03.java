package chapter05_arr;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0 ;
		int[] scores = null;
		int sum = 0;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("----------------");
			System.out.println("1.학생수 입력 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------");
			System.out.print("선택> ");
			int selectNum = Integer.parseInt(sc.nextLine());
			if(selectNum==1) {
				System.out.print("학생수를 입력하시오.");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
			}else if(selectNum ==2) {
				for(int i = 0 ; i < scores.length ; i++) {
					System.out.print((i+1)+"번째 학생의 점수를 입력하시오.");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}else if(selectNum == 3) {
				for(int i = 0 ; i < scores.length ;i++) {
					System.out.println((i+1)+"번째 학생의 점수: "+scores[i]);
				}
			}else if(selectNum == 4) {
				sum = 0;
				max = 0;
				for(int i = 0 ; i < scores.length ; i++) {
					sum += scores[i];
					if(scores[i] > max) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수: "+max+" 평균 :"+sum/scores.length);
			}else if(selectNum == 5) {
				run = false;
				System.out.println("시스템을 종료합니다");
			}else {
				
			}
		}
	}

}
