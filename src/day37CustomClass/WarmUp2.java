package day37CustomClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.DataFormatException;

public class WarmUp2 {
    /*
    task01:
            1. create an Array of string called country names

            2. write a program that can remove all the country names that
            have length of 10 or greater

    task02:
            1. create an Array of LocalDate
            2. write a program that can remove all the dates before August-15-2016

    task03:
            1. create an Array of String called jobTitles
            2. write a program that only keeps the jobTitles that are: SDET and QA
     */
    public static void main(String[] args) {
        String [] countryNames ={"United States", "Russia", "Uzbekistan", "Poland", "Ukraine", "Italy", "Portugal", "Greece", "United Kingdom"};
        ArrayList<String> names = new ArrayList<>(Arrays.asList(countryNames));
        names.removeIf(p -> p.length()>10);
        System.out.println(names);

        System.out.println("--------------------------------");
        DateTimeFormatter DayF = DateTimeFormatter.ofPattern("MMMM-dd-YYYY");


        ArrayList<LocalDate> list = new ArrayList<>(Arrays.asList(LocalDate.now()));




    }
}
