package chapter10_constructer;
class Rocket{
	private int x;
	private int y;
	public Rocket(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void moveUp() {
		y++;
	}
	public String printInfo() {
		return "Rocket("+x+","+y+")";
	}
}
public class Test01 {
	/*
	 * 클래스 작성 및 객체 생성
	 * 로켓을 나타내는 Pocket 클래스를 작성하라.
	 * Rocket 클래스는 다음과 같은 필드와 메서드르 가진다.
	 * # 필드
	 *  x, y : 현재 로켓의 위치
	 *  # 메서드
	 *  Rocket(x,y) : 현재 로켓의 위치
	 *  printInfo() : 로켓 정보를 문자열로 변환하는 메서드
	 *  moveUp() : 로켓의 y 좌표가 1만큼 증가
	 * */
	
	public static void main(String[] args) {
		Rocket rocket = new Rocket(10,20);
		System.out.println(rocket.printInfo());
		rocket.moveUp();
		rocket.moveUp();
		System.out.println(rocket.printInfo());
	}

}
