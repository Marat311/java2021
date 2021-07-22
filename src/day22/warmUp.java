package day22;

import java.util.Scanner;

public class warmUp {
    /*
    1. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: cybertek
                        password: cybertek12345

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to
                have three attempts to enter correct credentials and if all three attempts are failed,
                 then print "Your account is lucked."
     */


    public static void main(String[] args) {

        String userName = "cybertek";
        String password = "cybertek12345";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String userWord = scan.next();

        System.out.println("Enter your password:");
        String passwordWord = scan.next();

        if(userWord.equalsIgnoreCase(userName) && passwordWord.equals(password)){

            System.out.println("Logged in");

        }else {  //if user provides incorrect username or password

            for (int j = 1; j <= 3; j++) {

                System.out.println("username or password is incorrect, please re-enter");
                System.out.println("Enter your username");
                userWord = scan.next();

                System.out.println("Enter your password:");
                passwordWord = scan.next();

                if (userWord.equalsIgnoreCase(userName) && passwordWord.equals(password)) {
                    System.out.println("Logged in");
                    break;
                } else {
                    System.out.println("Your account is locked.");

                }


            }




        }
        scan.close();

    }
}
