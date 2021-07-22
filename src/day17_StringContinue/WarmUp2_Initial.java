package day17_StringContinue;

import java.util.Locale;
import java.util.Scanner;

public class WarmUp2_Initial {
  /*  write a program that can return the initials of the user
    ex:
    cybertek
            school
    output:
    C.S

   */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = s.next();

        System.out.println("Enter your last name:");
        String lastName = s.next();

      //1.  String initial = firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase();

      //2.  String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        //initial=initial.toUpperCase();

       //3.
        String initial = firstName.toUpperCase().charAt(0)+"."+lastName.toUpperCase().charAt(0);
        //this 3 solutions is all work

        System.out.println(initial);

    s.close();

    }
}
