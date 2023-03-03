package chapter16_interface;

class JapanTour implements Providable{

	@Override
	public void leisureSports() {
		System.out.println("도쿄타워 번지점프 투어");
	}

	@Override
	public void sightseeing() {
		System.out.println("오사카 관람투어");
	}

	@Override
	public void food() {
		System.out.println("초밥 투어");
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		TourGuide g2 = new TourGuide(new JapanTour());
		g2.leisureSports();
		g2.sightseeing();
	}

}
