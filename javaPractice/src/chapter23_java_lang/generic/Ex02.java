package chapter23_java_lang.generic;

import java.util.ArrayList;

public class Ex02 {
/**
 * 요즘은 제네릭을 쓰지만 동적 배열인 ArrayList를 타입 인수없이 사용해보면
 * 다른 자료형인 정수롸 문자열을 저장하지만 다 object의 후손이므로 장에는 문제없음.
 * 하지만 요소를 거낼때는 일일이 캐스팅해야함
 * 제네릭으로 타입을 지정해줄때보다 안했을때 속도가 느림
 */
	public static void main(String[] args) {
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("문자열");
		int value = (int) arNum.get(0);
		String temp = (String)arNum.get(1);
		System.out.println(value);
		System.out.println(temp);
	}

}
