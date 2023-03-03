package chapter12_inheritance;

class Tv{
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	};
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class Ex03 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		
		ctv.displayCaption("안녕");
		ctv.caption = true;
		ctv.displayCaption("안녕");
	}

}
