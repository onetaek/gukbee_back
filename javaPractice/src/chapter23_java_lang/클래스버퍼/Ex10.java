package chapter23_java_lang.클래스버퍼;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * StringBuffer 와 StringBuilder 클래스 활용
		 * 프로그램을 만들다 보면 문자열을 변경하거나 연결해얗 하는 경우가 많음.
		 * 하지만 String 클래스는 한번 생성되면 그 내부의 문자열이 변경되지 않기 때문에
		 * String클래스를 사용하여 계속 문자열을 연결하거나 변경하는 프로그램을 작성하면 메모리가 많이 낭비.
		 * 이 문제를 해결하는 것이 StringBuffer 외 StringBuilder 클래스.
		 * 
		 * StringBuffer와 StringBilder클래스는 내부에 변경가능한(final이 아닌) char[]를 변수로 가지고 있음.
		 * 두 클래스를 사용하여 문자열을 연결하면 기존에 사용하던 char[] 배열이 확장되므로 추가 메모리를 사용하지 않음.
		 * 따라서 문자열을 연결하거나 변경할 경우 두 클래스 중 하나를 사용하면 됨.
		 * 
		 *  두 클래스의 차이는 여러 작업(스레드)이 동시에 문자열을 변경하려 할 때 문자열이 안전하게 변경되도록 보장해 주는가 그렇지 않은가의 차이ㅏ.
		 *  StringBuffer 클래스는 문자열이 안전하게 변경되도록 보장하지만, StringBilder 클래스는 보장되지 않음.
		 *  따로 스레드를 생성하는 멀티스레드 프로그램이 아니라면 StringBilder를 사용하는 것이 실행속도가 더 빠름.
		 * */
		
		String javaStr = new String("java");
		System.out.println("javaStr 문자열 주소: "+System.identityHashCode(javaStr));// 1023487453. 처음 생선된 메모리 주소
		
		StringBuilder buffer = new StringBuilder(javaStr);//String으로 부터 StringBilder생성
		System.out.println("연산 전 buffer메모리 주소: "+System.identityHashCode(buffer));// 1651191114. buffer 메모리 주소
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("연산 후 buffer메모리 주소: "+System.identityHashCode(buffer));//1651191114. buffer 메모리 주소
		
		javaStr = buffer.toString();//String 클래스로 반환
		System.out.println(javaStr);//java and android programming is fun!!!
		System.out.println("새로 만들어진 javaStr 문자열 주소 :"+System.identityHashCode(javaStr));//1586600255. 새로 생성죈 메모리
	}
}
