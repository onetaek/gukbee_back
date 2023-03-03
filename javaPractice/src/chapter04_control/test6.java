package chapter04_control;

public class test6 {

	public static void main(String[] args) {
		for(int i = 4 ; i >= 0 ; i--) {
			for(int j = 0 ; j <= 4 ; j++) {
				if(j<i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
