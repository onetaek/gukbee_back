package chapter16_interface;

interface Skinnable{
	int BLACK = 0;//public static final 생략
	int RED = 1;
	int GREEN = 2;
	int BLUE = 3;
	int LEOPARD = 4;
	void changeSkin(int skin);//public abstract 생략
}

class PortablePlayer implements Player, Skinnable{
	private int skin = BLACK;
	public PortablePlayer() {}//생성자
	@Override
	public void changeSkin(int skin) {
		// TODO Auto-generated method stub
		System.out.print("스킨을 ");
		switch(skin) {
		case BLACK:System.out.print("검정"); break;
		case RED: System.out.print("빨강");break;
		case GREEN: System.out.print("녹색");break;
		case BLUE: System.out.print("파랑");break;
		case LEOPARD: System.out.print("표범 무늬");break;
		default: System.out.print("기본값:");break;
		}
		System.out.println("(으)로 변경했습니다.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("◆ 재생시작!");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("◆ 정시");
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		PortablePlayer a = new PortablePlayer();
		a.play();
		a.stop();
		a.changeSkin(Skinnable.LEOPARD);
	}

}
