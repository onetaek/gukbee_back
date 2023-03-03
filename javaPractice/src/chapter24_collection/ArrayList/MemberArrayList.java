package chapter24_collection.ArrayList;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		this.arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);//회원을 추가
	}
	
	public boolean removeMember(int memberID) {
//		for(int i = 0 ; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i); // get()메서드로 회원을 순차적으로 가져옴.
//			if(member.getMemberID()==memberID) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		for(Member member : arrayList) {
			if(member.getMemberID() == memberID) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberID+"가 존재하지 않습니다.");//반복문을 돌려서 해당 아이드를 찾지 못한경우
		return false;
	}
	
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
