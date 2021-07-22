package day22;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
String answer="";
        do {
            System.out.println("Enter two numbers:");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            System.out.println("Addition: " + (n1 + n2));
            System.out.println("Do you want to continue?");
            answer = scan.next().toLowerCase();


            while (!(answer.equals("yes") || answer.equals("no"))){ //to make shure that user will enter yes or no
                System.out.println("Invalid answer, Please re-enter!");
                System.out.println("Do you want to continue?");
                answer= scan.next().toLowerCase();
            }
        }while (answer.equals("yes"));
        scan.close();

    }



}
