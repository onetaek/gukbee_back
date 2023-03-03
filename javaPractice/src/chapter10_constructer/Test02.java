package chapter10_constructer;



class Person {
	private String name;
	private String mobile;
	private String office;
	private String email;
	
	public Person(String name, String mobile, String office, String email) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.office = office;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Person{name='"+name+"', mobile='"+mobile+"', "
				+ "office='"+office+"', email='"+email+"'}";
	}
	
}

public class Test02 {

	public static void main(String[] args) {
		Person person = new Person("오원택","010-1234-5678","053-567-8765","모하지@naver.com");
		System.out.println(person);
		person.setEmail("모가지@kakao.com");
		person.setMobile("010-7777-7777");
		System.out.println(person);
		
	}

}

