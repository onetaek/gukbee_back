package chapter20_tryCatch;
//예외 던지기는 1)반드시 직접 예외 처리를 하거나 2)자신도 예외를 던져야 함.

public class test02 {
    public static void methodA() throws Exception {
        methodB();
    }

    public static void methodB() throws Exception {
        methodC();
//    try {
//        methodC();
//    }catch (Exception e){
//        System.out.println("methodB에서 처리");
//    }
    }

    public static void methodC() throws Exception {
        Exception e = new Exception();
        throw e;
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("메인에서 처리");
        }
    }
}

