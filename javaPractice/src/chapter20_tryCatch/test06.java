package chapter20_tryCatch;

class IDFormatException extends Exception{
    public IDFormatException(String message) {
        super(message);
    }
}
public class test06 {

    private String userID;

    public String getUserID(){
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException{
        if (userID == null){
            throw new IDFormatException("아이디 값은 비워 둘 수 없습니다.");
        } else if(userID.length() <8||userID.length()>20){
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 하세요");
        }
        this.userID = userID;
    }

    public static void main(String[] args) {
        test06 test = new test06();
        String userID = null;
        try{
            test.setUserID(userID);
        }catch (IDFormatException e){
            System.out.println(e.getMessage());
        }


        userID="1234567";
        try{
            test.setUserID(userID);
        }catch (IDFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
