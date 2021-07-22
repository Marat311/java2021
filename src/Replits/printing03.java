package Replits;

import java.util.Scanner;

public class printing03 {
    public static void main(String[] args) {
        /*
        The code provided in your main method will take in six Strings and save them into an array arr.

Print out the 3 neighboring items of the array in one line until the last line each line should contain 3 neighboring items of array element as displayed below

Example:

arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda"]

Output:
apple, banana, kiwi
banana, kiwi, grape
kiwi, grape, milk
grape, milk, soda
         */
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        // DO NOT TOUCH ABOVE
        for(int i = 0; i<arr.length-1; i++){ //"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"

            System.out.println(  arr[i]+", "+arr[i+1]+", "+arr[i+2]);



        }
        input.close();




    }
}
