package day40CustomClass_Statics.MovieTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String title, country, Genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts= new ArrayList<>();

    public void setInfo(String s, String title, String country, LocalDate releaseDate, String director){
        this.title=title;
        this.country=country;
        this.releaseDate = releaseDate;
        this.director=director;
    }
    public  void addCast(String cast){
     casts.add(cast);
    }
    public  void addCast(String [] casts){
        this.casts.addAll(Arrays.asList(casts));
    }
    public  void addCast(ArrayList<String>casts){
        this.casts.addAll(casts);
    }


    public String toString() {
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MMMM/dd/YYYY EEEE");
        return "Movie{" +
                "title='" + title + '\'' +
                ", country='" + country + '\'' +
                ", releaseDate=" + releaseDate.format(DF) +
                ", total number of casts=" + casts.size() +
                '}';
    }


}
/*

2. Create a class named Movie
    Attributes:
        country (String), title (String), Genre (String), releaseDate (LocalDate), director (String), casts (ArrayList<String>)

    Instance methods
        setInfo(): sets the country, title, release date, and director of the Movie
        addCast(String): adds the given string argument to the arrayList casts
        addCast(String[]): adds the given string array argument to the arrayList casts
        addCast(ArrayLis<String>): adds the given string arraylist argument to the arrayList casts
        toString(): returns the name of country, title, release date, and total number of casts

 */