package thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileFlagMain {

    public static void main(String[] args) {

        MyTask task=new MyTask();
        Thread t = new Thread(task, "work");
        log("runFlag= "+ task.runFlag);
        t.start();

        sleep(1000);
        log("runFlag를 false로 변경시도");
        task.runFlag=false;
        System.out.println("task = " + task.runFlag);
        log("Main졷ㅇ료");
    }



    static class  MyTask implements Runnable{
        //boolean runFlag =true;
        volatile boolean runFlag=true;
        @Override
        public void run() {
            log("task 시작");
            while (runFlag){
                //runFlag가 false로변하면 탈출

            }
            log("task종료");
        }
    }
}
