package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDatePractice {
    public static void main(String[] args) {


        String[] students = {"Ahmet", "Andrei", "Ivan", "Igor", "Kaddir"};
        LocalDate[] DoB= {LocalDate.of(1981, 10, 10),
                LocalDate.of(1981, 10, 12),
                LocalDate.of(1981, 11, 10),
                LocalDate.of(1988, 5, 15),
                LocalDate.of(1990, 10, 10), };

        LocalDate youngest = DoB[0];
        int index = 0;

        for(int i = 0; i<students.length; i++){

            if(DoB[i].isAfter(youngest)){
                youngest=DoB[i];
                index=i;
            }

            if(DoB[i].isLeapYear()){
                System.out.println(students[i]);
            }

        }
        System.out.println("youngest = " + youngest);
        System.out.println(students[index]);

        System.out.println("++++++++++++++++++++");

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("EEEE MM/dd/YYYY");

        for(int i = 0; i<students.length;i++){

            System.out.println(students[i]+" "+DoB[i].format(DF));
        }
    }
}
