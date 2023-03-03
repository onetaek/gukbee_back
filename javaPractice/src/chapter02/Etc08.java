package chapter02;

public class Etc08 {

	public static void main(String[] args) {
		/*
		 * 자동 형변환: 프로그램 작성자가 별도의 작업을 하지 않아도 
		 * 자바가 알아서 알맞은 타입으로 변환. 
		 * 작은 범위에서 큰 범뮈올 변경이되는 경우-> 값 손실이 없음
		 */
		byte a = 127;
		int b = a;
		System.out.println(b);
		
		float c = b;
		System.out.println(c);
		
		//int d = c ; floa 자료형을 int변수에 대입하면 자동변환이 안됨
	}

}
