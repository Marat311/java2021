package Office_Hourse;

import java.util.Scanner;

public class while_vs_DoWhile
{
    public static void main(String[] args) {
        /*
Write a program to ask user to "Please Enter your pinCode"

                          if the pinCode is valid print out "Welcome to your account "

                          if it is invalid ask again pinCode to verify it

                          Repeat this steps the user enters correct pinCode
         */

        Scanner scan = new Scanner(System.in);

        int n = 10;

        //do-while
        do{ //if condition is false statement run 1 time
            //statements
            System.out.println("Do-While");
        }while(n<9); //condition

        //while
        while(n<9){ //if condition is false statement not running

            System.out.println("While");
        }



        int secretPinCode = 1234;
        int pinCode;
        int count=0;

        do{

            if(count==3){
                System.out.println("Your account is blocked");
                System.exit(0);
            }

            System.out.println("Please enter your pin code");
            pinCode=scan.nextInt();
            count++;

        }while(pinCode!=secretPinCode);

        System.out.println("Welcome to your account");

    }
}
