package chapter02;

public class Etc06 {

	public static void main(String[] args) {
		int value = 10 + 2 + 8;
		System.out.println("value: "+value);
		
		String str1 = "10" + 2+ 8;
		System.out.println("str1: "+str1);
		
		String str2 = 10 + 2+ "8";
		System.out.println("str1: "+str1);
		
		String str3 = 10 + "2"+ 8;
		System.out.println("str1: "+str1);
		
		String str4 = "10" + (2+ 8);
		System.out.println("str1: "+str1);
		//숫자 + 문자 => 문자
	}

}
