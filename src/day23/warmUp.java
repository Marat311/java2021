package day23;

import java.util.Scanner;

public class warmUp {
    public static void main(String[] args) {
        /*
        1. Write a program that can find the frequency of any given character from a string
            Ex:
                str = "aabcccd";

                input: 'c'
                output: 3

                input: 'e'
                output: 0
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        System.out.println("Enter character:");
        char character = scan.next().charAt(0);

        int count=0; //count frequency of character
        for (int i =0; i<word.length(); i++) {
            char each = word.charAt(i); //each character by given string word

            if (each == character) { //if each character in str  is matching with ch
                count++; //count increase the frequency of ch by 1

            }
        }
        System.out.println(count);

        System.out.println("===========================");



    }
}
