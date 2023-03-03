package chapter24_collection.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//새로운 회원 인스턴스 생성
		Member lee = new Member(1001,"이승우");
		Member son = new Member(1002,"손흥민");
		Member park = new Member(1003,"박지성");
		Member hong = new Member(1004,"홍창현");
		
		//ArrayList에 회원 추가
		memberArrayList.addMember(lee);
		memberArrayList.addMember(son);
		memberArrayList.addMember(park);
		memberArrayList.addMember(hong);
		
		memberArrayList.showAllMember();//전체회원 출력
		
		memberArrayList.removeMember(hong.getMemberID());//회원 삭제
		memberArrayList.showAllMember();
	}

}
