package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class reverseSentence2 {
    public static void main(String[] args) {
        /*
        Given a String variable sentence, write code to get each word
        and assign to String reversed in reverse order.

Example:

sentence -> Java is fun

reversed > fun is Java
         */
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String arr [] = sentence.split(" ");
        System.out.println(Arrays.toString(arr));

        String result = "";
        String arr2 []=new String[arr.length];
        for(int i = arr.length-1, j=0; i>=0; i--, j++){
         arr2[j]=arr[i];
result+=arr2[j]+" ";
        }
        System.out.println(result);


       // System.out.println(Arrays.toString(arr2));
    }
}
