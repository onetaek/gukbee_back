package chapter09_overloading;

public class Ex01 {

	public static void main(String[] args) {
		Printer pt = new Printer();
		pt.println(10);
		pt.println(true);
		pt.println(5.7);
		pt.println("홍길동");
	}

}

class Printer{
	void println(int obj) {
		System.out.println(obj);
	}
	void println(boolean obj) {
		System.out.println(obj);
	}
	void println(double obj) {
		System.out.println(obj);
	}
	void println(String obj) {
		System.out.println(obj);
	}
	
	
}