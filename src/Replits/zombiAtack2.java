package Replits;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class zombiAtack2 {
    public static void main(String[] args) {
        /*
        An array inhabitants represents cities and their respective populations. For example, the following arrays shows 8 cities and their respective populations:

[3, 6, 0, 4, 3, 2, 7, 1]

Some cities have a population of 0 due to a pandemic zombie disease that is wiping out the human lives. After each day, every city will lose half of its population.

Write a program to loop though each city population and make it lose half of its population until all cities have no humans left. Make updates to each element in the array And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
Write the program in a way that it will handle any number of people in cities, above was just an example

Hint:

Below expression will print array in this format:

System.out.println(Arrays.toString(inhabitants)));

[3, 6, 0, 4, 3, 2, 7, 1]
         */
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {10, 5, 0, 0, 4, 7, 6, 2};


   /*     int days = 0;
        int max = 0; //7

        for (int i = 0; i < inhabitants.length; i++) { //3,6,0,4,3,2,7,1
            if (max < inhabitants[i]) {
                max = inhabitants[i];

            }
        }

        int j = 0;
        //    max/=2;
        int count=0;

        System.out.println("Day " + days + " " + Arrays.toString(inhabitants));

       while (inhabitants[j++]!=0){

           days++;
         for (int i = 0, k = 0; i < inhabitants.length; i++, k++) {
             if(inhabitants[k]>0) {
                 inhabitants[k] = inhabitants[i] / 2;
             }
         }
        System.out.println("Day " + days + " " + Arrays.toString(inhabitants));


     }
        System.out.println("---- EXTINCT ----");



*/


        int days=0;

int max;
do {
    System.out.println("Day " + days + " " + Arrays.toString(inhabitants));
   max=0;
    for (int i = 0; i <inhabitants.length ; i++) {
        inhabitants[i]=inhabitants[i]/2;
        max+=inhabitants[i];
    }
    days++;
}         while (max > 0) ;
        System.out.println("Day " + days + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");

        System.out.println("++++++++++++++++++++++++");


    }


}