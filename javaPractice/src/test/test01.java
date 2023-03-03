package test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountBalance = 10000;// 계좌 잔액
		int depositAmount;// 입금 금액
		int WithdrawalAmount;// 출금 금액
		System.out.println("================================");
		System.out.println("====== 은행계좌 입출금 프로그램 =======");
		System.out.println("================================");
		System.out.print("입금 금액을 입력해주십시오. ");
		depositAmount = scanner.nextInt();
		accountBalance += depositAmount;// 입금 금액을 계좌 잔액에 더하기
		System.out.println("입금하신 금액은 " + depositAmount + "원이고 잔액은 " + (accountBalance) + "원 입니다.");
		while (true) {
			System.out.println("--------------------------------");
			System.out.print("출금금액을 입력해주십시오. ");
			WithdrawalAmount = scanner.nextInt();
			if (accountBalance - WithdrawalAmount == 0) {// 잔액이 0원이라서 종료
				System.out.println("잔액이 0원이어서 거래가 종료됩니다. 감사합니다.");
				break;
			} else if (WithdrawalAmount == 0) {// 출금 금액이 0원이라 연산하지 않음
				System.out.println("0원을 입력하셨습니다. 확인하시고 다시 입력해 주십시오.");
			} else if (accountBalance < WithdrawalAmount) {// 출금 금액이 계좌잔액보다 커서 연산하지 않음
				System.out.println("잔액은 " + accountBalance + "인데 출금액이 " + (WithdrawalAmount - accountBalance)
						+ "원이 더 커서 출금이 안됩니다.");
			} else {
				accountBalance -= WithdrawalAmount;// 출금 금액을 계좌 잔액에서 빼기
				System.out.println(WithdrawalAmount + "원을 출금처리했고 잔액은 " + accountBalance + "원입니다.");
			}
		}
		scanner.close();
	}

}
