package chapter18_shopping;

//쇼핑몰 규격을 정의한 인터페이스, 모든 쇼핑몰은 IShop인터페이스를 구현해야함
public interface IShop {
	// 쇼핑몰 클래스를 구현할 때 함께 구현해야 하는 충상 메서드
	public abstract void setTitle(String title);// 쇼핑몰 제목(이름)을 설정.
	public abstract void genUser();//쇼핑몰을 이용할 수 있는 예제 사용자들을 생성
	public abstract void genProduct();//쇼핑몰의 예제 상품을 생성
	public abstract void start();//쇼핑몰 프로그램을 실행하는 시작 메서드
}
