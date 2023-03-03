package chapter03;

public class Ex03 {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		j = i++;
		System.out.println("j= i++;실행 후, i="+i+",j="+j);
		//j= ++실행 후, i=6,j=5;
		i = 5;
		j = 0;
		j = ++i;
		System.out.println("j= i++;실행 후, i="+i+",j="+j);
		//j= ++실행 후, i=6,j=6;
	}

}
