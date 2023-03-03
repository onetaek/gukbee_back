package chapter25_design_patten.singleton;

public class Company {
	//1.생성자를 private으로 구현하기.
	//생성자의 접근제어자가 private이므로 외부 클래스에서 마음대로 Company 인스턴스를 생성 할 수 없음.
	//즉 Company 클래스 내부에서만 이 클래스의 생성을 제어할 수 있음.
	private Company() {}
	
	//2. 클래스 내부에 static으로 유일한 인스턴스 생성하기.
	//private으로 선언하여 외부에서 이 인스턴스로 접근하지 못하도록 제한해야 인스턴스 오류를 방지할 수 있음.
	private static Company instance = new Company(); //유일하게 생성한 인스턴스
	
	//3. 외부에서 참조할 수 있는 public 메서드 만들기
	//인스턴스를 반환하는 메서드는 반드시 static으로 선언해야 함.
	//getInstance() 메서드는 인스턴스 생성과 상관없이 호출할 수 있어야 하기 때문.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;//유일하게 생성한 인스턴스 반환.
	}
}
