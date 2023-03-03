package chapter28_lamda;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {
		//===람다식===
		//배열 스트림 : Arrays.stream사용
//		Object obj = (a,b) -> a > b ? a: b;//람다식. 익명 객체
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a : b;
			}
		};
//		int value = obj.max(3,5);//함수형 인터페이스
		
		//===함수형 인터페이스===
		Myfunction f = new Myfunction() {
			@Override
			public int max(int a, int b) { //오버라이딩 - 접근제어자는 좁게 못바꾼다.
				return a > b ? a : b;
			}
		};
		int value = f.max(4, 5);
		System.out.println("value = "+ value);
		
		
		//람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
		Myfunction f2 = (a,b) -> a > b ? a : b;
		int value2 = f2.max(10, 5);
		System.out.println("vaelue2 = "+value2);
		
	}
	
}

@FunctionalInterface //함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함.
interface Myfunction{
//	public abstract int max(int a, int b);
	int max(int a, int b);
}
