package chapter27_input_output;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//펴준입쳘릭
		//화면에 출려가혹 입력받는 표준 입출력 클래스
		
		//문자 여러 개를 입력받ㅇ기
		System.out.println("알파벳 여러 개를 쓰고[Enter]를 누르세요");
		
		int i;
		try {
			//read()의 반호환영.int
			while((i = System.in.read()) != -1) {//System.in : 표준입력 스트림.
				System.out.print((char)i);// System.out : 표준출력 스트림.
			}
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
