package chapter16_interface;

interface Providable{
	void leisureSports();//public abstract 생략
	void sightseeing();
	void food();
}

class KoreaTour implements Providable{

	@Override
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
	}

	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}

	@Override
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}
	
}

class TourGuide{
	private Providable tour;
	TourGuide(Providable providable){
		/*inferface의 타입을 매개변수로받았다? -> 원래는 객체를 생성못한다. 
		-> 다형성을 이용해서 부모의 타입을 이용한 자식클래스를 이용해서
		 매개변수의 타입을 interface의 타입으로 지정했다는 것을 알 수 있다. 
		*/
		tour = providable;
	}
	//오버라이딩 아님.
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
}


public class Ex01 {

	public static void main(String[] args) {
		TourGuide guide = new TourGuide(new KoreaTour());
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		System.out.println();
		
	}

}
