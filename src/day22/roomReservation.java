package day22;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class roomReservation {
    public static void main(String[] args) {

        /*
        1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again

2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve and calculates the total price, and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            otherwise return the  total price
         */

        Scanner scan = new Scanner(System.in);
        String answer;
        int totalPrice=0;

        System.out.println("Do you want to reserve a room?");
        answer=scan.nextLine().toLowerCase();

        while(!(answer.equals("yes")|| answer.equals("no"))){
            System.out.println("Invalid entry, please re-enter! \nDo you want to reserve another room?");
            answer=scan.nextLine();
        }

        while (answer.equals("yes")){
            System.out.println("Which bed type do you want to reserve?");  //king, queen, single beds
            String bedType = scan.nextLine().toLowerCase();


        if(bedType.equals("king bed")){
            totalPrice+=120;
        }else if(bedType.equals("queen bed")){
            totalPrice+=100;
        }else if(bedType.equals("single bed")){
            totalPrice+=80;
        }else{
            System.out.println("Invalid room is selected");
        }
            System.out.println("Do you want to reserve another room?");
        answer=scan.nextLine().toLowerCase();


        }
        System.out.println("your total price is: "+totalPrice);



    }
}
