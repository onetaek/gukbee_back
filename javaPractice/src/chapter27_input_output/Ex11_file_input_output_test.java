package chapter27_input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex11_file_input_output_test {
	/*
	 * 버퍼링을 제공하는 스트림 역시 보조 스트림으로 다른 스트림을 포함하여 수행.
	 * BufferedInputStream(InputStream in) : InputStream 클래스를 생성자의 매개변수로 받아 BufferedInputStream을 생성.
	 * BufferedInputStream(InputStream in, int size) : : InputStream 클래스와 버퍼 크기를 생성자의 매개변수로 받아 BufferedInputStream으로 
	 * 
	 */
	public static void main(String[] args) {
		//파일 복사하기
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("./src/chapter27_input_output/init_file.zip");
				FileOutputStream fos = new FileOutputStream("./src/chapter27_input_output/copy_file.zip")) {
			
			millisecond = System.currentTimeMillis(); //파일 복사를 시작하기 전 시간
			
			int i;
			while((i = fis.read())!=-1) {
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond; //파일을 복사하는데 걸리는 시간.
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("파일 복사 하는 데 "+millisecond +" millisecond 소요되었습니다.");
	}

}
