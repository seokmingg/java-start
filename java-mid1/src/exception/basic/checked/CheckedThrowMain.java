package exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        System.out.println("에러전실행");
        service.cathhThrow();
        System.out.println("정상종료");
    }
}
