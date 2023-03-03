package chapter04_control;

import java.util.Scanner;

public class Etc10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("월을 입력해 주세요 >>>");
		int month = input.nextInt();
		int day;
		
		switch(month) {
		case 1: case 3: case 7: case 8: case 10: case 12: 
			day =31;
			break;
		case 4: case 6: case 9: case 11: 
			day =30;
			break;
		case 2: 
			day =28;
			break;
		default: 
			day =0;
			System.out.println("존재하지 않는 달 입니다.");
			break;
		}
		System.out.println(month+"월은 "+day+"까지 있습니다.");
		input.close();
	}

}
