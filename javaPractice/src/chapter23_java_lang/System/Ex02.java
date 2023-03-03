package chapter23_java_lang.System;
/*
 * void finalize()
 * new 연산자로 생성한 객체는 힙에 생성.
 * 메모리가 무한하지 않아 다 사용한 객체는 제거해야 함.
 * 자바에는 가비지 컬렉터가 주기ㅏ적으로 미사용 객체를 찾아 메로리를 회수하기 때문에~~
 * 메모리 회수가 자동으로 수행되서 메모리 누수를 걱정할 필요가 없으며 객체를 생성해서 사용하기만 하면됨.
 * 
 * 하지만 가비지 컬렉터의 기능은 메모리에만 국한되며 그 이외의 자원은 수작으로 해제해야 됨.
 * 예를 들어 네트워크에 연결하여 통신하는 클래스라면 연결하는 동작과 연결을 끊는 동작이 필요.
 * 아래의 코드에서 disconnect() 메소드 호출이 빠졌거나, 예외가 발생해 메서드가 호출되지 않아따면
 * 객체는 가비지 컬렉터에 의해 회수되지만 연결된 통신은 아무도 끊어주지 않아 연결이 된 상태로 남아있게됨
 * */

class Network{
	void connect() {
		System.out.println("연결되었습니다.");
	}
	void disconnect() {
		System.out.println("연결이 끊어졌습니다.");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Network network = new Network();
		network.connect();
		network.disconnect();
	}

}
