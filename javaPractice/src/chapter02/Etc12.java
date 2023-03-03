package chapter02;

public class Etc12 {

	public static void main(String[] args) {
		byte kor, math, eng;
		kor = 55;
		math = 99;
		eng = 87;
		
		int sum = kor + math + eng;
		int avg_01 = sum / 3; // 평균 : 80
		double avg_02 = sum / 3; //정수 / 정수 -> 80.0
		double avg_03 = (double)sum / 3; // 실수 / 정수 ->80.33333333333333
		double avg_04 = sum / 3.0; // 정수 / 실수 -> 80.33333333333333
		double avg_05 = (double)sum / 3.0;// 실수 / 실수 -> 80.33333333333333
		System.out.println(avg_01);
		System.out.println(avg_02);
		System.out.println(avg_03);
		System.out.println(avg_04);
		System.out.println(avg_05);
		
		
	}

}
