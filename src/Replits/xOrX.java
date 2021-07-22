package Replits;

import java.util.Locale;
import java.util.Scanner;

public class xOrX {

    public static void main(String[] args) {

       // Scanner scan = new Scanner(System.in);
        String word = "XJavax";

        String result = "";

        if(word.contains("x") || word.contains("X")) {
            if (word.startsWith("x") || word.startsWith("X")) {
                result = word.substring(1);
            }
            if (word.endsWith("X") || word.endsWith("x")) {
                result = word.substring(0, word.length() - 1);
            }
        }else{
            result=word;
        }







        System.out.println(result);


    }
}
