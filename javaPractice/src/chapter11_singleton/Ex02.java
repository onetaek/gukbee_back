package chapter11_singleton;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopService ss1 = ShopService.getInstance();
		ShopService ss2 = ShopService.getInstance();
		
		if(ss1 == ss2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}

}
