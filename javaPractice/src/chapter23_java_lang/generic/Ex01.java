package chapter23_java_lang.generic;

import java.util.HashMap;

/*
 *Student클래스를 작성하되, Object의 equals()의 hashCode()를 재정의해서
 *Student의 학번 studentNum 이 같으면 동등 객체가 될 수 있도록 해보세요.
 *Student 클래스의 필드는 다음과 같습니다.
 *hashCode()의 리턴 값은 studentNum 필드 값의 해시코드를 리턴하도록 하세요.
 *
 * 실행결과 :
 * 1번 학생의 총점 : 95
 */
class Student{
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	
//	public boolean equals(Student s1,Student s2) {
//		if(s1.getStudentNum().equals(s2.getStudentNum())) {
//			return true;
//		}else {
//			return false;
//		}	
//	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode(Student s) {
//		return s.getStudentNum();
		return studentNum.hashCode();
	}
}


public class Ex01 {
	public static void main(String[] args) {
		//Student 키로 총점을 저장하는 HashMap 객체생성.
		HashMap<Student, String> hashMap= new HashMap<Student,String>();
		
		//new Student("1")의 점수 95를 저장.
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점 : "+ score);
		
	}
	

}
