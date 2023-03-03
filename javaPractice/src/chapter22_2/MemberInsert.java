package chapter22_2;

import java.util.Scanner;

// ȸ������ �� �α��� ���
public class MemberInsert extends Member {
	Scanner sc = new Scanner(System.in);
	// ȸ�� ���� �⺻ ���� �Է�
	public MemberInsert(String memberID, String password, String name) {
		super(memberID, password, name);
	}
	
	// ȸ�� �߰� ���� �Է�
	void updateAddInfo() {
		System.out.println("�߰� ������ �Է��Ͻðڽ��ϱ�?");
		System.out.print("�߰� ������ �Է��Ͻ÷��� Y, �׸��Ͻ÷��� N�� �Է��� �ֽʽÿ�.>>>" );
		String state = sc.nextLine();
		if(state.equals("y")||state.equals("Y")) { // �߰� ���� �Է��� ���� ��
			System.out.print("�ּҸ� �Է��� �ֽʽÿ�.>>> ");
			String UserAddress = sc.nextLine();
			System.out.print("�̸����� �Է��� �ֽʽÿ�.>>> ");
			String UserEmail = sc.nextLine();
			// �Է� ���� ���� ����
			super.setAddress(UserAddress);
			super.setEmail(UserEmail);
		}
		else if(state.equals("n")||state.equals("N")) {
			System.out.println("�߰� ������ �Է����� �ʾҽ��ϴ�.");
		}
	}
	// ȸ�������� ��� ���� ����
	void printMemberInfo() {
		System.out.println(super.toString());
	}
	// �α���
	void login() {
		System.out.println("�α��� ������ �Է��� �ּ���.");
		String loginID, loginPW;
		boolean state = true; // �α��� ���� ��ġ -> false
		while(state) {
			System.out.print("���̵� �Է��� �ּ��� >>> ");
			loginID = sc.nextLine();
			System.out.print("��й�ȣ�� �Է��� �ּ��� >>> ");
			loginPW = sc.nextLine();
			if(loginID.equals(super.getMemberID()) && loginPW.equals(super.getPassword())) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				state = false;
			}
			else {
				System.out.println("�α��� ������ ��Ȯ���� �ʽ��ϴ�.");
			}
		}
	}
}
