package chapter28_lamda;

/**
 * 함수형 인터페이스를 사용하는 다양한 방식
 */
interface MyFunction3{
	void run();//public abstract void run();
}

public class Ex2 {
	static void execute(MyFunction3 f) {//매개변수의 타입이 MyFunction인 메서드
		f.run();
	}
	
	static MyFunction3 getMyFunction() {
		MyFunction3 f = () -> System.out.println("f3.run() 실행");
		return f;
	}
	
	public static void main(String[] args) {
		//람다식으로 MyFunction의 run()을 구현
		MyFunction3 f1 = () -> System.out.println("f1.run()실행");
		
		MyFunction3 f2 = new MyFunction3() {
			public void run() {
				System.out.println("f2.run()실행");
			}
		};
		
		MyFunction3 f3 = getMyFunction();
		
		f1.run();
		f2.run();
		
		execute(f1);
		execute(()->System.out.println("run()"));
	}
}