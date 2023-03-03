package chapter06_method;

public class Ex04 {
	
	public void print(int a) {
		//main에서 int a를 하였지만 다른 메모리영역에 저장되어서 선언이 가능하다
		
		System.out.println("메서드를 호출한다.");
		return ;
	}
	
	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		int result = 0;
		
		Ex04 ex = new Ex04();
		ex.print(10);
		ex.print(b);;
		ex.print(result);
	}

}
