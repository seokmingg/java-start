package exception.ex01;

public class NetworkClientV1 {

    private final String address;

    public boolean connectError;
    public boolean sendError;


    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {

        if (connectError) {
            //연결실패
            System.out.println(address + "서버 연결 실패");
            return "connectError";
        }


        //연결성공
        System.out.println(address + "서버 연결 성공");

        return "success";
    }

    public String send(String data) {

        if (sendError) {
            //전송실패
            System.out.println(address + "서버 데이터 전송 실패: " + data);
            return "sendError";
        }
        //전송선공
        System.out.println(address + "서버 데이터 전송 성공: " + data);
        return "success";


    }


    public void disconnect() {
        //연결해제 성공
        System.out.println(address + "서버 연결 해제 성공");
    }


    public void initError(String data){
        if(data.contains("error1")){
            this.connectError = true;
        }
        if(data.contains("error2")){
            this.sendError = true;
        }

    }



}
