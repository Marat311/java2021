package day19_Loops;

import java.util.Scanner;

public class firLoopPractice3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            System.out.println("Push up " + i);

        }

        System.out.println("============");


        for (int i = 1; i <=8 ; i++) { //i=1,2,3,4,5,6,7,8

            System.out.println("\t\t* * * * * *");
        }
        System.out.println("____________________________________");

        System.out.println("* * * * * *");
        for (int i = 1; i <=8 ; i++) {
            System.out.println("*         *");
        }
        System.out.println("* * * * * *");

        System.out.println("________________________________");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int r = 0;
        for (int i = 1; i <=num; i++) {
            r+=i;
        }
        System.out.println(r); //5050
        scan.close();

    }




    }

