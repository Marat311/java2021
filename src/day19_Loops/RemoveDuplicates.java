package day19_Loops;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        //String word = new Scanner(System.in).next();
String word = "aabbaaaccbbaacc";
        String result = "";

        for (int i = 0; i <=word.length()-1 ; i++) {

            if(!result.contains(""+word.charAt(i))){ //if the character is not contained in the result yet
                result+=word.charAt(i); //then add the character to the result
            }

        }
        System.out.println(result);



    }
}
