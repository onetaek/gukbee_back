package chapter06_method;

public class CallByRef {
	public void increase(int[] array) {
		for(int i = 0 ; i < array.length; i++) {
			array[i]++;
		}
	}
	public static void main(String[] args) {
		int[] refArray = {100,800,1000};
		CallByRef ref = new CallByRef();
		System.out.println("메서드 호출전");
		for(int i = 0 ; i < refArray.length ;i++) {
			System.out.println("refArray["+i+"]: "+refArray[i]);
		}
		
		ref.increase(refArray);
		
		System.out.println("메서드 호출후");
		for(int i = 0 ; i < refArray.length ;i++) {
			System.out.println("refArray["+i+"]: "+refArray[i]);
		}
	}

}
