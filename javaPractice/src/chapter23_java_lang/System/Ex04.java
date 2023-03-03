package chapter23_java_lang.System;
/*
 * 참조현 변수끼리 대입하면 참조 복사가 되기 때문에 같은 대상을 가르킴.
 * 독립적인 사본을 만들 때는 clone() 메서드를 사용.
 * 완전한 사본을 만들어 복사본을 리턴.
 * */

class Point{//원점을 의미하는 Point클래스.
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + "," + "y = " + y;
	}
}

class Circle implements Cloneable{//개체를 복제해도 된다는 의미로 Coneable인터페이스를 함께 선언.
	//Cloneable을 구현해야 복제 가능.
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		point = new Point(x,y);
		this.radius = radius;
	}
	
	public String toString() {
		return"원점은 " +point + "이고, "+"반지름은 " +radius + "입니다";
	}
	
	public Object clone() throws CloneNotSupportedException{//clone메서드를 사용할 때 발생할 수 있는 오류를 예외 처리함.
		return super.clone();
		
	}
}

public class Ex04 {

	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 * Object clone() : 객체를 복제하여 동일한 멤버 변수를 가진 인스턴스를 생성.
		 * 객체를 복제해 또 다른 객체를 반환.
		 * 객체 원본을 유지해 놓고 복사본을 사용한다거나, 기본 틀(prototype)의 복사본을 사용해 
		 * 동일한 인스턴스를 만들어 복잡한 생성과정을 간단히 하려는 경우 사용.
		 * */
		//clone() 메서드로 인스턴스 복제학.
		Circle circle = new Circle(10,20,30);
		Circle copyCircle = (Circle)circle.clone(); //clone() 메서드를 사용해 circle 인스턴스를 copyCircle에 복제함.
		
		//값은 동일.
		System.out.println(circle);//원점은 x = 10, y = 20이고, 반지름은 30입니다.
		System.out.println(copyCircle);//원점은 x = 10, y = 20이고, 반지름은 30입니다.
		
		//주소값은 다름.
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}

}
