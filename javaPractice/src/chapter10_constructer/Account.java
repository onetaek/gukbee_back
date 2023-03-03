package chapter10_constructer;

public class Account {
	private String ano;//계좌번호
	private String owner;//계좌주
	private int balance;//잔액
	
	public Account() {};
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void addBalance(int balance) {
		this.balance += balance;
	}
	public void minBalance(int balance) {
		this.balance -= balance;
	}
	
	
}
