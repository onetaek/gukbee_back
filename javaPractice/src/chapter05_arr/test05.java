package chapter05_arr;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] com_arr = new int[5];
		int rand = 0;
		boolean run = true;
		int my_num = 0;
		int com_idx = 0;
		int com_win = 0;
		int my_win = 0;
		String com_str = null;
		String my_str = null;
		for (int i = 0; i < com_arr.length; i++) {
			rand = (int) Math.ceil(Math.random() * 3);
			com_arr[i] = rand;
			//com_arr[i] = 
		}
		while (run) {
			if (com_idx > 4){
				break;
			}
			System.out.print("가위바위보!: ");
			my_num = Integer.parseInt(sc.nextLine());
			if (com_arr[com_idx] == 1) {
				com_str = "가위";
			} else if (com_arr[com_idx] == 2) {
				com_str = "바위";
			} else if (com_arr[com_idx] == 3) {
				com_str = "보";
			}
			if (my_num == 1) {
				my_str = "가위";
			} else if (my_num == 2) {
				my_str = "바위";
			} else if (my_num == 3) {
				my_str = "보";
			}
			if (com_arr[com_idx] == my_num) {
				System.out.println("com: " + com_str + "  vs  나: " + my_str);
				System.out.println("비겼습니다.");
				System.out.println("--------------");
				continue;
			} else if (com_arr[com_idx] == 1 && my_num == 3) {
				System.out.println("com: " + com_str + "  vs  나: " + my_str);
				System.out.println("컴퓨터가 이겼습니다.");
				com_win++;
				com_idx++;
			} else if (com_arr[com_idx] == 1 && my_num == 2) {
				System.out.println("com: " + com_str + "  vs  나: " + my_str);
				System.out.println("당신이 이겼습니다.");
				my_win++;
				com_idx++;
			} else if (com_arr[com_idx] == 2 && my_num == 1) {
				System.out.println("com: " + com_str + "  vs  나: " + my_str);
				System.out.println("컴퓨터가 이겼습니다.");
				com_win++;
				com_idx++;
			} else if (com_arr[com_idx] == 2 && my_num == 3) {
				System.out.println("com: " + com_str + "  vs  나: " + my_str);
				System.out.println("당신이 이겼습니다.");
				my_win++;
				com_idx++;
			} else if (com_arr[com_idx] == 3 && my_num == 1) {
				System.out.println("com: " + com_str + "  vs  나: " + my_str);
				System.out.println("당신이 이겼습니다.");
				my_win++;
				com_idx++;
			} else if (com_arr[com_idx] == 3 && my_num == 2) {
				System.out.println("com: " + com_str + "  vs  나: " + my_str);
				System.out.println("컴퓨터가 이겼습니다.");
				com_win++;
				com_idx++;
			}
			System.out.println("현재 score(com : 당신 ) >>> "+com_win+" : "+my_win);
			System.out.println("--------------");
		}
		if(com_win > my_win) {
			System.out.println("컴퓨터가 "+com_win+"번 당신이 "+my_win+"번 이겨서 컴퓨터가 이겼습니다.");
		}else {
			System.out.println("컴퓨터가 "+com_win+"번 당신이 "+my_win+"번 이겨서 당신이 이겼습니다.");
		}
	}

}
