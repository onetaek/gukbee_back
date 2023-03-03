package chapter27_input_output;

import java.io.FileOutputStream;

public class Ex08_FileOutputStream3 {

	public static void main(String[] args) {
		/*
		 * write(byte[] b, int off, int len) 메소드 사용하기
		 * 배열의 전체 자료를 출력하지 않고 배열의 off위치 부터 len길이만 출력
		 */
		try(FileOutputStream fos = new FileOutputStream("./src/chapter27_input_output/output3.txt")) {
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i< bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs,2,10);//배열의 2번째 위치부터 10개 바이트 출력하기
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
