package chapter26_java_util_package;

import java.time.LocalDate;

public class Ex08 {
	/*
	 * java.time패키지
	 * 나중에 추가된 패키지. 기존의 Date의 Calendar를 보완.
	 * 
	 * java.time : 날짜오 ㅏ시간을 나타내는 LocalDate, LocalTime 등을 포함한 패키지
	 * java.time.format : 날자와 시간을 파싱하고 포멧팅하는 API 포함
	 * java.time.chrono : 여러가지 달력 시스템을 사용할 수 있는 API 포함.
	 * java.tiome.temporal : 날짜와 시간을 연산하기 위한 API 포함.
	 * java.time.zone : 타임존을 지원하는API포함.
	 * 
	 * java.time 패키지에서 날짜와 시간을 변경할 수 있음.
	 * 클래스들은 immutable(불편한)속성이 있기 때문에 날짜나 시간을 변경하게 되면
	 * 실제롤는 변경하는 것이 아니라 새로운 객체를 반환.
	 */
	public static void main(String[] args) {
		/*
		 * LocalDate클래스
		 * 날짜 정보를 저장. 날짜 정보를 저장하는 방법은 1)현재 날짜를 지정하는 now() 메서드를 쓰는 방법과
		 * 2)특정 날짜를 지정하는 of()메서드를 사용하는 방법이 있음.
		 * 날짜를 더하고 빼는 메서드를 확인하는 코드
		 * minusYears(long) 년도 빼기, minusMonths(long) 월 빼기, minusDays(long) 일 빼기, minusWeeks(long) 주 빼기
		 * plusYears(long) 년도 더하기, plusMonths(long) 월 더하고, plusDays(long) 일 더하기, plusWeeks(long) 주 더하기
		 */
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);// 2022-12-16
		
		//2년을 빼교ㅗ, 3달을 더하고, 4일을 뺌.
		LocalDate ld2 = ld.minusYears(2).plusMonths(3).minusDays(4);
		System.out.println(ld2);
		
		//자동 변환
		LocalDate ld3 = ld2.minusDays(3);
		System.out.println(ld3);
		
		//주 더하기
		LocalDate ld4 = ld3.plusWeeks(3);//ld3에서 3주를 더함.
		System.out.println(ld4);//2021-03-30
		
	}

}
