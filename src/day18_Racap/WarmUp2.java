package day18_Racap;

import java.util.Scanner;

public class WarmUp2 {
    /*
    2. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 = s.next();
        String word2 = s.next();


        if(word1.substring(word1.length()-1).equalsIgnoreCase(""+word2.charAt(0))){

        // if(word1.charAt(word1.length()-1)==word2.charAt(0)){
            System.out.println(word1+word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }
        s.close();



    }
}
