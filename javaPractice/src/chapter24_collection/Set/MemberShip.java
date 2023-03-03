package chapter24_collection.Set;

public class MemberShip {
	String name;
	int age;
	
	MemberShip(String name, int age){
		this.name = name;
		this.age = age;
	}
	/**
	 * set은 hashCode()와 equals()를 사용하여 둘다 동일할경우
	 * 같은 객체라고 판단한다. 이를 이용해서 두개의 메소드를 overriding해서
	 * name과  age가 같으면 같은 객체라고 판단하도록 만든다.
	 */
	@Override
	public int hashCode() {
		//name과 age값이 같으면 동일한 hashcode반환
		return name.hashCode() + age;//String의 hashCode()이용
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MemberShip) {
			MemberShip memberShip = (MemberShip) obj;
			System.out.println("memberShip.name: "+memberShip.name);
			System.out.println("name: "+name);
			System.out.println("memberShip.age: "+memberShip.age);
			System.out.println("age: "+age);
			return memberShip.name.equals(name)&&(memberShip.age==age);
		}else {
			return false;
			
		}
	}
	
	
}
