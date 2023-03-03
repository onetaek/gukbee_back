package chapter13_inheritance_ppdr;

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
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		User user1 = new User("철수",20);
		User user2 = new User("영희",19);
		
		System.out.println(user1.getName() + "의 나이는 "+user1.getAge());
		user2.setAge(25);
		System.out.println(user2.getName() + "의 나이는 "+user2.getAge());

	}

}
