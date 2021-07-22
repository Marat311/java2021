package day19_Loops;

import java.util.Scanner;

public class maximumNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int max = -2147483648;  //whatever user enters it will be larger than -2147483648

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number");
            int n =s.nextInt();

            if (n>max){// if the user entered number is greater then the max value
                max=n; //then user entered number will be assigned to max variable
            }
        }
        System.out.println("max: "+max);

        
    }
}
