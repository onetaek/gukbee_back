package chapter07_student;

public class Ex01 {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setStudentName("안연수");
		System.out.println(st1.getSudentName());
		
		Student st2 = new Student();
		st2.setStudentName("홍길동");
		System.out.println(st2.getSudentName());
	}

}
