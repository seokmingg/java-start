package string;

public class LoopStringMain {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        String result1 = "";
        for (int i = 0; i < 100000; i++) {
            result1 += "Hello Java ";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("result = " + result1);
        System.out.println("time = " + (endTime - startTime) + "ms");


    }

}
