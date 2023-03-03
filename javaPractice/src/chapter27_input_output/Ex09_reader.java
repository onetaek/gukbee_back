package chapter27_input_output;

import java.io.FileReader;

public class Ex09_reader {

	public static void main(String[] args) {
		/*
		 * FileReader
		 * FileReader(String name) : 파일 이름 name(경로 포함)을 매개변수로 받아 입력 스트림을 생성.
		 * FileReader(File f) : File 클래스 정보를 매개변수로 받아 입력 스트림을 생성.
		 * 
		 * 문자 스트림 FileReader로 읽으면 한글이 제대로 읽힘.
		 */
		try(FileReader fr = new FileReader("./src/chapter27_input_output/reader.txt")) {
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
