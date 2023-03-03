package chapter06_method;

public class Ex03 {

	static int max(int a, int b,int c) {
		int max = a;
		if(b>max) max= b;
		if(c<max)max=c;
		return max;
	}
}
