package exception.ex01;


public class NetworkServiceV1_2 {

    public void  sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        String connectResult=client.connect();
//        if(connectResult.equals("connectError")){
        if(isError(connectResult)) {

            System.out.println("네트워크 서비스: 연결에 실패하여 메시지 전송을 중단합니다.");
        }else {

            String sendResult=client.send(data);
            if(sendResult.equals("sendError")) {
                System.out.println("네트워크 서비스: 데이터 전송에 실패하였습니다.");

            }

        }



//        client.connect();
//        client.send(data);
        client.disconnect();


    }

    private boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
