package chapter07_class;

class Mystudent{
	String name;
	int grade;
	int kor;
	int eng;
	int math;
	
	void printStudent() {
	System.out.println(name+"은 "+grade+"학년이고, "
			+ "국어 성적은 "+kor +"점 입니다.");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Mystudent st1 = new Mystudent();
		st1.name = "김철수";
		st1.grade = 2;
		st1.kor = 100;
		st1.eng = 90;
		st1.math = 88;
		
		Mystudent st2 = new Mystudent();
		st2.name = "박영수";
		st2.grade = 1;
		st2.kor = 90;
		st2.eng = 70;
		st2.math = 98;
		
		st1.printStudent();
		st2.printStudent();
	}
}
