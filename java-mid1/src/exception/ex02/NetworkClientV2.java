package exception.ex02;



public class NetworkClientV2 {

    private final String address;

    public boolean connectError;
    public boolean sendError;


    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2{

        if (connectError) {
            //연결실패
            throw new NetworkClientExceptionV2("connectError",address + "서버 연결 실패");
        }

        //연결성공
        System.out.println(address + "서버 연결 성공");


    }

    public void send(String data) throws NetworkClientExceptionV2{

        if (sendError) {
            //전송실패
            throw new NetworkClientExceptionV2("sendError",address + "서버 데이터 전송 실패: " + data);

        }
        //전송선공
        System.out.println(address + "서버 데이터 전송 성공: " + data);


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
