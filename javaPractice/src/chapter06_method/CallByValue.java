package chapter06_method;

public class CallByValue {

	public int increase(int n) {
		return ++n;
	}

	public static void main(String[] args) {
		int var1 = 100;
		CallByValue val = new CallByValue();
		int result = val.increase(var1);
		System.out.println("var1: "+var1+", result: "+result);
	
	}

}
