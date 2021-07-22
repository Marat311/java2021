package Replits;

import java.util.Scanner;

public class FindingMAX {
    public static void main(String[] args) {
        /*
        Given the array words find and print the word with the largest length.
        Assume that there are no 2 words with longest length

Example:

words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa
         */
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }


        String str1 = words[0];
        for(int i = 0; i<words.length; i++){
            String str = words[i];
            if(str1.length()<str.length()) {

                str1=str;
            }
            }
        System.out.println(str1);
        input.close();
        }



    }

