package chapter24_collection;

import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		//링크드 리스트에 요소 추가
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		
		System.out.println(linkedList);//리스트 전체 출력
		
		linkedList.add(1,"D");//1번 인덱스에 추가
		System.out.println(linkedList);
		
		linkedList.addFirst("O");//맨앞에 추가. LinkedList에서 사용
		System.out.println(linkedList);
		
		System.out.println(linkedList.removeLast());//removeLast() 맨뒤요소 삭제 LinkedList에서 사용
		System.out.println(linkedList);
	}
}
