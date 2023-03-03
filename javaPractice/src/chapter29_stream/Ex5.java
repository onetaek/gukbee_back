package chapter29_stream;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream intStream = new Random().ints();//무한 스트
		intStream
		.limit(5)
		.forEach(System.out::println);
	}

}
