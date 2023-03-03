package chapter13_inheritance_ppdr;

final class FinalClass{
	final int number = 4;
}

class Parents /*extends FinalClass 에러발생*/{
	final void finalMethod() {
		System.out.println("상속 불가한 메서드");
	}
}

class Son extends Parents{
	//void finalMethod(){} //레어발생
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
//		member1.number = 5;
	}

}
