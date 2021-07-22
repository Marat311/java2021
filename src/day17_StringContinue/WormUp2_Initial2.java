package day17_StringContinue;

import java.util.Scanner;

public class WormUp2_Initial2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = s.nextLine();

        String firstName = fullName.substring(0, fullName.indexOf(" "));

        String lastName = fullName.substring(fullName.indexOf(" ")+1);

        String initial = firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase();


        System.out.println(initial);




    }


}
