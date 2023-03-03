package chapter09_overloading2;

public class Ex01 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.out.println("mm.add(3,3): " + mm.add(3, 3));

		System.out.println("mm.add(3L,3): " + mm.add(3L, 3));

		System.out.println("mm.add(3,3L): " + mm.add(3, 3L));

		System.out.println("mm.add(3L,3L): " + mm.add(3L, 3L));

		int[] a = { 100, 200, 300 };
		System.out.println("mm.add(a) 결과: " + mm.add(a));
	}

}

class MyMath {
	int add(int a, int b) {
		return (a + b);
	}

	Long add(Long a, int b) {
		return (a + b);
	}

	Long add(int a, Long b) {
		return (a + b);
	}

	Long add(Long a, Long b) {
		return (a + b);
	}

	int add(int[] a) {
		int sum = 0;
		for(int i = 0 ; i < a.length ; i++) {
			sum+=a[i];
		}
		return sum;
	}
}