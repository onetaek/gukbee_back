package chapter19_innerClass;
/*
 * 익명 객체의 로컬 변수 사용
 * 메소드의 매개 변수나 로컬 변수를 익명 객체 내부에서 사용할 때도 제한이 있음.
 * 메소드가 종료되어도 익명 객체가 실행 상태로 존재 할 수 있음.
 * 문제는 메소드의 매개 변수나 지역 변수를 익명 객체 내부에서 사용할 때인데
 * 메소드가 실행이 끝나면 스택메모리에서 사라지기 때문에 익명 객체에서 지속적으로 사용을 할 수 없음.
 * 
 * 자바는 이 문제를 해결하기 위해 컴파일 시 익명 객체에서 사용하는 매개 변수나 지역 변수의 값을 익명 객체 내부에 복사해두고 사용.
 * 그리고 매개 변수나 지역 변수가 수정되어 값이 변경되면 익명 객체에 복사해 둔 값과 달라지므로
 * 매개 변수나 지역변수를 final 특성을 부여(상수로 만듬).
 * */

interface Calculatable{
	public int sum();
}

class Anoymous{
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10; //외부 클래스의 멤버 변수
		
		//arg1 = 20; 매개 변수가 상수라서 수정불가
		//arg2 = 20; 매개 변수가 익명 객체에서 사용해서 상수화디어 에러. 변수선언을 상수성ㄴ언으로 처리.
		
		//var1 = 30; 지역 변수가 상수라서 수정 불가
		//var2 = 30; 지역 변수가 익명 객체에서 사용해서 상수화되어서 에러
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
			
		};
		System.out.println(calc.sum());
	}
}


public class Ex09 {

	public static void main(String[] args) {
		Anoymous anoy = new Anoymous();
		anoy.method(0, 0); //10
	}

}
