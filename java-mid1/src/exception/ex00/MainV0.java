package exception.ex00;

import java.util.Scanner;

public class MainV0 {

    public static void main(String[] args) {

        NetworkServiceV0 networkService = new NetworkServiceV0();

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
