package chapter10_constructer;

class StudentData{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public StudentData(String name, int ban, int no) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
}

class StudentRecord{
	final int MAX_STUDENT_CNT = 3;
	StudentData[] st = new StudentData[MAX_STUDENT_CNT];
	int idx = 0;
	
	void insertStudent(String name,int ban,int no,int kor,int eng,int math) {
		if (idx < MAX_STUDENT_CNT) {
			st[idx] = new StudentData(name,ban,no);
			st[idx].setKor(kor);
			st[idx].setEng(eng);
			st[idx].setMath(math);
			idx++;
		}
	}
	void printTotal() {
		for( StudentData s : st) {
			System.out.println(s.getName() + "총점: "+ (s.getKor()+s.getEng()+s.getMath()));
		}
	}
}

public class Ex04 {

	public static void main(String[] args) {
		StudentRecord sr = new StudentRecord();
		sr.insertStudent("철수", 1, 1, 90, 80, 90);
		sr.insertStudent("영수", 1, 2, 100, 70, 70);
		sr.insertStudent("영희", 1, 3, 80, 70, 100);
		sr.printTotal();
	}

}
