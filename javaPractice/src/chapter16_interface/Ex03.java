package chapter16_interface;

interface Camera{
	void photo();
}
interface Call{
	void calling();
}
interface Memo{
	void write();
}
interface Clock{
	void clock();
}
class MyCellPhone implements Camera,Call,Memo,Clock{

	@Override
	public void clock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		
	}
	
}

class PhoneUser{
	void call(Call c) {
		System.out.println("전화를 걸었습니다.");
	}
}


public class Ex03 {

	public static void main(String[] args) {
		MyCellPhone phone1 = new MyCellPhone();
		Camera phone2 = new MyCellPhone();
		Call phone3 = new MyCellPhone();
		Memo Phone4 = new MyCellPhone();
		Clock phone5 = new MyCellPhone();
		
		PhoneUser user1 = new PhoneUser();
		user1.call(phone3);
		user1.call(phone1);
		user1.call((MyCellPhone)phone2);
		user1.call((MyCellPhone)Phone4);
		user1.call((MyCellPhone)phone5);
	}

}
