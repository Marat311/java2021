package day24;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //split

        String sentence = "I love Java programming language";

        String words[]=sentence.split(" ");

        for (int i = words.length-1, j=0; i >=0 ; i--, j++) {
            System.out.print(words[i]+" ");
        }
        System.out.println("===========");

        String email = "marina@gmail.com";

        String [] arrays = email.split("@");
        String firstName =arrays[0];
        //or String arrays = email.split("@")[0];
        System.out.println(firstName);

        System.out.println("====================");

        //toCharArray()

        String str = "ABCDE";
        char [] characters = str.toCharArray();
        System.out.println(Arrays.toString(characters));

    }
}
