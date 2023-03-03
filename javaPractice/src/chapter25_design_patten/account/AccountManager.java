package chapter25_design_patten.account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	
	private ArrayList<Account> list;
	private Scanner sc;
	
	final String ACCOUNT = "계좌 번호: ";
	final String NAME = "이름: ";
	final String DEPOSITE_MONEY = "입금액: ";
	final String WITHDRAW_MONEY = "출금액: ";
	
	final String MAKE_ACCOUNT_SUCCESS = "계좌가 개설되었습니다.";
	
	final String DEPOSIT_SUCCESS = "입금이완료 되었습니다.";
	final String FIND_ACCOUNT_FAIL = "해당 계좌번호가 존재하지 않습니다.";
	
	final String WITHDRAW_FAIL = "잔액이 부족합니다.";
	final String WITHDRAW_SUCCESS = "출금완료 되었습니다.";
	
	
	public AccountManager() {
		list = new ArrayList<Account>();
		sc = new Scanner(System.in);
	}
	
	void makeAccount() {
		Account account = new Account();
			
		System.out.print(ACCOUNT);
		account.setId(sc.nextInt());
		
		System.out.print(NAME);
		account.setName(sc.next());
		
		System.out.print(DEPOSITE_MONEY);
		account.setBalance(sc.nextLong());
		
		list.add(account);
		
		System.out.println(MAKE_ACCOUNT_SUCCESS);
		System.out.println(list.toString() + "\t");
		
	}
	
	void deposit() {
		System.out.print(ACCOUNT);
		int id = sc.nextInt();
		
		System.out.print(DEPOSITE_MONEY);
		long money = sc.nextLong();

		//해당 계좌 찾기
		findAccount(id,money,"deposit");
		
	}
	
	void withdraw() {
		System.out.print(ACCOUNT);
		int id = sc.nextInt();
		
		System.out.println(WITHDRAW_MONEY);
		long money = sc.nextLong();
		
		//해당 계좌 찾기
		findAccount(id,money,"withdraw");
		
	}
	
	void inquire() {//잔액 조회
		System.out.print(ACCOUNT);
		int id = sc.nextInt();
		
		// 해당 계좌 찾기
		findAccount(id,-1,"inquire");
	}
	
	void display() {// 출력
		for(Account account : list) {
			System.out.println(account);
		}
	}
	
	//강사님은 money를 여기서 받았다.
	private void findAccount(int id, long money, String service) {
		for(Account account : list) {
			boolean isFind = false;
			switch(service) {
				case "deposit":
					if(account.getId() == id) {
						account.setBalance(money + account.getBalance());
						System.out.println(DEPOSIT_SUCCESS);
						isFind = true;
						break;
					}
				case "withdraw":
					if(account.getId() == id) {
						if(account.getBalance() < money) {
							System.out.println(WITHDRAW_FAIL);
							isFind = true;
							break;
						}else{
							account.setBalance(account.getBalance() - money);
							System.out.println(WITHDRAW_SUCCESS);
							isFind = true;
							break;
						}
					}
				case "inquire":
					if(account.getId() == id) { //동일한 계좌가 있다면
						System.out.println(account);
						isFind = true;
						System.out.println(isFind == true);
						break;
					}
				if(isFind == true) {
					return;
				}
			}
		}
		System.out.println(FIND_ACCOUNT_FAIL);
	}
}
