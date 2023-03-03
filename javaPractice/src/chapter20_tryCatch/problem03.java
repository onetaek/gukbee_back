package chapter20_tryCatch;


class MyScore{
    private int score;
    public void setScore(int s) throws MyException{
        if(s<0){
            throw new MyException("점수는 음수가 될 수 없습니다.");
        }else{
            this.score =s;
        }
    }
}

public class problem03 {
    public static void main(String[] args) {
        MyScore obj = new MyScore();
        try{
            obj.setScore(-10);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception{
    public MyException() {}

    public MyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
