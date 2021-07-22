package day15_String;

import java.util.Locale;
import java.util.Scanner;

public class NameFormatting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");

        String firstName = scan.nextLine().trim(); //mUHTAR
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        System.out.println(firstName);
    }


}
