package chapter20_tryCatch;

class AgeException extends Exception{
    public AgeException(){}

    public AgeException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println(getMessage());
        super.printStackTrace();
    }
}

public class test05 {
    public static void ticketing (int age) throws AgeException{
        if(age<0){
            throw new AgeException("나이 입력이 잘못되었습니다");

        }
    }

    public static void main(String[] args) {
        int age=-10;
        try{
            ticketing(age);
        }catch(AgeException e){
            e.printStackTrace();
        }
        System.out.println("구문 밖 출력 메시지 및 메인 메서드 끝");
    }
}
