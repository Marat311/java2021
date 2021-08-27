package day40CustomClass_Statics.MovieTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {
        Movie movie = new Movie();
       movie.setInfo("Journey to SDET: Cybertek Batch 23",
               "USA",
               "Adventure, Comedy",
               LocalDate.of(2021,5,17),
               "Kuzzat");
        System.out.println(movie);

        String [] casts = {"mehmet", "Akbar"};
        movie.addCast("Asya");
        movie.addCast(casts);
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Lola", "Lena", "Inna"));
        movie.addCast(names);


    }
}
/*
 create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cybertek Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: May/17/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Mehmet, Akbar and 5 more students from your group

            print the full info of the movie
 */