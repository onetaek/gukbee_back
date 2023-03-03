package chapter27_input_output;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * int read(byte[] b) 메서드로 읽기
		 * 자료를 read()메소드로 한 바이트씩 읽는 것 보다 배열을 사용해서 한꺼번에 많이 읽으면 처리 속도가 훨씬 빠름.
		 * read(byte[] b) 메서드는 선언한 바이트 배열의 크기만큼 한꺼번에 자료를 읽고 읽어 들인 자료의 수를 반환.
		 */
		try(FileInputStream fis = new FileInputStream("./src/chapter27_input_output/input.txt")){
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs))!= -1) {
				for(int k = 0; k< i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": "+i+"바이트 읽음");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
