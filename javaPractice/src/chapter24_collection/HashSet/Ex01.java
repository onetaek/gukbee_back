package chapter24_collection.HashSet;

import java.util.HashSet;

public class Ex01 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("오원택"));
		hashSet.add(new String("오원택"));
		hashSet.add(new String("오원택"));
		hashSet.add(new String("오원택"));
		hashSet.add(new String("오원택"));
		
		//중복된 문자열은 제거되고 출력 순서와 입력 순서는 상관 없음.
		System.out.println(hashSet);
	}

}
