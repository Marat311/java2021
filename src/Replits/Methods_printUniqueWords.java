package Replits;

import java.util.Scanner;

public class Methods_printUniqueWords {
    /*
   Complete the void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.

Example:

input:[java, code, python, code, rust, code, rust]

output:
java
python
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE

        for(String each:words) {
            int count = 0;

            for (String word : words) {

                if (word.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }
    }
}