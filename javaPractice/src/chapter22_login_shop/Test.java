package chapter22_login_shop;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		ShopProduct sp = new ShopProduct();//상품관련
		ShopCart sc = new ShopCart();
		
		/*
		System.out.println("01. 회원 가입 시작");
		System.out.println("회원 가입 정보를 입력하세요.");
		
		System.out.print("아이디: ");
		String memberID = stdIn.nextLine();
		System.out.print("비밀번호: ");
		String password = stdIn.nextLine();
		System.out.print("이름: ");
		String name = stdIn.nextLine();
		System.out.println();
		
		//회원 가입 관련 클래스의 생성자에게 아이디, 비밀번호, 이름 전달
		MemberInsert m = new MemberInsert(memberID, password, name);
		m.updateAddInfo();//추가 정보 입력
		m.printMemberInfo();
		System.out.println("회원 가입해 주셔서 감사합니다.");
		System.out.println("01. 회원 가입 종료");
		System.out.println("");
		
		System.out.println("02. 로그인 시작");
		m.login();//로그인 처리
		System.out.println("02. 로그인 종료");
		System.out.println("");
		*/
		
		System.out.println("03. 장바구니 시작");
		System.out.println("상점에서 구매 가능한 상품입니다..");
		sp.printProduct();
		sc.selectProduct();
		System.out.println("장바구니에 담은 상품은 아래와 같습니다.");
		sc.printCart();
		System.out.println("03. 장바구니 종료");
		System.out.println("");
	}

}
