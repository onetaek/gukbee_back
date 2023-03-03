package chapter07_class;

public class Tv_main {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
//		t1.channel = 7;
//		t1.channelDown();
//		System.out.println("t1의 channel값음 "+t1.channel + "입니다.");
//		System.out.println("t1의 channel값음 "+t2.channel + "입니다.");
//		
//		t1.channel = 7;
//		System.out.println("t1의 channel값을 "+ t1.channel +"로 바꿔습니다." );
//		
//		System.out.println("t1의 channel값음 "+t1.channel + "입니다.");
//		System.out.println("t1의 channel값음 "+t2.channel + "입니다.");
		
		System.out.println("t1.toString()값은 "+t1.toString() + "입니다.");
		System.out.println("t2.toString()값은 "+t2.toString() + "입니다.");
		
		System.out.println("t1의 channel값은 "+t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+t2.channel + "입니다.");
		System.out.println();
		
		t1.channel = 7;
		System.out.println("t1의 channel값은 "+t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+t2.channel + "입니다.");
		System.out.println();
		
		t1 = t2;
		System.out.println("t1.toString()값은 "+t1.toString() + "입니다.");
		System.out.println("t2.toString()값은 "+t2.toString() + "입니다.");
		System.out.println();
		
		System.out.println("t1의 channel값은 "+t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+t2.channel + "입니다.");
		System.out.println();
		
		t1.channel = 27;
		System.out.println("t1의 channel값은 "+t1.channel + "입니다.");
		System.out.println("t2의 channel값은 "+t2.channel + "입니다.");
		System.out.println();
	}
	

}
