package chapter19_innerClass;

class A{
	class InstanceInner{}//내부 클래스
	
	static class StaticInner{} //static 내부 클래스. 스태틱 멤버간의 접근 가능
	
	StaticInner st1 = new StaticInner();
	
	//인스턴스 멤버간의 접근 가능
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() {
		//스태틱 멤버가 스태틱 내부 클래스에 접근 가능
		StaticInner st2 = new StaticInner();
		
		//스태틱 멤버는 인스턴스 멤버에 접근 불가
		//InstanceInner ii2 = new InstanceInner();//에러 발생
	}
	
	void instanceMethod() {
		//인스턴스 멤버는 모두 접근 가능
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
	}
}



public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
