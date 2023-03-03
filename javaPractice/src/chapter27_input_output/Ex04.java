package chapter27_input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 파일 끝까지 읽기
		 * read() 메서드로 파일을 읽는 경우 파일의 끝에 도달을 하면 -1을 반환
		 */
		try(FileInputStream fis = new FileInputStream("./src/chapter27_input_output/input.txt")) {
			int i;
			//i값이 -1이 아닌 동안read() 메소드로 한 바이트를 반복해서 읽음
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
