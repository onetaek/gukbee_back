package chapter27_input_output;

import java.io.FileInputStream;

public class Ex03_FileInputStream {

	public static void main(String[] args) {
		/*
		 * FileInputStream(String name) : 파일 이름 name(경로 포함)매개 변수로 받아 입력 스트림을 생성.
		 * FileInputStream(File f): File클래스 정보를 매개변수로 받아 입력 스트림을 생성.
		 */
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/chapter27_input_output/input.txt");//input.txt 파일 스트림 생성
			
			//read() 메서드의 반환현은 int. 한 바이트를 읽어서 int에 저장. 더 이상 읽어 드릴 자료가 없느 경우 -1 바환
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		System.out.println("end");
	}

}
