package chapter24_collection.LinkedList;

public class MemberMain {
	public static void main(String[] args) {
		MemberLinkedList memberLinkedList = new MemberLinkedList();
		
		//새로운 회원 인스턴스 생성
		Member lee = new Member(1001,"이승우");
		Member son = new Member(1002,"손흥민");
		Member park = new Member(1003,"박지성");
		Member hong = new Member(1004,"홍창현");
		
		//ArrayList에 회원 추가
		//memberLinkedList.addMember(lee);
		//memberLinkedList.addMember(son);
		//memberLinkedList.addMember(park);
		//memberLinkedList.addMember(hong);
		
		memberLinkedList.showAllMember();//전체회원 출력
		
		memberLinkedList.removeMember(hong.getMemberID());//회원 삭제
		memberLinkedList.showAllMember();
	}

}
