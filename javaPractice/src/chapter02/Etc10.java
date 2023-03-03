package chapter02;

public class Etc10 {
	public static void main(String[] args) {
		String str = "1a";
		//int value = Integer.parseInt(str); //문자열에 숫자회의 문자가있으면 변환X
		
		//str -> byte
		String str1 = "10";
		byte value1 = Byte.parseByte(str1);
		System.out.println(value1);
		
		//str -> short
		String str2 = "10";
		short value2 = Short.parseShort(str1);
		System.out.println(value1);
		
		//str -> int
		String str3 = "10";
		int value3 = Integer.parseInt(str1);
		System.out.println(value1);
		
		//str -> long
		String str4 = "10";
		long value4 = Long.parseLong(str1);
		System.out.println(value1);
		
		
	}
}
