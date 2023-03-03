package chapter12_inheritance;

class Person{
	void breath() {
		System.out.println("숨쉬기");
	}
	
	void eat() {
		System.out.println("밥먹기");
	}
	
	void say() {
		System.out.println("말하기");
	}
}

class Student extends Person{
	void learn() {
		System.out.println("배우기");
	}
}

class Teacher extends Person{
	void teach() {
		System.out.println("가르치기");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Student st = new Student();
		st.learn();
		st.breath();
		
		Teacher tc = new Teacher();
		tc.teach();
		tc.breath();
		
		Person ps = new Person();
		ps.breath();
	}

}
