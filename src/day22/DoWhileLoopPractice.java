package day22;

import java.util.Scanner;

public class DoWhileLoopPractice {
    public static void main(String[] args) {

        int i =0;
        int sumOfEven=0;
        int sumOfOdd=0;
        do{

            if(i%2==0){
                sumOfEven+=i;
            }else{
                sumOfOdd+=i;
            }


        }while (i++<10); //i: 012345678910

        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);

        System.out.println("=====================");

        String userName = "JohnJames";
        String password = "John123";
        Scanner s=new Scanner(System.in);
        String name;
        String pass;
        do{           //do while loop
            System.out.println("Enter your user name:");
            name = s.next();
            System.out.println("Enter your password");
            pass = s.next();
        }while (!(name.equals(userName) && pass.equals(password)));
        System.out.println("Logged in");

                     //while loop
        int attempts=1;
        while(!(name.equals(userName) && pass.equals(password))){ //while the credentials are incorrect
            System.out.println("Enter your user name:");
            name = s.next();
            System.out.println("Enter your password");
            pass = s.next();
        //or attempts ++; but at the biginning attempts should be 0

            if(attempts++==3){
                System.out.println("Your account is blocked");
            }


        }

    }
}
