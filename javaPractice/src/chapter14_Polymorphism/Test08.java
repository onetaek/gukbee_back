package chapter14_Polymorphism;

class Pet{
	private String name;
	private String masterName;
	public Pet(String name, String masterName) {
		super();
		this.name = name;
		this.masterName = masterName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMasterName() {
		return masterName;
	}
	public void introduce() {
		System.out.println("★ 내 이름은 " + name + "입니다!");
		System.out.println("★ 주인님은 " + masterName + "입니다!");
	}
	
	
}
class RobotPet extends Pet{

	public RobotPet(String name, String masterName) {
		super(name, masterName);
		// TODO Auto-generated constructor stub
	}
	public void introduce() {
		System.out.println("◆ 저는 로봇입니다 이름은 " + getName() + "입니다!");
		System.out.println("◆ 주인님은 " + getMasterName() + "입니다!");
	}
	public void work(int sw) {
		switch(sw) {
		
		case 0:
			System.out.println("청소를 합니다.");
			break;
		case 1:
			System.out.println("빨래를 합니다.");
			break;
		case 2:
			System.out.println("밥을 짓습니다.");
			break;
		}
	}
	
}

public class Test08 {

	public static void main(String[] args) {
		Pet krut;
		krut = new Pet("Kurt","아이");
		krut.introduce();
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("R2D2","루크");
		r2d2.introduce();
		r2d2.work(0);
		System.out.println();
		
		Pet toy = new RobotPet("toy","아이2");
		toy.introduce();
		//toy.work(0);
		System.out.println("-------------");
		
		Pet p = r2d2;
		p.introduce();
		
		System.out.println();
		r2d2.setName("아이로봇");
		r2d2.introduce();
		p.introduce();
	}

}
