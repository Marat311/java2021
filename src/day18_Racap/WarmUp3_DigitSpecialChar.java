package day18_Racap;

import java.util.Scanner;

public class WarmUp3_DigitSpecialChar {
    public static void main(String[] args) {

        /*
        3. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = s.next();

        char f= word.charAt(0);

        if(f>='0' && f<='9'){
            System.out.println("First character is a digit");
        }else if(f>='a' && f<='z'){
            System.out.println("First character is lowercase letter");
        }else if(f>='A' && f<='Z'){
            System.out.println("First character is uppercase letter");

        }else{
            System.out.println("First character is special character");
        }

        s.close();


    }
}
