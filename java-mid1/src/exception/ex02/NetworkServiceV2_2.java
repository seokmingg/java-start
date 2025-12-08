package exception.ex02;



public class NetworkServiceV2_2 {

    public void  sendMessage(String data)  {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류로그]: " + e.getErrorCode()+"메세지  : "+ e.getMessage()   );
        } finally {
            client.disconnect();

        }


    }
}
