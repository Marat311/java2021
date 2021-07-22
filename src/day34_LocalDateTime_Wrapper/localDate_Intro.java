package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class localDate_Intro {

    public static void main(String[] args) {


        LocalDate eid = LocalDate.of(2021, 07, 31);
        System.out.println(eid);


        LocalDate today = LocalDate.now();
        System.out.println(today);


    }
}
