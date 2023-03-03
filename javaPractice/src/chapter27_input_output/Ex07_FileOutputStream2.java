package chapter27_input_output;

import java.io.FileOutputStream;

public class Ex07_FileOutputStream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * write(byte[] b) 메서드 사용하기
		 * 출력도 입력과 마찬가리조 여러 자료를 한꺼번에 출력하면 효율적일 뿐더러 실행시간도 줄어듬.
		 * write(byte[] b) 메서드는 바이트 배열에 있는 자료를 한꺼번에 출력
		 */
		try(FileOutputStream fos = new FileOutputStream("./src/chapter27_input_output/output2.txt")) {
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i< bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);//배열 한꺼번에 출력하기
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
