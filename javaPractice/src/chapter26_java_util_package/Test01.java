package chapter26_java_util_package;

import java.util.Calendar;

public class Test01 {
	
	public static String getDayToStr(int day) {
		String[] days = {"일", "월", "화", "수", "목", "금","토"};
		return days[day -1];
	}
	
	public static void main(String[] args) {
		/*
		 * Calendar 클래스는 달력을 표현한 클래스입니다.
		 * Calendar 클래스를 사용해서 현재 시간이 나오도록 구현하세요.
		 * https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
		 * 실행 결과 :
		 * 2022년 8월 22일
		 * 월요일 오후
		 * 5시 54분 38초
		 */

		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DATE);
		String strWeek = getDayToStr(Calendar.DAY_OF_WEEK);
		String strAmPm = null;
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		int amPm = now.get(Calendar.AM_PM);
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		System.out.print(year+"년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
	
		
	}

}
