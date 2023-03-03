package chapter22_login_shop;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class MemberInsert {
	String memberID;
	String password;
	String name;
	Member m;
	
	MemberInsert(String memberID, String password, String name){
		Member m = new Member(memberID,password,name);
		this.m = m;
	}
	Scanner sc = new Scanner(System.in);
	
	void updateAddInfo() {
		
		System.out.println("추가 정보를 입력하시겠습니까?");
		System.out.print("추가 정보를 입력하시려면 Y,그만 하실려면 N을 입력해주십시요.>>>");
		String sel = sc.nextLine();
		if(sel.equals("Y")) {
			System.out.print("주소를 입력해 주십시요.>>>");
			String address = sc.nextLine();
			m.setAddress(address);
			System.out.print("이메일 입력해 주십시요.>>>");
			String email = sc.nextLine();
			m.setEmail(email);
			System.out.println();
		}else if(sel.equals("N")) {
			return;
		}
	}
	
	void printMemberInfo() {
		System.out.println(m);
	}
	
	void login() {
		System.out.println("로그인 정보를 입력해 주세요.");
		while(true) {
			
			System.out.println();
			System.out.print("아이디를 입력해 주세요 >>>");
			String id = sc.next();
			System.out.print("비밀번호를 입력해 주세요 >>>");
			String pwd = sc.next();
	
			if(!id.equals(m.getMemberId())  || !pwd.equals(m.getPassword()) ) {
				System.out.println("로그인 정보가 정확하지 않습니다.");
			}else {
				System.out.println("로그인 되었습니다.");
				return;
			}
		}
		
	}
	
}
