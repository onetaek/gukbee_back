package chapter27_input_output;

import java.io.FileOutputStream;

public class Ex06_FileOutputStream {
	/*
	 * FileOutputStream : 파일에 바이트 단위 자료를 출력하기 위해 사용하는 스트림.
	 * 
	 * FileOutputStream(String name) : 파일 이름(경로 포함)을 매개변수로 받아 출력 스트림을 생성.
	 * FileOutputStream(String name, boolean append) : 파일 이름(경로 포함)을 매개변수로 받아 출력 스트림을 생성.
	 * append 값이 true이면 파일 스트림을 닫고 다시 생성할 때 파일의 끝에서 이어서 사용. 디폴트 값은 false.
	 * 
	 * FileOutputStream(File f) : File 클래스 정보를 매개변수로 받아 출력 스트림을 생성.
	 * FileOutputStream(File f, boolean append) : File 클래스 정보를 매개변수로 받아 출력 스트림을 생성.
	 * append 값이 true이면 파일 스트림을 닫고 다시 생성할 때 파일의 끝에서 이어서 사용. 디폴트 값은 false.
	 * 
	 * 생성자 매개변수로 ㄷ전달한 파일이 경로에 없으면 FileOutpuStream은 파일을 새로 생성.
	 * 기존 파일이 있는 경우 append 값이 ㄹalse이면 처음 부털 새로 씀. overwirte.
	 * true 이면 기존 내용 맨 뒤에 연결해서 씀. append
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		//FileOutputStream을 생성하고 write()메서드를 활용하여 파일에 정수 값을저장
		//fos = new FileOutputStream("output.txt",true) 기존 자료에 이어서 출력할경우
		try(FileOutputStream fos = new FileOutputStream("./src/chapter27_input_output/output.txt",true)) {
			//파일에 숫자를 쓰면 해당하는 아스키 코드 값으로 변환.
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
	

}
