package chapter12_inheritance;

class MyParent{
	void pDisplay() {
		System.out.println("부모 클래스: 부모 메소드");
	}
}

class MyChild extends MyParent{
	
	@Override
	void pDisplay() {
		super.pDisplay();
		System.out.println("자식클래스: 부모클래스의 메서드를 오버라이딩");
	}

	public void cDisplay() {
		System.out.println("자식 클래스: 자식의 메소드");
	}
}

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChild c = new MyChild();
		c.pDisplay();
	}

}
