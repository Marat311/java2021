package day22;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int num1;
        int num2;
        char operator;
        String answer = "";

        while (!answer.equals("no")){  //if the answer does not NO
            System.out.println("Enter two numbers:");
            num1 = s.nextInt();
            num2=s.nextInt();

            System.out.println("Enter a match operator:");
            operator=s.next().charAt(0);

            if(operator=='-'){
                System.out.println("Subtraction: "+(num1-num2));
            }else if(operator=='+'){
                System.out.println("Adition: "+(num1+num2));
            }else if(operator=='*'){
                System.out.println("Multiplication: "+(num1*num2));
            }else if(operator=='/'){
                System.out.println("Division: "+(num1/num2));
            }else {
                System.out.println("Invalid operator");
            }
            System.out.println("Do you want to continue?");
            answer = s.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid Entry, Please re-enter");
                System.out.println("Do you want to continue?");
                answer = s.next().toLowerCase();
            }
        }

    }
}
