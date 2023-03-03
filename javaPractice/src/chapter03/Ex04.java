package chapter03;

public class Ex04 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pendilsPerStudent = pencils/students;
		
		int pencilsLeft = pencils%students;
		
		System.out.println("한 명이 가지는 연필수: "+pendilsPerStudent);
		System.out.println("남는 연필수: "+pencilsLeft);
	}

}
