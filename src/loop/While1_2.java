package loop;

public class While1_2 {
    public static void main(String[] args) {
        int i = 1;      // 초기값
        int sum = 0;    // 합계를 저장할 변수

        while (i <= 10) {   // 조건식
            sum += i;       // sum = sum + i
            i++;            // i를 1씩 증가


            System.out.println("count = " + i);
            System.out.println("result = " + sum);
//            count++;
        }


    }
}
