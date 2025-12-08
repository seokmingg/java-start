package exception.ex00;

public class NetworkClientV0 {

    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        //연결성공
        System.out.println(address + "서버 연결 성공");

        return "success ";
    }

    public String send(String data) {

        //전송선공
        System.out.println(address + "서버 데이터 전송 성공: " + data);
        return "success ";


    }


    public void disconnect() {
        //연결해제 성공
        System.out.println(address + "서버 연결 해제 성공");
    }


}
