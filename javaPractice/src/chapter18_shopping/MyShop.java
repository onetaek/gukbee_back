package chapter18_shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop{
	//등록 회원 정보 배열
	//이름과 지불방법이 있다.
	User[] users = new User[50];
	
	//등록 상품 저옵 배열
	//상품명, 가격의 정보가있다.(추상클래스여서 다른 클래스에서 상속할것이다)
	Product[] products = new Product[4];
	
	//상품 추가를 위한 장바구니
	ArrayList<Product> cart = new ArrayList<Product>();
	
	//키보드 입력으로 문자열 입력받기 위한 Scanner 객체 생성
	Scanner scan = new Scanner(System.in);
	
	//선택된 사용자 index보관
	int selUser;
	
	//쇼핑몰 이름
	String title;
	
	//유저수를 기억할 변수
	int userCnt = 0;
	
	@Override
	public void genUser() {
		// TODO Auto-generated method stub
		User user = new User("홍길동",PayType.CARD);
		users[userCnt++] = user;
		user = new User("블로거",PayType.CASH);
		users[userCnt++] = user;
		
	}
	
	public void addUser() {
		System.out.print("사용자의 이름을 입력하시오: ");
		String userName = scan.next();
		System.out.print("사용자의 결제 방법을 선택하시오(1>>CASH, 2>>CARD): ");
		String PayTypeNum = scan.next();
		PayType paytype = null;
		if(PayTypeNum.equals("1")) {
			paytype = PayType.CASH;
		}else if(PayTypeNum.equals("2")) {
			paytype = PayType.CARD;
		}
		User user = new User(userName,paytype);
		users[userCnt++] = user;
	}
	
	@Override
	public void genProduct() {
		// TODO Auto-generated method stub
		CellPhone cellPhone = new CellPhone("1111","갤럭시 노트5",1000000,"SKT","삼성");
		products[0] = cellPhone;
		cellPhone = new CellPhone("2222","애플 아이폰7",980000,"KT","Apple");
		products[1] = cellPhone;
		SmartTV smartTV = new SmartTV("3333","삼성 3D Smart TV",5000000,"4K");
		products[2] = smartTV;
		smartTV = new SmartTV("4444","LG Smart TV",2500000,"Full HD");
		products[3] = smartTV;
	}
	
	@Override
	public void setTitle(String title) {
		this.title = title;	
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(title+" : 메인 화면 - 계정 선택");
		System.out.println("==========================");
		int i = 0;
		
		//등록된 사용자 정보 출력
		for(User user : users) {
			if(user == null) break;
			System.out.println("[" + i++ +"]" + user.getName()+"(" + user.getPayType() + ")");
		}
		
		System.out.println("[+]사용자 추가");
		System.out.println("[x]종 료");
		System.out.print("선택 : ");
		String sel = scan.next();
		System.out.println("## "+sel+"선택 ##");
		
		//선택된 메뉴에 따라 처리
		switch(sel) {
		case "x":
			System.exit(0);
			break;
		case "+":
			addUser();
			start();
		default:
			selUser = Integer.parseInt(sel);
			System.out.println("## "+users[selUser].getName()+"님 반갑습니다. ##");
			productList();
		}
		
	}

	public void productList() {
		System.out.println(title+" : 상품목록 - 상품 선택");
		System.out.println("==========================");
		int i = 0;
		
		for(Product product : products) {
			System.out.print("[" + i + "]");
			product.printDetail();
			i++;
		}
		System.out.println("[h]메인화면");
		System.out.println("[c]체크와웃");
		System.out.print("선택 : ");
		String sel = scan.next();
		System.out.println("## "+sel+"선택 ##");
		
		//선택된 메뉴에 따라 처리
		switch(sel) {
		case "h":
			start();
			break;
		case "c":
			checkOut();
			break;
		default:
			int psel = Integer.parseInt(sel);
			products[psel].cont += 1;
			cart.add(products[psel]);
			productList();
		}
	}
	/**
	 * 결제를 위한 체크아웃 처리 메서드
	 */
	public void checkOut() {
		System.out.println(title+" : 체크아웃");
		System.out.println("==========================");
		int total = 0;
		int i = 0;
		
		
		//장바구나에 등록된 상품 정보 출력
		for(Product p : cart) {
			//System.out.println("["+ i++ +"]"+p.pname+"("+p.price+")");
			total += p.price;
		}
		for(Product p : products) {
			System.out.println("수량: "+p.cont+"개, "+p.pname+"("+p.price+")");
		}
		System.out.println("===========================");
		
		//선택한 사용자의 결제 방법 출력
		System.out.println("결제 방법: "+users[selUser].getPayType());
		
		//합계 출력
		System.out.println("합계: "+total + "원 입니다.");
		System.out.println("[p]이전 , [q]결제 완료");
		System.out.print("선택 : ");
		String sel = scan.next();
		
		//선택됨 메뉴에 따라 처리
		switch(sel) {
		case "q" : System.out.println("## 결제가 완료 되었습니다. 종료합니다. ##");
			System.exit(0);break;
		case "p":productList();break;
		default:checkOut();
		}
	}

	

	

	
	
	
}
