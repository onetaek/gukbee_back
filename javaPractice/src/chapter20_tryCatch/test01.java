package chapter20_tryCatch;



public class test01 {
    public static void main(String[] args) {
        //예외 클래스 의 인스턴스응 생성하여 throw응 통해 직접 예외를 생성시킬 수 있음
        try{
            Exception e = new Exception("고의 예외");//예외 클래스의 인스턴스 생성, 생성자에 예외문구 전달
            throw e;// 예외를 던짐
            //throw ne Exception("괴의 예외"); 위 두줄을 축약해서 이렇게 쓸 수 있음
        }
        catch(Exception e){
            System.out.println("예외 발생");
            System.out.println(e.getMessage());//생성자에게 전달한 예외 문구 출력
        }
    }
}
