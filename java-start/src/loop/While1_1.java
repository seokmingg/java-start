package loop;

public class While1_1 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 1;
        int result=0;
        while (count < 11) {
            count++;

            result=result+sum;
            sum++;

            System.out.println("count = " + count);
            System.out.println("result = " + result);
//            count++;

        }
    }
}
