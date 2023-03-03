package chapter10_constructer;

public class Ex03 {

	public static void main(String[] args) {
		User u1 = new User("철수",20);
		User u2 = new User("영희",19);
		
		//u2.age = 99;
		
		System.out.println(u1.getName() + "의 나이는 "+u1.getAge());
		System.out.println(u2.getName() + "의 나이는 "+u2.getAge());
	}

}
class User{
	private String name;
	private int age;
	
	User(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}