package chapter04_control;

public class Etc02 {

	public static void main(String[] args) {
		int age = 25;
//		if(age > 19) {
//			System.out.println("성인입니다.");
//			System.out.println("성인요금이 적용됩니다.");
//			
//		}else {
//			System.out.println("청소년입니다.");
//			System.out.println("청소년요금이 적용됩니다.");
//			
//		}
//		System.out.println("결제를 진행해 주세요.");
		
//		<내가한거>
		String a = age > 19 ? "성인" : "청소년";
		System.out.println(a+"입니다.");
		System.out.println(a+"요금이 적용됩니다.");
		System.out.println("결제를 진행해 주세요.");
		
//		<강사님>
		System.out.println(age>19?"성인입니다.\n성인요금이 적용됩니다.":"청소년입니다.\n청소년요금이 적용됩니다.");
		System.out.println("결제를 진행해주세요");
	}

}
