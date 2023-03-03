package chapter24_collection.Test02;

import java.util.HashSet;

public class Ex01 {

	public static void main(String[] args) {
		HashSet<Member> set = new HashSet<Member>();
		set.add(new Member("100","김유신"));
		set.add(new Member("200","강감찬"));
		set.add(new Member("300","이순신"));
		set.add(new Member("400","정약용"));
		set.add(new Member("100","홍길동"));
		
		System.out.println(set); 
	}

}
