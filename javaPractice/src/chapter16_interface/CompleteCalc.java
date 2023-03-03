package chapter16_interface;

public class CompleteCalc extends Calculator{
	/*
	 * Calc.java, Calculator.java, CompleteCalc.java를 통해 보여주고 싶은 것은
	인터페이스를 상속받은 추상 클래스가있고 이때 추상클래스가 인터페이스에 있는 메소드중
	일부분만 구현을했다면 추상클래스를 상속받는 클래스는 추상클래스에서 구현하지 않은 인터페이스의
	메소드를 구현해야한다.
	*/
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}else {
			return Calc.ERROR;
		}
	}
	
	public void showIndo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
}
