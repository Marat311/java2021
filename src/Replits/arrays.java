package Replits;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        /*
        The code provided in your main method will take in five Strings and save them into an array called arr.
         Print out the first three letter of each element on seperate lines. You can assume that every element
         of arr is at least 3 letters long.

Example:
arr -> ["hello", "how", "are", "you", "doing"]

Output:
hel
how
are
you
doi
         */


        String[] arr = {"hello", "how", "are", "you", "doing"};
             //            0        1      2     3        4
        //leave above alone!  write your code below.
        //Create another loop for your solution!
        String result="";

        for(int i =0; i <arr.length; i++){

            result= arr[i].substring(0,3);



            System.out.println(result);
        }




    }
}