package chapter26_java_util_package;

import java.io.FileInputStream;
import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		try {
			String path = "./src/chapter26_java_util_package/sample_file/sample.txt";
			FileInputStream fs = new FileInputStream(path);
			Scanner sc = new Scanner(fs);
			while(sc.hasNext()) {//값이 존재 하면 계속해서 반복
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
