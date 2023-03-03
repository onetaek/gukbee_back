package chapter20_tryCatch;

import java.io.*;
import java.util.Date;

public class test03 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        System.out.println(1);
        System.out.println(2);
        String home = System.getProperty("user.home");
        String path = home + File.separator+"Desktop"+ File.separator+"intelliJ project"+ File.separator+"class_after_11_10"+ File.separator+"src"+ File.separator+"class_12_01"+ File.separator+"output_file"+ File.separator+"error.log";
        try{
            fos= new FileOutputStream(path,true);
            ps = new PrintStream(fos);
            System.setErr(ps);

            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch(Exception e){
            System.err.println("----------------------");
            System.err.println("에러발생시간"+new Date());
            e.printStackTrace(System.err);
            System.err.println("에러 메시지"+e.getMessage());
            System.err.println("----------------------");


        }
        System.out.println(6);
    }
}