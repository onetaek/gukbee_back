package chapter14_Polymorphism;

class Score2{
	private int kor;
	private int math;
	private int eng;
	private int com;
	public Score2(int kor, int math, int eng, int com) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.com = com;
	}
	public void display() {
		System.out.println("국어: "+kor);
		System.out.println("수학: "+math);
		System.out.println("영어: "+eng);
		System.out.println("컴퓨터: "+com);
	}
	
}

public class Test06 {

	public static void main(String[] args) {
		Score2 s = new Score2(100,80,95,84);
		s.display();
	}

}
