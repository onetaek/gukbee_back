package chapter12_inheritance;

class GeneralChick extends Chick{
	
}

class RedCheck extends Chick{
	
}

public class Ex02 {

	public static void main(String[] args) {
		GeneralChick gc = new GeneralChick();
		RedCheck rc = new RedCheck();
		System.out.println(rc.x);
	}

}
