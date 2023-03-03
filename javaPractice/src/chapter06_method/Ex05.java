package chapter06_method;

public class Ex05 {

	public int add(int a, int b) {
		int c= a+b;
		return c;
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int result = 0;
		
		Ex05 ex = new Ex05();
		result = ex.add(num1,num2);
	}

}
