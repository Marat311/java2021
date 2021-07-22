package Replits;

import java.util.Scanner;

public class PrintFirstAndLastChar {
    public static void main(String[] args) {
/*
Given a String array words, iterate through each word and print first and
last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print:
ho
wy
by
ae
ne
 */
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String eachWord="";

        for(int i = 0; i<words.length; i++){
            eachWord = words[i];

            System.out.println(eachWord.charAt(0)+""+eachWord.charAt(eachWord.length()-1));
        }

       input.close();
    }
}
