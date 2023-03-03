package chapter06_method;

public class test01 {

	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a+", "+b+", "+c+"중에 제일 큰수는 "+max(a,b,c)+"입니다.");
		System.out.println(a+", "+b+"중에 제일 큰수는 "+max(a,b)+"입니다.");
	}

	private static int max(int a, int b, int c) {
		int max = 0;
		if(a>c && a > b) {
			max = a;
		}else if(b>a && b >c) {
			max = b;
		}else {
			max = c;
		}
		return max;
	}
	private static int max(int a, int b) {
		return a > b ? a : b;
	}

}
