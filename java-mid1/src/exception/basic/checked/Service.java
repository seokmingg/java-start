package exception.basic.checked;

public class Service {

    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     */
    public void callCatch(){

        try {
            client.call();

        } catch (MyCheckedException e) {
            //예외처리로직
            System.out.println("예외처리: " + e.getMessage());

        }
        System.out.println("정상흐름");

    }


    /**
     * 체크 예외를 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 필수로 throws 선언을 해야한다.
     */

    public void cathhThrow() throws MyCheckedException {

        client.call();

    }



}
