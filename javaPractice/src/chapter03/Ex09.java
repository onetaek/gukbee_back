package chapter03;

public class Ex09 {

	public static void main(String[] args) {
		double a = 3.14;
		double b = 5.14;
		System.out.println(a==b);
		System.out.println(a!=b);
		
		/* 문자열의 경우 equals()메서드를 이용해서 값을 비교 */
		String c1 = "Hello JAVA!";
		System.out.println(c1.equals("Hello java!"));//false
		System.out.println(c1.equals("Hello JAVA!"));//true
		
		// ==은 객체의 주소값을 비교, 문자값을 비교하는 것임 문자열을 비교할 땐 equals사용
		System.out.println(c1=="Hello java!"); //false
		System.out.println(c1=="Hello JAVA!"); //true
		
		String c2 = new String("Hello JAVA!");
		System.out.println(c1==c2);//false
		System.out.println(c1!=c2);//true
	}

}
