package day23;

import java.util.Scanner;

public class ArraysOfMonths {
    public static void main(String[] args) {

        String [] months= {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println("Enter a number: ");
        int n = new Scanner(System.in).nextInt(); //ONLY can provide number 1-12 because Arrays size are FIXED!!!

        if(n>=1 && n<=12) {
            System.out.println(months[n - 1]); // print the month that provided by number.
        }else{
            System.out.println("Invalid number");
        }


    }
}
