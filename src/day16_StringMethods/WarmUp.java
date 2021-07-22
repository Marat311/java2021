package day16_StringMethods;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
/*
1. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");

        String word = scan.next();
        String result = "";

        if(word.length()==0){ //multi branch if statement
            result= "String is empty";
        }else if (word.length()>3){
            result= word.substring(word.length()-3);
        }else {
            result= word;

        }
        System.out.println("result = " + result);

        // String result = (word.length()==0)? "String is empty":
        // (word.length()>3)?word.substring(word.length()-3):word; //ternary

        scan. close();

    }


}
