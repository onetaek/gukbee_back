package chapter24_collection.Test01;

public class Student {
	int studentNum;
	String name;
	
	Student(int studentNum, String name){
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentNum == student.studentNum) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	
}
