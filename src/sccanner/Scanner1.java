package sccanner;

import java.util.Scanner;

public class Scanner1 {
      public   static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str= input.nextLine();// 입력을 문자열로 가져온다
        System.out.println("입력한 문자열:"+str);

        System.out.print("정수를 입력하세요:\n");
        int intValue = input.nextInt(); // 입력을 int로 가져옵니다.
        System.out.println("입력한 정수: " + intValue);


        System.out.print("실수를 입력하세요:");
        double doubleValue = input.nextDouble(); // 입력을 double로 가져옵니다.
        System.out.println("입력한 실수: " + doubleValue);




    }
}
