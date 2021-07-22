package day17_StringContinue;

import java.util.Scanner;

public class WarmUp4_Login {
    /*
    4. Ask the user to enter username and password, and username can be typed either in lowercase or uppercase. Still,
    the password must be exact in order to log in. write a program to check if the user entered username
    & passwords match with the saved username & password in the database. If it's, then print "Logged in successfully".
    Otherwise, print "Invalid username or password."
        Assume that your username & password in the database are:
                                Cybertek@gmail.com
                                Cybertek123
        Ex:
            username: CYBERTEK@Gmail.com
            password: Cybertek123
            output:
                Logged in successfully
     */
    public static void main(String[] args) {
        String correctUserName= "CybertekSchool@gmail.com";
        String correctPassword = "Cybertek123";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your username");
        String userName = s.next();

        System.out.println("Enter your password");
        String password = s.next();

        boolean canLogin = userName.equalsIgnoreCase(correctUserName) && password.equals(correctPassword);

        if(canLogin){
            System.out.println("Logged in successfully");
        }else{
            System.out.println("Invalid username or password");
        }

    }

}
