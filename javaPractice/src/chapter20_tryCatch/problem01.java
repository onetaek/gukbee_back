package chapter20_tryCatch;

public class problem01 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

        try {
            for (int i = 0; i < 11; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("정상종료");
    }
}

