package chapter24_collection;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//String 객체 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Serverlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		int size = list.size(); //저장된 총 객체수 얻기
		System.out.println("총 객체수: "+size); // 총 객체수: 5
		System.out.println();
		
		String skill =list.get(2); //2번 인덱스에 저장된 객체 얻기
		System.out.println("2: " + skill );
		System.out.println();
		
		//저장된 객체 출력
		for(int i = 0 ; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ ":"+ str);
		}
		
		
		
		
		
	}

}
