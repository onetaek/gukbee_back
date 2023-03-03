package chapter26_java_util_package;

import java.math.BigDecimal;

public class Ex14 {
	/*
	 * BigDecimal : 정확한 소수점 연산을 해야 할 때 BigDecimal 클래스를 사용.
	 * double, long으로 소수점 연산을 할 때 오차가 나는 부분을 보완.
	 */
	public static void main(String[] args) {
		//double로 계산한 결과와 BigDecimal로 계산한 결과를 비교.
		double a = 24.3953;
		double b = 50.343998;
		System.out.println(a+b); //74.73929799999999
		
		BigDecimal number = new BigDecimal(String.valueOf(a));
		//double형 자료를 문자열 변환후 BigDecimal의 객체 생성.
		BigDecimal number2 = new BigDecimal(String.valueOf(b));
		//add() 메소드를 활용하여 정확한 결과 값을 반환.
		System.out.println(number.add(number2));
	}

}
