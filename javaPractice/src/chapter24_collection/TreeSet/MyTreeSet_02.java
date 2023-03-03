package chapter24_collection.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompareInt implements Comparator<Integer>{
	
	//정렬 기준을 정하는 메소드를 오버라이딩
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2) * -1;
	}
	
}

public class MyTreeSet_02 {

	public static void main(String[] args) {
		TreeSet<Integer> score = new TreeSet<Integer>(new MyCompareInt());
		
		score.add(90);
		score.add(100);
		score.add(85);
		score.add(65);
		score.add(50);
		score.add(75);
		score.add(90);
		
		System.out.println(score); //[50, 65, 75, 85, 90, 100]
		
		Integer value = null;
		value = score.first();
		print("가장 낮은 점수",value);
		value = score.last();
		print("가장 높은 점수",value);
		value = score.lower(85);
		print("85 바로 이전 점수",value);
		value = score.higher(85);
		print("85 바로 다음 점수",value);
		value = score.floor(85);
		print("85 또는 바로 이전 점수",value);
		value = score.ceiling(85);
		print("85 또는 바로 다음 점수",value);
		
		while(!score.isEmpty()) {
			value = score.pollLast(); //가장 큰 값을 반환 후 삭제
			print("현재 가장 높은 점수",value);
		}
	}

	private static void print(String string, Integer value) {
		System.out.println(string+": "+value);
		
	}

	

}
