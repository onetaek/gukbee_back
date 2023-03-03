package chapter15_abstract;

abstract class Student{
	public String name;
	public int grade;
	public String teacher;
	Student() {
		System.out.println("Student 생성자 호출");
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public String getStudentInfo() {
		System.out.println("Student 클래스의 getStudentInfo()메소드 호출");
		return "이름은 : " + name + " ,학년은 "+grade+",교수님은 "+teacher;
	}
	abstract public String getTeacher();
}

class Elementary extends Student{
	Elementary(String name,int grade,String teacher){
		System.out.println("Elementary 생성자 호출 ");
		super.name = name;
		super.grade = grade;
		super.teacher = teacher;
	}
	public Elementary() {
		System.out.println("Elementary 생성자 호출");
	}
//	public String getClassTeacher() {
//		return "박길순 선생님";
//	}
	@Override
	public String getTeacher() {
		System.out.print("선생님 이름:");
		return teacher;
	}
}
class University extends Student{
	int courses;
	University(String name, int grade, int courses,String teacher){
		System.out.println("University 생성자 호출");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
		super.teacher = teacher;
	}
	
	University(String name, int grade, int courses){
		System.out.println("University 생성자 호출");
		super.name = name;
		super.grade = grade;
		this.courses = courses;
	}
	public University() {
		this("이순신",2,20);
	}
	public int getCourses() {
		return courses;
	}
	public String getStudInfo() {
		System.out.println("University 클래스의 getStudInfo 메소드 호출");
		return "이름은>> "+name+", 학년은>> "+grade + ", 신청 학점은>> "+courses;
	}
	@Override
	public String getTeacher() {
		System.out.print("선생님 이름:");
		return teacher;
	}
}

public class Ex05 {
	
	public static void main(String[] args) {
		University university = new University("홍길동",3,22,"차범근");
		Elementary elementary = new Elementary("이순신",2,"홍명보");
		
		Student[] students = new Student[2];
		students[0] = university;
		students[1] = elementary;
		
		for(Student s : students) {
			System.out.println("학생 이름:"+s.getName());
			System.out.println(s.getTeacher());
		}
	}
}
