package chapter11_singleton;

public class Account {
	static int balance;
	private static Account a;

	Account() {

	}

	static Account getInstance() {
		if (a == null) {
			a = new Account();
		}
		return a;
	}
	
	static void setBalance(int money) {
		balance -= money;
	}
	static int getBalance() {
		return balance;
	}
}
