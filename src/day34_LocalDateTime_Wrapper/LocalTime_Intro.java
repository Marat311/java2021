package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTime_Intro {

    public static void main(String[] args) {
        String s = "sasa";
        char ch = s.charAt(s.length()/2);

        System.out.println(ch);

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime breakTime = now.plusMinutes(15);
        System.out.println(breakTime);

        LocalTime quizDue = breakTime.plusMinutes(20);

    }

}
