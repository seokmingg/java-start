package exception.ex02;

import java.util.Scanner;

public class MainV2 {

    public static void main(String[] args)  {

//        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
        NetworkServiceV2_2 networkService = new NetworkServiceV2_2();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 메시지 입력 (종료: exit): ");
            String message = sc.nextLine();

            if (message.equalsIgnoreCase("exit")) {
                System.out.println("프로그램 종료 실행");
                break;
            }

            networkService.sendMessage(message);
            System.out.println();
        }
        System.out.println("프로그램 종료");



    }
}
