package chapter20_tryCatch;


import java.util.Scanner;

public class problem04 {

    String memberID = "abc";
    String password = "1234";
    Scanner input = new Scanner(System.in);

    private boolean confirmLogin(String memberID, String password) throws NewLoginException {
       if(this.memberID.equals(memberID)&&this.password.equals(password)){
           System.out.println("로그인 되었습니다.");
             return true;
       }else{
           throw new NewLoginException("로그인 정보가 올바르지 않습니다.");
           }
       }





    public void Login() {
        boolean answer;
        String memberID, password;

        System.out.println("로그인을 진행 합니다.");

        do{
            System.out.print("아이디를 입력하십시요");
            memberID = input.nextLine();
            System.out.print("비밀번호를 입력하십시요");
            password = input.nextLine();

            try{
                answer= confirmLogin(memberID,password);
            } catch(NewLoginException e){
                System.out.println(e.getMessage());
                answer=false;
            }
        }while (!answer);


    }

    public static void main(String[] args){
        problem04 p = new problem04();
        p.Login();
    }
}

class NewLoginException extends Exception{
    public NewLoginException(String message) {
        super(message);
    }

    //로그파일로 남기기

}
