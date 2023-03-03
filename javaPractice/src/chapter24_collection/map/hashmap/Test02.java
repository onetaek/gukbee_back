package chapter24_collection.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Test02 {
	/**
	 * 아이디와 비밀번호 검사하기
	 * 아이디 비번을 입력 받아서 map에 지정된 값과 비교를 해서
	 * 1) 동일한 아이디 비번이 있는 겨웅에은 "로그인 되었습니다."
	 * 2) 동일한 아이디는 있는데 비번일 틀릴 경우 "비밀번호가 일치하지 않습니다."
	 * 3) 동일한 아이디가 없으면 "입력하신 아이디가 존재하지 않습니다." 가 출력되도록 하라.
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>(); //키와 값으로 String을 사용
		
		//아이디와 비밀번호를 미리 저장
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해 주세요.");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
			
//			if(map.containsKey(id) && map.containsValue(password)) {
//				System.out.println("로그인 되었습니다.");
//				return;
//			}else if( map.containsKey(id) && !map.containsValue(password)){
//				System.out.println("비밀번호가 일치하지 않습니다.");
//				return;
//			}else if( !map.containsKey(id)) {
//				System.out.println("입력하신 아이디가 존재하지 않습니다.");
//				return;
//			}else {
//				System.out.println("error");
//				return;
//			}
		}
	}

}
