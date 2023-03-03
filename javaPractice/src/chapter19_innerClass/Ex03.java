package chapter19_innerClass;

class OutClass{
	/*
	 * 인스턴스 내부 클래스
	 * 인스턴스 변수를 선언할 때와 같은 위치에 선언하며, 외부 클래스 내부에서만 생성하여 사용하는 객체를 선언할 때 사용,
	 * 예를 들어 어떤 클래스 내에 여러 변수가 있고 이들 변수 중 일부를 모아 클래스로 표현할 수 있음.
	 * 이 클래스를 다른 외부 클래스에서 사용할 일이 없는 경우 내부 인스턴스 클래스로 정의.
	 * 외부 클래스의 객체를 먼저 생성하지 않고 인스턴스의 내부 클래스를 사용할 수 없음.
	 * 자바 16(2021년 3월)부터는 내부 클래스에서 정적 멤버를 선언할 수 있게 됨.
	 */
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass; //내부 클래스의 참조변수 선언.
	
	public OutClass() {//외부 클래스의 디폴트 생성자
		inClass = new InClass();//내부 클래스 생성. 외부 클래스의 객체가 생성된 후에 내부 클래스의 객체 생성 가능.
	}
	
	class InClass{//내부 클래스
		int inNum = 100;
		static int sInNum = 200;
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)"); 
			System.out.println("OutClass snum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		 
		static void sTest() {
			System.out.println("인스턴스 내부 클래스의 static 메소드");
		}
	}
	
	public void usingClass() {
		inClass.inTest();//내부 클래스 변수를 사용하여 메서드 호출하기 
	}
}

public class Ex03 {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass(); //내부 클래스 기능 호출
		System.out.println();
		
		OutClass.InClass inClass = outClass.new InClass(); //외부 클래스를 이용하여 내부 클래스 생성
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inClass.inTest();
		
		System.out.println();
		
		//인스턴스 내부 클래스의 static 멤버 사용.
		System.out.println("OutClass.InClass.sInNum");//200
		OutClass.InClass.sTest(); //인스턴스 내부 크래스의 static 메소드
		
	}
}
