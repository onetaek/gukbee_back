package chapter29_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Stream
// 1. 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 거
// 2. 생성 -> 중간 연산 -> 중간 연산 ... -> 최종연산 의 단계를 거침
// 3. 스트림은 ReadOnly이다. -> 수정불가
// 4. Iterator처럼 일회용이다.
// 5. 최종 연산 전까지 중간연산이 수행되지 않는다. -> 지연된 연산
// 6. 스트림은 작업을 내부 반복으로 처리한다.
// 7. 스트림의 작업을 병렬로 처리 - 병렬 스트림 (멀티 스레드)
// 8. 기본형 스트림 - IntStream, LongStrea, DoubleStream

public class Ex4 {
	
	public static void main(String[] args) {
		/**
		 * Collection인터페이스의 stream()으로 컬렉션을 스트림으로 변환
		 */
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();
		intStream.forEach(System.out::print);//forEach()최종연산
		
		//stream은 1회용이여서 최종션산을 수행하면 stream이 닫힌다.
		intStream = list.stream();
		intStream.forEach(System.out::print);
		
		/**
		 * 스트림 만들기 - 배열
		 */
		String[] strArr = {"a","b","c","d"};
//		Stream<String> strStream = Stream.of(strArr);
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(System.out::println);
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream2 = Arrays.stream(intArr);
		intStream2.forEach(System.out::println);
		
		Integer[] intArr2 = {1,2,3,4,5};
		Stream<Integer> intStream3 = Arrays.stream(intArr2);
		intStream.forEach(System.out::println);
		
		
	}

}
