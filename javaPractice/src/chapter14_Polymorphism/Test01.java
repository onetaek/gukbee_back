package chapter14_Polymorphism;

class Employee{
	public int baseSalary = 3000000;//기본급
	int getSalary() {
		return baseSalary;
	}	
}

class Manager extends Employee{
	int getSalary() {
		return baseSalary + 2000000;
	}
}

class Programer extends Employee{
	int getSalary() {
		return baseSalary + 3000000;
	}
}

public class Test01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		System.out.println("관리자의 월급 : "+manager.getSalary());
		
		Programer programer = new Programer();
		System.out.println("프로그래머의 월급 : "+ programer.getSalary());
	}
}
