package chapter24_collection.Test02;

public class Member {
	String num;
	String name;
	
	Member(String num, String name){
		this.num = num;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return num + ":" + name;
	}

	@Override
	public int hashCode() {
		return this.num.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.num == member.num) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	
}
