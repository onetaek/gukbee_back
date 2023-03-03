package chapter24_collection.map.hashmap;

public class Member implements Comparable<Member>{
	private int memberID; //회원 아이디
	private String memberName; // 회원 이름
	
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " +memberID + "입니다.";
	}
	
	@Override
	public int hashCode() {
		return memberID;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberID == member.memberID) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(Member member) {
		//비교하는 두 값 중 this 값이 더 크면 양수를 반환하여 오름차순을 ㅗ정렬.
		//메서드를 호출하는 객체가 인자로 넘어온 객체보다 작을 경우에은 음수를 리턴하고, 크기가 동일하다면 0, 클경우에는 양수를리턴.
		//return (this.emembeId - memeber.memeberID); //memberID가정수 이기 때문에 오른차순으로정렬.
		return (this.memberID = member.memberID) * (-1);
	}
}
