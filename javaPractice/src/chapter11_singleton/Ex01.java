package chapter11_singleton;

public class Ex01 {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		
		
		if(s1==s2) {
			System.out.println("같은 객체다");
			System.out.println(s1);
			System.out.println(s2);
		}else {
			System.out.println("다른 객체다");
		}
		
		s1.num +=10;
		s2.num +=10;
		
		System.out.println("s1.num: "+s1.num);
		System.out.println("s2.num: "+s2.num);
		
	}

}
