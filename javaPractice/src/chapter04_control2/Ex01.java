package chapter04_control2;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * for문이 정해진 횟수만큼 반복한다면,
		 * while문은 조건식이 true일 경우 계속 반복.
		 * 조건식에는 비교 또는 논리 연산식이 주로오는데,
		 * 조건식이 false가되면 반복 행위를 멈추고 while문을 종료
		 * */
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
	}

}
