package chapter24_collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: "+size);
		
		System.out.println("foreach문으로 출력 시작");
		for(String s: set) {
			System.out.println("\t" +s);
		}
		System.out.println();
		
		Iterator<String> iterator = set.iterator();//반복자 얻기
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");//1개의 객체 삭제
		set.remove("iBATIS");//1개의 객체 삭제
		
		System.out.println("총 객체수: "+set.size());
		
		System.out.println("foreach 문으로 출력 시작");
		for(String s: set) {
			System.out.println("\t"+s);
		}
		System.out.println();
		
		set.clear();//모든 객체를 제거하고 비움.
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
		
	}

}
