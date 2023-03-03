package chapter19_innerClass;

/*
 * MyOuter2.test()을 호출해서 아래와 같이 출력이 되도록 main() 메서드 작성.
 * '고객정보: 이름: 홍길동, 나이: 20, 주소: 세종시 세종구'
 * */
class MyOuter2{
	private String name;
	private int age;
	
	public MyOuter2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void test() {
		int num = 4;
		class Inner {
			private String address;
			public Inner(String address) {
				this.address = address;
			}
			public String getCustomerInfo() {
				//System.out.println("inner test() : "+num);
				return "이름: "+name +",나이: "+age + ",주소: "+address;
			}
		}//end Inner_class
		Inner inner = new Inner("세종시 세종구");
		System.out.println("고객정보: "+inner.getCustomerInfo());
	}//end inner_test;
}//end Outer class


public class Test03 {

	public static void main(String[] args) {
		MyOuter2 out = new MyOuter2("홍길동", 20);
		out.test();
	}

}
