package chapter13_inheritance_ppdr;

class StaticPractive{
	public static int number =3;
	public static void say() {
		System.out.println("인스턴스 생성 없이 사용 가능합니다.");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		System.out.println(StaticPractive.number);
		StaticPractive.say();
	}

}
