package chapter16_interface;

interface Player{
	void play();
	void stop();
}

class VideoPlayer implements Player{
	
	private int id;
	private static int count = 0;
	
	public VideoPlayer() {
		id = ++count;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("■ 비디오 재생시작!");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("■ 비디오 재생종료!");
	}
	 
	public void printInfo() {
		System.out.println("이 기계의 제조번호는 [" + id + "]입니다.");
	}
	
}

class CDPlayer implements Player{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		Player[] a = new Player[2];
		a[0] = new VideoPlayer();
		a[1] = new CDPlayer();
		
		for(Player p : a) {
			p.play();
			p.stop();
			System.out.println();
		}
		
		VideoPlayer[] b = new VideoPlayer[4];
		for(int i = 0 ; i < b.length; i++) {
			b[i] = new VideoPlayer();
		}
		b[b.length - 1].printInfo();
	}
}
