package chapter19_innerClass;

interface Anony{
	public void print();
}


public class Ex07 {
	
	public void printB(Anony a) {//인터페이스 Anony타입의 객체를 매개변수로 받는 메서드
		a.print();
	}
	/*
	 * 필요할 때마다 인터페이스를 내부 클래스의 인스턴스로 만들어서 동적으로 추상메서드를 구현한 후에사용.
	 * 자바나 안드로이드에서 동일한 방식으로 익명의 내부 클래스를 이용하영 화면에서 이벤트처리를 함.
	 * */
	
	
	public static void main(String[] args) {
		//강사님은 Ex07 대신 MyAonymousClass 라고씀
		Ex07 t = new Ex07();
		t.printB(new Anony() {
		//Anony 클래스 인스턴스 는 이부분에서 일지삭으로 사용되어 진다.	
			@Override
			public void print() {
				System.out.println("익명 클래스 사용 중입니다.");
			}
			
		});
	}
}
