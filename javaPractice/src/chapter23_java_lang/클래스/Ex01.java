package chapter23_java_lang.클래스;

class Human{
	int age;
	String name;
	Human(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		System.out.println("안녕" + age + "살" + name + "입니다.");
	}
}


public class Ex01 {

	public static void main(String[] args) {
		Human oh = new Human(25,"오원택");
		System.out.println("클래스 이름" + oh.getClass());
	}

}
