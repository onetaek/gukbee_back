package chapter14_Polymorphism;

class Score{
	private int kor;
	private int math;
	private int eng;
	private int com;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor >= 0 && kor <= 100) {
			this.kor = kor;			
		}else {
			System.out.println("잘못된 값입니다.");
		}
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(math >= 0 && math <= 100) {
			this.math = math;			
		}else {
			System.out.println("잘못된 값입니다.");
		}
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		if(eng >= 0 && eng <= 100) {
			this.eng = eng;			
		}else {
			System.out.println("잘못된 값입니다.");
		}
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		if(com >= 0 && com <= 100) {
			this.com = com;			
		}else {
			System.out.println("잘못된 값입니다.");
		}
	}
	
	
}

public class Test05 {

	public static void main(String[] args) {
		Score score = new Score();
		score.setKor(-500);
	}

}
