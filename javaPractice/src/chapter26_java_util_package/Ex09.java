package chapter26_java_util_package;

import java.time.LocalDateTime;

public class Ex09 {

	public static void main(String[] args) {
		/*
		 * 시간을 더하고 빼는 메서드를 확인하는 코드
		 * minusHours(long) 시간 빼기, minusMiunutes(long) 분 빼기, minusScconds(long) 초 빼기, minusNamos(long) 나노초 빼기 
		 * plusHours(long) 시간 더하기 , plusMiunutes(long) 분 더하기 , plusScconds(long) 초 더하기 , plusNamos(long) 나노초 더하기 
		 */
		 LocalDateTime ldt1 = LocalDateTime.now();
		 System.out.println("현재 시간 : "+ldt1);//현재 시간 : 2022-12-16T14:10:12.661118500
		 LocalDateTime ldt2 = ldt1.minusHours(5).plusMinutes(30).minusSeconds(4);//변경 시간 : 2022-12-16T09:42:15.578454700
		 //5시간을 더하고, 30분을 더하고, 4초를 뺌.
		 System.out.println("변경 시간 : " + ldt2);
		 
		 LocalDateTime ldt3 = ldt2.minusHours(24);
		 //ld2값에서 24시간을 뺌.
		 System.out.println("자동 변경 시간 : "+ldt3);//자동 변경 시간 : 2022-12-15T09:42:15.578454700
	}

}
