package chapter26_java_util_package;

public class Ex01 {
	//1. 시간처리
	//자바에서는 시간에 대해 처리할 수 있또록 크래스를 제공.
	// 시간을 다루는 자료형의 값은 , long이며, java.tuil.Calendar클래스와 java.util.Date, SimpleDataFormat이 있음.
	public static void main(String[] args) {
		//System.currenTimeMillis() : 현재 운영체제의 시작을 long 타입으로 반호나.
		//반환한 시각은 19790년 1월 1일을 기준으로 했을 때 현재까지의 시간이며 1/1000초 단위까지 환산해서 보여줌.
		//메서드가 실행되는 순간의 운영체제 시작을 바환하기 때무에 이용을 하면 작업 소여 시간을 측정.
		long start = System.currentTimeMillis();//작업을 시작하기 전의 시간 반환
		System.out.println("시작시간: "+start);
		int a= 0 ;
		for(int i = 1; i< 1000000000; i++) {
			a++;
		}
		long end = System.currentTimeMillis(); //작업이 끄탄 후의 시간 바환
		System.out.println("종료시간: "+end);
		System.out.println("걸린 작업 시간: "+(end - start));
//		시작시간: 1671151461533
//		종료시간: 1671151461536
//		걸린 작업 시간: 3
	}

}
