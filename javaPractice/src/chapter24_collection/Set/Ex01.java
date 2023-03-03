package chapter24_collection.Set;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Ex01 {

	public static void main(String[] args) {
		Set<MemberShip> set = new HashSet<MemberShip>();
		
		//인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장
		set.add(new MemberShip("홍길동",30));
		set.add(new MemberShip("홍길동",30));
		
		//Iterator<MemberShip> iter = set.iterator();
		
		
		
		System.out.println("총 객체수: "+set.size());
	}

}
