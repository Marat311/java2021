package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {


        DateTimeFormatter DF= DateTimeFormatter.ofPattern("MMMM/dd/YYYY EEEE"); //July/22/2021 Thursday
        DateTimeFormatter DF1= DateTimeFormatter.ofPattern("MMM/dd/YYYY E"); // Jul/22/2021 Thu
        DateTimeFormatter DF2= DateTimeFormatter.ofPattern("MM/dd/YY");   //  07/22/21

        LocalDate today = LocalDate.now();
        System.out.println(today);

        String now=today.format(DF);
        System.out.println(now);
        System.out.println(today.format(DF1));
        System.out.println(today.format(DF2));

        System.out.println("=============================");

        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm");  // 12:09
        DateTimeFormatter TF1 = DateTimeFormatter.ofPattern("hh:mm:ss"); //12:11:40
        DateTimeFormatter TF2 = DateTimeFormatter.ofPattern("h:mm a"); //05:45 PM  (add AM or PM)
        LocalTime currentTime = LocalTime.now();  // 12:09:57.613

        System.out.println(currentTime);
        System.out.println(currentTime.format(TF));
        System.out.println(currentTime.format(TF2));


        LocalTime time1 = LocalTime.of(17,45);
        System.out.println(time1);
        System.out.println(time1.format(TF2));

        System.out.println("----------------------------");

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/YYYY ");
        LocalDateTime a = LocalDateTime.now();
        System.out.println(now);
        System.out.println(a.format(DTF));

    }
}
