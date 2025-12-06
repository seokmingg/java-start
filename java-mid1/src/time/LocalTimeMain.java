package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {

        LocalTime nowTime= LocalTime.now();
        System.out.println("Current Time: " + nowTime);
        LocalTime ofTime = LocalTime.of(9,30,20);
        System.out.println("ofTime = " + ofTime);



        //계산 (불변 반환값받아야함)
        LocalTime ofTimePlus=ofTime.plusHours(2);
        System.out.println("2시간 후: " + ofTimePlus);

    }


}
