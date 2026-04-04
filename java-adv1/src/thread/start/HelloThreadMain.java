package thread.start;

public class HelloThreadMain {


    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " Main start");


        HelloThread helloThread = new HelloThread();

        System.out.println(Thread.currentThread().getName() + "   start호출전");
        //run() 메서드를 직접 호출하면 새로운 스레드가 생성되지 않고, 현재 스레드에서 run() 메서드가 실행됩니다.
        //helloThread.run(); // 이렇게 하면 새로운 스레드가 생성되지 않고, 현재 스레드에서 run() 메서드가 실행됩니다.
        //start() 메서드를 호출하면 새로운 스레드가 생성되고, run() 메서드가 새로운 스레드에서 실행됩니다.
        //그러니까 start메서드로 새로운쓰레드에서 run을시키는거임
        helloThread.start();
        System.out.println(Thread.currentThread().getName() + "  start 호출후");

        System.out.println(Thread.currentThread().getName() + " Main end");


    }
}
