package chapter07_class;

public class Ex07 {

	public static void main(String[] args) {
		Account chulsoo = new Account("철수","123456",1000);
		Account younghee = new Account("영희","654321",200);
		
		chulsoo.minusBalance(200);
		younghee.plusBalance(100);
		
		chulsoo.printAcountInfo();
		younghee.printAcountInfo();
	}

}

class Account{
	private String name;
	private String num;
	private int balance;
	
	public Account(String name, String num, int balance) {
		this.name = name;
		this.num = num;
		this.balance = balance;
	}
	
	public void plusBalance(int money) {
		balance = balance + money;
	}
	public void minusBalance(int money) {
		balance = balance - money;
	}
	public void printAcountInfo() {
		System.out.println("■ "+name+"의 계좌");
		System.out.println("   계좌명의 : "+name);
		System.out.println("   계좌번호 : "+num);
		System.out.println("   예금잔고 : "+balance);
	}
	
	
}