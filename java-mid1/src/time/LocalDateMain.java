package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {

        LocalDate nowDate=LocalDate.now();
        System.out.println("Current Date: " + nowDate);
        LocalDate ofDate=LocalDate.of(2020, 5, 15);
        System.out.println("지정날짜: " + ofDate);

        //계산 (불변 반환값받아야함)
        LocalDate ofDatePlus = ofDate.plusDays(10);
        System.out.println("10일 후: " + ofDatePlus);



    }
}
