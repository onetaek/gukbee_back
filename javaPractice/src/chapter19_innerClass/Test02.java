package chapter19_innerClass;

/*
 * static 내부 클래스의 원리
 * 내부 클래스가 ...(못적음)
 * 
 * 
 * MyOuter3.Inner.getUserInfo()을 호출해서 아래 내용이 출력될도록 main 메서드 작성.
 * '고객정보 >> 주소는: 세종시 세종구, 전화번호: 010-1111-2222'
 * */

class MyOuter3{
	private String name;
	private int age;
	
	public MyOuter3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {return name;}
	public int getAge() {return age;}
	
	static class Inner{
		private String address;
		static String tel = "010-1111-2222";
		
		public Inner(String address) {
			this.address = address;
		}
		public String getUserInfo() {
			//static 내부 클래스에서 외부 클래스의 멤버 변수에 접근은 불가능한다.
			//return name + " " +age;
			return "주소는:" + address + ", 전화번호: "+tel;
		}
		
	}
	
}

public class Test02 {

	public static void main(String[] args) {
		//MyOuter3 mo3 = new MyOuter3("이름", 25);
		MyOuter3.Inner in = new MyOuter3.Inner("세종시 세종구");
		System.out.println(in.getUserInfo());
	}

}
