package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTime_Intro {

    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate date = LocalDate.of(2021, 8, 5);
        LocalTime time = LocalTime.of(17,45);

        LocalDateTime now2=LocalDateTime.of(date, time);
        System.out.println(now2);


    }
}
