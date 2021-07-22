package day16_StringMethods;

import java.util.Scanner;

public class warmUp4 {
    public static void main(String[] args) {
        /*
        4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three words");
        String word1= scan.next();
        String word2= scan.next();
        String word3= scan.next();

        //a=b && a=c, ==> b=c ==> a=b=c
        if(word1.length()==word2.length()&& word1.length()==word3.length()){
            System.out.println("All words same length");
        }else if(word1.length()!=word2.length()
                && word2.length()!=word3.length()
                && word3.length()!=word1.length()){
            System.out.println("Not Same nor Different lengths");
        }else{
            System.out.println("All different length");
        }

scan.close();

    }
}
