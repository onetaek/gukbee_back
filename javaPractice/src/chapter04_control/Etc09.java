package chapter04_control;

public class Etc09 {

	public static void main(String[] args) {
		String medal = "Silver";
		switch (medal) {
		case "Gold":
			System.out.println("Gold");
			break;
		case "Silver":
			System.out.println("Silver");
			break;
		case "Bronze":
			System.out.println("Bronze");
			break;
		default:
			System.out.println("메달없음");

		}
	}
}
