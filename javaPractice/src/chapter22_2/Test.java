package chapter22_2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in); // �ܼ� �Է� ���
		ShopProduct sp = new ShopProduct(); // ��ǰ ����
		ShopCart sc = new ShopCart();
		
		System.out.println("01. ȸ�� ���� ����");
		System.out.println("ȸ�� ���� ������ �Է��ϼ���.");
		
		System.out.print("���̵�: ");
		String memberID = stdIn.nextLine();
		System.out.print("��й�ȣ: ");
		String password = stdIn.nextLine();
		System.out.print("�̸�: ");
		String name = stdIn.nextLine();
		
		// ȸ�� ���� ���� Ŭ������ �����ڿ��� ���̵�, ��й�ȣ, �̸� ����
		MemberInsert m = new MemberInsert(memberID, password, name);
		m.updateAddInfo();
		m.printMemberInfo();
		System.out.println("ȸ�� ������ �ּż� �����մϴ�.");
		System.out.println("01. ȸ�� ���� ����");
		System.out.println("");
		
		System.out.println("02. �α��� ����");
		m.login();
		System.out.println("02. �α��� ����");
		System.out.println("");
		
		System.out.println("03. ��ٱ��� ����");
		System.out.println("�������� ���� ������ ��ǰ�Դϴ�..");
		sp.printProduct(); // ��ǰ ����
		sc.selectProduct(); // ��ǰ�� ����
		
		System.out.println("��ٱ��Ͽ� ���� ��ǰ�� �Ʒ��� �����ϴ�.");
		sc.printCart(); // ��ٱ��Ͽ� ���� ��ǰ ���
		System.out.println("03. ��ٱ��� ����");
		System.out.println("");
	}
}
