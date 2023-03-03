package chapter15_abstract;

abstract class Pokemon{
	String name;
	
	abstract void attack();
	abstract void sound();
	
	public String getName() {
		return this.name;
	}
}

class Pikachu extends Pokemon{

	Pikachu(){
		this.name = "피카츄";
	}
	
	@Override
	void attack() {
		// TODO Auto-generated method stub
		System.out.println("전기 공격");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("피카피카!");
	}
	
}

class Squirtle extends Pokemon{
	
	Squirtle(){
		this.name = "꼬부기";
	}
	
	@Override
	void attack() {
		// TODO Auto-generated method stub
		System.out.println("물 공격");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("꼬북 꼬북");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		Pikachu p1 = new Pikachu();
		System.out.println("이 포켓몬은 "+p1.getName());
		p1.attack();
		p1.sound();
		
		Squirtle s1 = new Squirtle();
		System.out.println("이 포켓몬은 "+s1.getName());
		s1.attack();
		s1.sound();
	}

}
