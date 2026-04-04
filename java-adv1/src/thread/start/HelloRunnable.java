package thread.start;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from a runnable thread!");
        System.out.println(Thread.currentThread().getName());
    }
}
