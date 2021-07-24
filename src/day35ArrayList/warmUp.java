package day35ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class warmUp {
    public static void main(String[] args) {

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MMMM/dd, EEEE");
        LocalDate [] days ={LocalDate.of(2020, 11, 25),
                LocalDate.of(2020, 07, 06),
                LocalDate.of(2008, 07, 07),
                LocalDate.of(2020, 03, 07),
                LocalDate.of(2020, 04, 10),
                LocalDate.of(2000, 05, 15),
                LocalDate.of(2005, 05, 25),
                LocalDate.of(2020, 12, 05),
                LocalDate.of(2010, 11, 12),
                LocalDate.of(2020, 11, 02)
        };

        for(LocalDate each:days){
            System.out.println(each.format(DF));
        }

        LocalDate[] dates = new LocalDate[10];

        for(int i = 0; i<dates.length; i++){
            dates[i]=LocalDate.now().plusDays(i);
        }
        System.out.println(Arrays.toString(dates));

        for(LocalDate each  : dates ){
            System.out.println(each.format( DateTimeFormatter.ofPattern("MMMM/dd/yy, EEEE")) );
        }

    }
}
