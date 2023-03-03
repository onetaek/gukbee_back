package chapter10_constructer;

import java.util.Scanner;

public class Test06_Account {
	
	static Scanner sc = new Scanner(System.in);
	static Account[] accountArray = new Account[100];
	static int accountCnt = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.입금|4.출금|5.종료");
			System.out.println("----------------------------------");
			
			System.out.print("선택> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				createAccount();
			}else if(num ==2) {
				//계좌목록보기
				accountList();
			}else if(num ==3) {
				//예금하기
				deposit();
				
			}else if(num ==4){
				//출금하기
				withdraw();
			}else if(num==5) {
				System.out.println("종료하겠습니다.");
				sc.close();
				break;
			}
		}
		
		
	}
	
	private static void createAccount() {
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("계좌생성을 선택하였습니다. 아래에 정보를 입력하시오");
		System.out.println("------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = sc.next();
		
		System.out.print("계좌주: ");
		String owner = sc.next();
		
		System.out.print("초기입금액:" );
		int balance = sc.nextInt();
		
		Account newAcount = new Account(ano,owner,balance);
		for(int i = 0 ; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAcount;
				++accountCnt;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0 ; i < accountArray.length;i++) {
			if(accountArray[i]!=null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	
	private static void accountList() {
		for(int i = 0 ; i < accountCnt; i++) {
			System.out.println("------------------------");
			System.out.println("예금주명: "+accountArray[i].getOwner()+"님");
			System.out.println("계좌번호: "+accountArray[i].getAno());
			System.out.println("잔액: "+accountArray[i].getBalance()+"원");
			System.out.println("------------------------");
			
		}
	}
	
	private static void deposit() {
		System.out.println("---------------------------------");
		System.out.println("입금을 선택하셨습니다. 아래의 정보를 입력하시오");
		System.out.println("---------------------------------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("예금액: ");
		int balance = sc.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("없는 계좌입니다.");
		}else {
			account.addBalance(balance);
			System.out.println("입금이 완료되었습니다");
		}
		
		
	}
	
	private static void withdraw() {
		System.out.println("---------------------------------");
		System.out.println("출금을 선택하셨습니다. 아래의 정보를 입력하시오");
		System.out.println("---------------------------------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("출금액: ");
		int balance = sc.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("없는 계좌입니다.");
		}else {
			account.minBalance(balance);
			System.out.println("출금이 완료되었습니다.");
		}
		
		
	}
	
}
