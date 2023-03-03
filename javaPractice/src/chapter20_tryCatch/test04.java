package chapter20_tryCatch;

import java.util.Scanner;

public class test04 {
    private static final Scanner in = new Scanner(System.in);

    public static void input(){
        int age = 0;

        try {
            System.out.println("나이>>");
            age = Integer.parseInt(in.nextLine());
        }catch (NumberFormatException e){
            System.out.println("오류 발생 = "+ e.getMessage());
            return;
        }finally {
            System.out.printf("나이 = %d세\n",age);
        }
    }

    public static void main(String[] args) {
        System.out.println("main method start!");
        input();
        System.out.println("main method end!");
    }
}
