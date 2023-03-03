package chapter20_tryCatch;

public class problem02 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        System.out.println("arr[0]= "+arr[0]);
        System.out.println("arr[1]= "+arr[1]);
        System.out.println("arr[2]= "+arr[2]);
        try{
            System.out.println("arr[3]= "+arr[3]);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("arr 출력완료");
        }
        System.out.println("구문 밖 문장 수행");
    }
}
