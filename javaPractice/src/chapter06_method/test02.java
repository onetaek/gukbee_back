package chapter06_method;

public class test02 {

	public static void main(String[] args) {
		int a,b;
		a = 10;
		b = 20;
		System.out.println("밑변 a, 높이 b인 사각형의 넓이 : "+calculator(a,b));
	}
	
	public static int calculator(int a, int b) {
		System.out.println("<계산을 시작합니다.>");
		int area = a * b;
		return area;
	}

}
