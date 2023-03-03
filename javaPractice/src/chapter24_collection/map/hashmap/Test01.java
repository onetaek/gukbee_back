package chapter24_collection.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test01 {
//HashMap에 아이디(String)와 점수(Integer)가 저장되어 있음
//실행 결과와 같이 평균 점수를 출력하고, 최고점수와 최고 점수를 받은 아이드를 출력할 것
	public static void main(String[] args) {
		
 		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;//최고 점수를 받은 아이디 저장
		int maxScore = 0;//최고 점수 저장
		int totalScore = 0;//점수 합계 저장
		
		//작성 위치
		Iterator<String> entrySet = map.keySet().iterator();
		while(entrySet.hasNext()) {
			String key = entrySet.next();
			int thisScore = map.get(key);
			totalScore += thisScore;
			if(thisScore > maxScore) {
				name = key;
				maxScore = thisScore;
			}
		}
		System.out.println("평균 점수 : "+ (double)totalScore / map.size() );
		System.out.println("최고 점수: " +maxScore);
		System.out.println("최고 점수를 받은 아이디 : "+ name);
	}
}
