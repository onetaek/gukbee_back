package chapter26_java_util_package;

import java.time.LocalDate;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * 클래스들의 정보 값 변경하기
		 * 각클래스에는 필드 값들을 특정 값으로 변경할 수 있는 메서드가 있음.
		 * withYear(int) 년 변경, withMonth(int) 월 변경, withDayOfYear(int) 년의 일 변경, withDayOfMont(int) 월일 일 변경.
		 */
		
		//날짜를 변경하는 코드
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate new_ld = ld.withYear(1999).withMonth(8).withDayOfYear(33);
		//년을 1999로, 월을 8으로, 해당되는 년의 33번째 일의 날짜로 출력
		System.out.println(new_ld);
	}

}
