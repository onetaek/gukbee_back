package chapter15_abstract;

abstract class Calculator{
	protected int num1;
	protected int num2;
	abstract int calc();
}

class MyCalculator extends Calculator{
	@Override
	int calc() {
		return num1 + num2;
	}
	void printResult() {
		System.out.println("calc() 연산의 결과는 "+calc()+"입니다.");
	}
}

public class Test02 {
	public static void main(String[] args) {
		MyCalculator myCalc = new MyCalculator();
		myCalc.num1 = 10;
		myCalc.num2 = 20;
		myCalc.printResult();
	}
}
