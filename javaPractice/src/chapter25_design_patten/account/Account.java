package chapter25_design_patten.account;

public class Account {
	private int id;//계좌
	private String name; //이름
	private long balance;//잔액
	public Account() {
	}
	
	public Account(int id, String name, long balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

//	@Override
//	public String toString() {
//		return "Account{" + "id=" +id + ", name='" + name + '\'' + ", balance=" + balance + '}';
//	}
	
	@Override
	public String toString() {
		return  this.getId() + "\t" + this.getName() + "\t" + this.getBalance();
	}
	
	
}
