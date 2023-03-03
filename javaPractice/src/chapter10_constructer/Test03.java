package chapter10_constructer;

class Student{
	String name;
	String rollno;
	int age;
	
	Student(String name, String rollno, int age){
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		System.out.println("학생의 이름: "+name);
		System.out.println("학생의 학번: "+rollno);
		System.out.println("학생의 나이: "+age);
		System.out.println(this.getClass()+"객체가 생성되었습니다.");
		
	}
}

public class Test03 {

	public static void main(String[] args) {
		Student student = new Student("Oh","0001",25);
	}

}
