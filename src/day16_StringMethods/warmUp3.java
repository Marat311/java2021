package day16_StringMethods;

import java.util.Scanner;

public class warmUp3 {
    public static void main(String[] args) {
        /*
        3. write a program that asks the user enter a three letter word.
        Check if the middle character of the given word is 'a'.
        In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter tree letter words");
        String word = scan.next();


        String result="";

        if(word.length()==3){  // if the word has 3 character only
            if(word.charAt(1)=='a'){ //if the middle character is equal to 'a'
                result="Cool word";
            }else{
                result="Okay word";
            }
        }else{
            result=(word.length()<3)?"Word is too short" // if the word less then three character
                    :"Word is too long"; // word has more then 3 characters

        }
        System.out.println(result);




    }
}
