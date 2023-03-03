package chapter02;

public class Etc11 {

	public static void main(String[] args) {
		/*
		 * 기본 타입과 문자열 간의 변환 기본 타입의 값을 문자열로 변경하는 경우에는 String.valueOf()메소드를 이용 String str
		 * = String.valueOf(기본 타입값);
		 */
		
		//문자열을 기본 타입으로 변환
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		//기본 타입을 문자열로 변환
		String str1 = String.valueOf(10);
		String str3 = String.valueOf(3.14);
		String str4 = String.valueOf(false);
	}

}
