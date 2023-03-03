package chapter27_input_output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex12_buffer_input_output_test {
	public static void main(String[] args) {
		//파일 복사하기
				long millisecond = 0;
				try(FileInputStream fis = new FileInputStream("./src/chapter27_input_output/init_file.zip");
						FileOutputStream fos = new FileOutputStream("./src/chapter27_input_output/copy_file.zip");
						BufferedInputStream bis = new BufferedInputStream(fis);
						BufferedOutputStream bos = new BufferedOutputStream(fos)		
						) {

					millisecond = System.currentTimeMillis(); //파일 복사를 시작하기 전 시간
					
					int i;
					while((i = fis.read())!=-1) {
						bos.write(i);
					}
					
					millisecond = System.currentTimeMillis() - millisecond; //파일을 복사하는데 걸리는 시간.
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				System.out.println("파일 복사 하는 데 "+millisecond +" millisecond 소요되었습니다.");
			}

}
