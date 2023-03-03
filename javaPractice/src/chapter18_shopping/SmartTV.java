package chapter18_shopping;

public class SmartTV extends Product{
	
	String resolution; //해상도
	
	
	public SmartTV(String code,String pname, int price, String resolution){
		this.code = code;
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
		
	}
	
	@Override
	public void printExtra() {
		//추상 클래스에 정의된 추상 메서드를 오버라이딩.
		//추가 정보인 해상도 정보를 출력.
		System.out.println("해상도: "+resolution);
	}
	
}
