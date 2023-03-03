package chapter18_shopping;

public class CellPhone extends Product{
	String carrier;
	String maker;
	
	public CellPhone(String code,String pname, int price, String carrier,String maker) {
		this.code = code;
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
		this.maker = maker;
	}
	
	@Override
	public void printExtra() {
		System.out.print("통신사: "+carrier);
		System.out.println("제조사: "+maker);
	}

}
