package day23;

import java.util.Scanner;

public class AvarageNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int [] numbers = new int[s.nextInt()];
         int sum = 0;
        for (int i = 0; i <numbers.length ; i++) {  //used fo rgetting the user inputs and store into the array
            System.out.println("Enter a number");
            numbers[i]=s.nextInt();  //assigned user input to the indexes of the array

            sum+=numbers[i]; //returns the sum of elements in the array

        }
        System.out.println("sum = " + sum);
        double average = (double) sum/numbers.length;
        System.out.println("average = " + average);

        s.close();

    }
}
