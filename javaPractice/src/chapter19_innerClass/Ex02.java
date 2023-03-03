package chapter19_innerClass;

class OuterClass{
	int a = 3;
	static int b = 4;
	
	class Inner {//인스턴스 내부 클래스
		int c = 5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	
	static class StaticInner{//static 내부 클래스 
		int d = 6;
		static int stat = 10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}

public class Ex02 {

	public static void main(String[] args) {
		//외부 클래스 사용
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass의 a값 = "+oc.a);
		
		//static 변수라서 클래스명으로 접근 가능
		System.out.println("OuterClass의 b값 = "+OuterClass.b);
		//System.out.println("OuterClass의 b값 = " + OuterClass.StaticInner.d); //접근 불가
		System.out.println("OuterClass의 StaticInner의 stat값 = "+OuterClass.StaticInner.stat);
		OuterClass.StaticInner.staticMethod();// <Static Inner> //클래스명으로도 접근 가능
		
		System.out.println("\n=========== inner 클래스 접근하기 =============");
		OuterClass oc2 = new OuterClass();// 외부 클래스의 객체 생성 후 사용.
		OuterClass.Inner inner = oc2.new Inner(); //인스턴스 내부 크래르스이 객체 생성.
		
		System.out.println("Inner의 c값 = "+ inner.c);//5
		inner.innerMethod(); //<Inner Class>
	
		System.out.println("\n=========== static inner 클래스 접근하기 =========");
		OuterClass.StaticInner si = new OuterClass.StaticInner(); //static 내부 클래스의 객체 생성.
		System.out.println("StaticInner의 d값 = "+ si.d) ; //6
		si.staticMethod(); // <Stati Inner> 클래스, 객체 모두를 사용해 접근 가능.
		//노란줄이 뜨는 이유는 스테틱 메소드는 클래스이름으로 접근하는 것을 권장히기 때문이다.
	
	}

}
