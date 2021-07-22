package day19_Loops;

import java.util.Scanner;

public class minimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 2147483647; //any user entered number will be less then 2147483647

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int n = scan.nextInt(); //100 300 50 400 5

            if(n<min){ //if user entered a smaller number
                min=n; //we will only replace min value if the user entered number smaller
            }

        }
        System.out.println(min);


    }
}
