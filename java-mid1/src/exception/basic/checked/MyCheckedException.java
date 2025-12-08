package exception.basic.checked;

/**
 * 사용자 정의 체크 예외 클래스
 * exception을 상속받은 예외는 체크 예외가 된다.
 */
public class MyCheckedException extends  Exception {

    public MyCheckedException(String message) {
        super(message);
    }
}
