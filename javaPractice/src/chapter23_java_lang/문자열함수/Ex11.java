package chapter23_java_lang.문자열함수;

public class Ex11 {

	public static void main(String[] args) {
		String tel1 = "        02";
		String tel2 = "123        ";
		String tel3 = "     1234     ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}
}
