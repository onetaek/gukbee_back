package chapter06_method;

import java.util.Scanner;

public class test05 {
	
	private static void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

	private static boolean login(String id, String pwd) {
		return (id.equals("test") && pwd.equals("1234")) ? true : false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pwd;
		System.out.print("아이디를 입력해 주세요 >>");
		id = sc.nextLine();
		System.out.print("비밀번호를 입력해 주세요 >>");
		pwd = sc.nextLine();
		
		boolean result = login(id,pwd);
		if(result) {
			System.out.println("로그인 되었습니다.");
			logout(id);
		}else {
			System.out.println("id또는 password가 올바르지 않습니다.");
		}
	}

	

}
