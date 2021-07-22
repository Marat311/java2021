package day18_Racap;

import java.util.Scanner;

public class WarmUp1 {
/*
1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code

 */
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = s.next();

    if(word.startsWith("x")){
        System.out.println(word.substring(1));
    }else{
        System.out.println(word);
    }

    s.close();
}

}
