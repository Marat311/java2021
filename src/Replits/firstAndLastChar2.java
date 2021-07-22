package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class firstAndLastChar2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        String [] res = new String[words.length];

        for(int i = 0; i<words.length; i++) {

            res[i] = words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1);
        }
        System.out.println(Arrays.toString(res));

        input.close();
    }
}
