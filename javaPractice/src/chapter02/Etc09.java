package chapter02;

public class Etc09 {

	public static void main(String[] args) {
		/*
		 * 명시적 형변환 : 개발자가 변수의 자료형을 강제로 바꾸는 것 
		 * 형식 : (변환하고자하는 타입) 변수명
		 */
		int a = 263;
		System.out.println(a);
		
		byte b = (byte)a; //명시적 형변환 263 - 256 = 7
		System.out.println(b);
	}

}
