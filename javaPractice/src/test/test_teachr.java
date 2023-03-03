package test;

import java.util.Scanner;

public class test_teachr {

	public static void main(String[] args) {
		int money = 10000;
		System.out.println("현재 가진 돈은 "+ money + "원입니다.");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("얼마를 사용하시겠습니까? >>> ");
			int spendMoney = scanner.nextInt();
			
			if(!(spendMoney > 0  && spendMoney <= money)){
				System.out.println("다시 입력해 주세요(사용범위가 틀렸습니다.");
				continue;
			}
			money -= spendMoney;
			System.out.println("이제 "+money+"원이 남았습니다.");
			if(money == 0) {
				break;
			}
		}
		System.out.println("모든 돈을 사용합니다. 종료");
		scanner.close();
	}

}
