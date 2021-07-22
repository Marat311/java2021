package day17_StringContinue;

import java.util.Scanner;

public class WarmUp3 {
    /*
    3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter word:");

        String word = s.nextLine();

        String first = word.substring(0,1);
        String last = word.substring(word.length()-1);

        if(first.equalsIgnoreCase(last)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }


    }
}
