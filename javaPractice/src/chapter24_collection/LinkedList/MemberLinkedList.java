package chapter24_collection.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

import chapter24_collection.ArrayList.Member;

public class MemberLinkedList {
private LinkedList<Member> linkedList;
	
	public MemberLinkedList() {
		this.linkedList = new LinkedList<Member>();
	}
	
	public void addMember(Member member) {
		linkedList.add(member);//회원을 추가
	}
	
	public boolean removeMember(int memberID) {
//		for(int i = 0 ; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i); // get()메서드로 회원을 순차적으로 가져옴.
//			if(member.getMemberID()==memberID) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		for(Member member : linkedList) {
			if(member.getMemberID() == memberID) {
				linkedList.remove(member);
				return true;
			}
		}
		System.out.println(memberID+"가 존재하지 않습니다.");//반복문을 돌려서 해당 아이드를 찾지 못한경우
		return false;
	}
	
	
	public void showAllMember() {
		for(Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
