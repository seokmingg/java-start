package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {


        LocalDateTime nowDt = LocalDateTime.now();
        System.out.println("Current DateTime: " + nowDt);
        LocalDateTime ofDt = LocalDateTime.of(2020, 5, 15, 21, 30, 30);
        System.out.println("지정날짜시간: " + ofDt);


        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();

        System.out.println("날짜: " + localDate);
        System.out.println("시간: " + localTime);



        //날짜와 시간 합체
        LocalDateTime combineDt = LocalDateTime.of(localDate, localTime);
        System.out.println("합체: " + combineDt);



        //계산 (불변 반환값받아야함)
        LocalDateTime ofDtPlus = ofDt.plusDays(10).plusHours(5);
        System.out.println("10일 5시간 후: " + ofDtPlus);
    }




}
