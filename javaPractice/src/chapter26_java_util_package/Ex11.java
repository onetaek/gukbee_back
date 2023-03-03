package chapter26_java_util_package;

import java.time.LocalDate;

public class Ex11 {

	public static void main(String[] args) {
		//1900년 부터 2100년까지 윤년이 언제인지, 몇 년인지 알아보는 코드.
		LocalDate ld = LocalDate.now();
		LocalDate ld1;
		int count = 0;//윤년의 횟수를 저장
		
		for(int i = 1900; i<= 2100; i++ ) {
			ld1 = ld.withYear(i);//년을 i로 변경.
			if(ld1.isLeapYear()) {//isLeapYear메서드는 윤년이면 true를 반환
				System.out.println(ld1.getYear() + "은 윤년입니다. ");
				count++;//윤년일 경우 1을 더함.
			}
		}
		System.out.println("1900년부터 210년까지 윤년은 총" + count + "번 있습니다.");
	}
}
