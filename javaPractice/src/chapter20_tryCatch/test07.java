package chapter20_tryCatch;


import java.util.Scanner;

class ExceptionOccur {
    private static final Scanner in = new Scanner(System.in);

    private int kor;

    public void input() throws IndexOutOfBoundsException{
        System.out.print("국어점수: ");
        kor = in.nextInt();

        if(kor<0||kor>100){
            throw new IndexOutOfBoundsException("점수의 배점은 0~100사이입니다.");
        }

    }
    public void output(){
        System.out.printf("국어점수는 %d입니다.", kor);
    }
}

public class test07{
    public static void main(String[] args) {
        ExceptionOccur ex = new ExceptionOccur();
        try{
            ex.input();
            ex.output();
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
//            System.out.println("점수의 배점은 0~100사이입니다.");
        }
    }
}
