package chapter24_collection.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 일반적으로 Comparator 인터페이스 보다는 Comparable 인터페이스를 더 많이사용.
 * 다만 어떤 클래스가 이미 Comparable 인터페이스를 구현한 경우에 이 클래스의 정렬 방식을 정의할 때  Comparator
 * String 클래스가 Comparable 인터페이스를 구현했고, comparTo() 메서드는 오름차순을 구현
 * @author Administrator
 *
 */

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2) * -1;//String 클래스의 compartTo() 메서드를 반대로.
	}
	
}

public class MyTreeSet_03 {
	public static void main(String[] args) {
		//Set<String> set = new TreeSet<String>();
		//TreeSet 생성에 Comparator를 구현한 객체를 매개변수를 전달함.
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
		
	}
}
