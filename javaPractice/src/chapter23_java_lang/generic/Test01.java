package chapter23_java_lang.generic;

class MyClass<T,V>{
	// 제네릭을 사용하는 sum() 메서드 작성
	void sum(T a, V b) {
		System.out.println(a);
		System.out.println(b);
	}
}

public class Test01 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		float c = 11.1f, d = 12.1f;
		
		MyClass mc1 = new MyClass();
		mc1.sum(a,b);
		mc1.sum(c,d);
		System.out.println("------------");
		MyClass mc2 = new MyClass();
		mc2.sum(a,b);
		mc2.sum(c, d);
	}

}
