package chapter20_tryCatch;

public class Ex02 {

	public static void main(String[] args) {
		int num = 10;
		int num2 = 0;
		
		try {
			System.out.println("**정숫값을 0으로 나누는 연산**");
			//부적절한 연산 수행
			System.out.println("10/0=" + (num/num2));
			System.out.println("try/catch 구분 밖 문장 수행");
		} catch (Exception error) {
			System.out.println(error);
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램을 정상 수행합니다.");
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}

}
