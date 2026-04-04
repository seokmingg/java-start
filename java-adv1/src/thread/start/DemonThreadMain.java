package thread.start;

public class DemonThreadMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " Main start");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(false); // 데몬 스레드로 여부 이게 트루면 데몬스레드되는거고 false면 일반스레드되는거임
        daemonThread.start();

        System.out.println(Thread.currentThread().getName() + " Main end");

    }


    static class DaemonThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " DaemonThread run");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " DaemonThread run end");

        }
    }
}
