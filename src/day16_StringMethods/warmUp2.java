package day16_StringMethods;

import java.util.Scanner;

public class warmUp2 {
    public static void main(String[] args) {
        /*
        2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");

        String
                 word1 = scan.next(), //Apple
                 word2 = scan.next(); //Banana

        String result="";
        if(word1.length()>=2 && word2.length()>=2){
            result = word1.substring(1)+word2.substring(1);
        }else{
            result= "Too short";
        }


        System.out.println("result = " + result);




    }
}
