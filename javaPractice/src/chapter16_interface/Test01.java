package chapter16_interface;

interface Weapon {
	public void fire(int power);

	public int getRestPower();

	public void charge(int power);
}

class MyWeapon implements Weapon {
	/*
	 * 게임프로그램에서 주어진 무기 인터페이스를이용하여 자신만의 무기클래스(MyWeapon)를 디자인하라. 단, 무기 클래스에는 int
	 * curPower필드가 있고, fire()는 curpower에서 power만큼 차감하고 charge()는 power만큼 curPower를
	 * 증가 시킨다.
	 */
	int curPower;
	
	@Override
	public void fire(int power) {
		curPower -= power;
	}

	@Override
	public int getRestPower() {
		return curPower;
	}

	@Override
	public void charge(int power) {
		this.curPower += power;
	}
	
}

class GameUnit {
	String user;
	 
	static int bossPower;
	GameUnit(String user){
		this.user = user;
	}
	
	void attack(int damage) {
		bossPower -= damage;
	}
	 
}

public class Test01 {
	/**
	 * GameUnit인스턴스는 두 개 생성한다. unitPower는 각 유닛에 공급되는
	 * 기본 power로 무기를 사용할 때 차감된다.
	 * bossPower는 클래스 변수로 생성되는 모든 GameUnit 인스턴스에 공유한다.
	 * 두 유닛에서의 공격으로 bossPower가 0이하가 되면 게임이 끝난다.(System.exit(1))
	 * 생성자에서는 파라미ㅌ로 각 유닛의 이름을 받아 초기화하고 무기 인스턴스를 만들어 unitPower로 무기충전한다.
	 */
	static int bossPower = 1000;
	private int unitPower = 500;
	private MyWeapon weapon;
	private String name;
	 
	public static void main(String[] args) {
		
		GameUnit u1 = new GameUnit("unit1");
		GameUnit u2 = new GameUnit("unit2");
		while(true) {
			u1.attack(500);
			u2.attack(50);
			
		}
	}

}
