package chapter25_design_patten.singleton;

public class MySingleton_01 {

	public static void main(String[] args) {
		//4. 외부에서 사용하는 코드 만들기.
		//외부 클래스에서 Company를 생성할 수 없으므로 static으로 제공되는 getInstance() 메서드를 호출.
		Company company1 = Company.getInstance();//클래스 이름으로 getInstance() 호출하여 참조 변수에 대입.
		Company company2 = Company.getInstance();
		//Company company = new Company();
		
		System.out.println(company1 == company2);//두 변수가 같은 주소인지 확인.
		System.out.println(company1);//chapter26_design.singleton.Company@626b2d4a
		System.out.println(company2);//chapter26_design.singleton.Company@626b2d4a
		
	}

}
