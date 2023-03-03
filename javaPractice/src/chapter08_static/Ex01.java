package chapter08_static;
class Cars{
	static int wheel = 4;
	int speed;
}

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 인스턴스 변수는 가가각의 인스턴스마다 고유의 저장 공가을 자기고 있기 때문에 별개의 조정이 가능.
		 * 클래스변수는 1)하나의 저장 공간을 모든 인스턴스가 함꼐 공유하기 때문에
		 * 하나의 참조변수로 값을 변경하더라도 모든 인스턴스의 값이 변하게 됨.
		 * 2) 인스턴스 생성전에 접근가능하기하기 때문에 클래스 이름으로 접근이됨.
		 * */
		System.out.println(Cars.wheel);
		//System.out.println(Cars.speed);
		
		Cars myCar1 = new Cars();
		
		
		System.out.println(Cars.wheel);
		System.out.println(myCar1.speed);
		
		Cars myCar2 = new Cars();
		
		System.out.println("<변경전>");
		System.out.println("myCar1.speed:" + myCar1.speed);
		System.out.println("myCar2.speed:" + myCar2.speed);
		System.out.println("myCar1.wheel:" + myCar1.wheel);
		System.out.println("myCar2.wheel:" + myCar2.wheel);
		
		myCar2.speed = 100;
		myCar2.wheel = 5;
		System.out.println("<변경후>");
		System.out.println("myCar1.speed:" + myCar1.speed);
		System.out.println("myCar2.speed:" + myCar2.speed);
		System.out.println("myCar1.wheel:" + myCar1.wheel);
		System.out.println("myCar2.wheel:" + myCar2.wheel);
	}

}
