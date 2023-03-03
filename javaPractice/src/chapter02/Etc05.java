package chapter02;

public class Etc05 {

	public static void main(String[] args) {
		char single = '\''; // ' 를 쓰기위해 \를 앞에써준다.
		String dblQuote = "\"Hello\""; // " 를 쓰기위해 \앞에 써준다.
		String root = "c:\\"; 
		
		System.out.println(single);
		System.out.println(dblQuote);
		System.out.println(root);
		
		//char은 `로 묶고 String은 "로 묶기
		char single2 ='"';
		String single3 = "'";
//		String dblQuote2 = 'Hello'; //에러
	}

}
