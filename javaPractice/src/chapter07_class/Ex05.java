package chapter07_class;


public class Ex05 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름: "+s.name);
		System.out.println("총점: "+s.getTotal());
		System.out.println("평균: "+s.getAverage());
	}
}
class Student {

	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	public int getTotal() {
		
		return kor + eng + math;
	}
	public float getAverage() {
		// TODO Auto-generated method stub
		return (float)getTotal() / 3;
	}
	
}
