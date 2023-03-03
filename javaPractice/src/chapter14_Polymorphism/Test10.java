package chapter14_Polymorphism;

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

public class Test10 {

	public static void action(Robot r) {

		
		if (r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		}
		if (r instanceof SingRobot) {
			((SingRobot) r).sing();
		}
		if (r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };

		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}

	}

}
