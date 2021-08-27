package InterviewQuestions.unitTest3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {


      double n = add(3.4);
      n+=add("dual");
      n+=add(Integer.parseInt("100"));
      n+=add(11341L);
      n+=add(Float.parseFloat("50.8"));
        System.out.println(n);

        LocalTime time = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("h:mm a");
        System.out.println(time.plusHours(2).format(f));
        System.out.println(time);
        System.out.println(time.format(f));

        ArrayList<String> w = new ArrayList<>(Arrays.asList("during", "storm","rain", "fell", "season", "cloudy", "safe"));
        ArrayList<Integer> length = new ArrayList<>();
        for(String word: w){
        //    length.add(word.length);
        }


    }

    public static int add(int n){
        return 5;
    }

    public static double add(double d){
        return 2.5;
    }
    public static long add(String s){
        return 10;
    }

}
